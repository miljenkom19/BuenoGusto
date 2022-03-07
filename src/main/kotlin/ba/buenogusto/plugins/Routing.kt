package ba.buenogusto.plugins

import ba.buenogusto.db.DatabaseConnection
import ba.buenogusto.db.DatabaseConnection.user
import ba.buenogusto.entities.ReservationEntity
import ba.buenogusto.entities.ReservationEntity.noOfPeople
import ba.buenogusto.entities.UserEntity
import ba.buenogusto.model.Reservation
import ba.buenogusto.model.UserRequest
import ba.buenogusto.model.UserSession
import io.ktor.routing.*
import io.ktor.application.*
import io.ktor.freemarker.*
import io.ktor.html.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.sessions.*
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.Month
import kotlinx.datetime.toJavaLocalDateTime
import kotlinx.datetime.toLocalDateTime
import kotlinx.html.*
import org.ktorm.dsl.*
import java.time.format.DateTimeFormatter
import javax.xml.crypto.Data

fun Application.configureRouting() {

    val db = DatabaseConnection.database
    var currentUser: UserRequest? = null;
    var currentText = "Prijava"
    var currentLink = "login"

    routing {

        get("/") {
            call.respond(FreeMarkerContent("index.ftl", mapOf("text" to currentText, "link" to currentLink)))
        }

        get("/login") {
            call.respond(FreeMarkerContent("login.ftl", emptyMap))
        }

        post("/login") {
            val params = call.receiveParameters()
            val username = params["username"]
            val password = params["password"]
            val user = UserRequest(username!!, password!!)

            val userCheck = db.from(UserEntity)
                .select()
                .where { UserEntity.username eq user.username }
                .map { it[UserEntity.username] }
                .firstOrNull()

            if (userCheck == null) {
                call.respond(FreeMarkerContent("login_fail.ftl", emptyMap))
                return@post
            } else {
                currentUser = user
                currentText = user.username
                currentLink = "logout"
                call.sessions.set(UserSession(id = "abc", count = 0))

                if (user.username == "admin")
                    call.respondRedirect("/admin")
                else
                    call.respondRedirect("/")
            }
        }

        get("/signup") {
            call.respond(FreeMarkerContent("signup.ftl", emptyMap))
        }

        post("/signup") {
            val params = call.receiveParameters()
            val username = params["username"]
            val password = params["password"]
            val user = UserRequest(username!!, password!!)

            val userCheck = db.from(UserEntity)
                .select()
                .where { UserEntity.username eq user.username }
                .map { it[UserEntity.username] }
                .firstOrNull()

            if (userCheck != null) {
                call.respond(FreeMarkerContent("signup_fail.ftl", emptyMap))
            } else {
                db.insert(UserEntity) {
                    set(it.username, user.username)
                    set(it.password, user.password)
                }

                currentUser = user
                currentText = user.username
                currentLink = "logout"
                call.respondRedirect("/")
            }
        }

        post("/submit") {
            if(currentUser == null) {
                call.respond(FreeMarkerContent("reservation_fail.ftl", emptyMap))
            } else {
                val params = call.receiveParameters()
                val email = params["email"]
                val phone = params["phone"]
                val dateTime = params["dateTime"]!!.toLocalDateTime().toJavaLocalDateTime()
                val noOfPeople = params["noOfPeople"]?.toInt()
                val message = params["message"]

                val userCheck = db.from(UserEntity)
                    .select()
                    .where { UserEntity.username eq currentUser!!.username }
                    .map { it[UserEntity.id] }
                    .firstOrNull()

                db.insert(ReservationEntity) {
                    set(it.user, userCheck)
                    set(it.email, email)
                    set(it.phone, phone)
                    set(it.dateTime, dateTime)
                    set(it.noOfPeople, noOfPeople)
                    set(it.message, message)
                }

                call.respondRedirect("/reservation")
            }
        }

        get("/reservation") {
            call.respond(FreeMarkerContent("reservation.ftl", emptyMap))
        }

        get("/logout") {
            currentUser = null
            currentLink = "login"
            currentText = "Prijava"
            call.respondRedirect("/")
        }

        get("/admin") {
            if (currentUser?.username != "admin") {
                call.respond(HttpStatusCode.Forbidden)
            } else {
                call.respondHtml(HttpStatusCode.OK) {
                    head {
                        title {
                            +"Admin"
                        }
                    }
                    body {
                        a(href = "/") {
                            + "Stranica"
                        }

                        ul {
                            db.from(ReservationEntity).select()
                                .orderBy(ReservationEntity.dateTime.asc())
                                .forEach { res ->
                                    val dateString =
                                        DateTimeFormatter.ISO_LOCAL_DATE.format(res[ReservationEntity.dateTime])
                                    val timeString =
                                        DateTimeFormatter.ISO_LOCAL_TIME.format(res[ReservationEntity.dateTime])

                                    val username = db.from(UserEntity)
                                        .select()
                                        .where { UserEntity.id eq res[ReservationEntity.user]!! }
                                        .map { it[UserEntity.username] }
                                        .firstOrNull()

                                    li { +"User: $username" }
                                    li { +"Date & Time: $dateString $timeString" }
                                    li { +"Email: ${res[ReservationEntity.email]}" }
                                    li { +"Phone: ${res[ReservationEntity.phone]}" }
                                    li { +"Number of People: ${res[noOfPeople]}" }
                                    li { +"Message: ${res[ReservationEntity.message]}" }
                                    p { +"" }
                                }
                        }
                    }
                }
            }
        }
    }
}