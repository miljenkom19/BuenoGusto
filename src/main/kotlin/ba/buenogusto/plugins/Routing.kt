package ba.buenogusto.plugins

import ba.buenogusto.db.DatabaseConnection
import ba.buenogusto.entities.ReservationEntity
import ba.buenogusto.entities.ReservationEntity.noOfPeople
import ba.buenogusto.entities.UserEntity
import ba.buenogusto.entities.UserEntity.username
import ba.buenogusto.model.ReservationRequest
import ba.buenogusto.model.User
import ba.buenogusto.model.UserRequest
import io.ktor.routing.*
import io.ktor.application.*
import io.ktor.freemarker.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.request.*
import org.ktorm.dsl.*

fun Application.configureRouting() {

    val db = DatabaseConnection.database
    var currentUser = UserRequest("Prijava", "login")
    var currentLink = "login"

    routing {

        get("/") {
            call.respond(FreeMarkerContent("index.ftl", mapOf("user" to currentUser, "link" to currentLink)))
        }

        get("/login") {
            call.respond(FreeMarkerContent("login.ftl", kotlinx.html.emptyMap))
        }

        post("/login") {
            val params = call.receiveParameters()
            val username = params["username"]
            val password = params["password"]
            val user = UserRequest(username!!, password!!)

            if(!user.isValid()) {
                call.respond(
                    HttpStatusCode.BadRequest,
                    "Please make your username longer than 2 and your password longer than 4 characters"
                )
                return@post
            }

            val userCheck = db.from(UserEntity)
                .select()
                .where { UserEntity.username eq user.username  }
                .map { it[UserEntity.username] }
                .firstOrNull()

            if(userCheck == null) {
                call.respond(
                    HttpStatusCode.BadRequest,
                    "User does not exist"
                )
                return@post
            } else {
                currentUser = user
                currentLink = "#"
                call.respondRedirect("http://localhost:8080")
            }
        }

        get("/signup") {
            call.respond(FreeMarkerContent("signup.ftl", kotlinx.html.emptyMap))
        }

        post("/signup") {
            val params = call.receiveParameters()
            val username = params["username"]
            val password = params["password"]
            val user = UserRequest(username!!, password!!)

            if(!user.isValid()) {
                call.respond(
                    HttpStatusCode.BadRequest,
                    "Please make your username longer than 2 and your password longer than 4 characters"
                )
                return@post
            }

            val userCheck = db.from(UserEntity)
                .select()
                .where { UserEntity.username eq user.username  }
                .map { it[UserEntity.username] }
                .firstOrNull()

            if(userCheck != null) {
                call.respond(
                    HttpStatusCode.BadRequest,
                    "Username already exists. Please try a different username"
                )
                return@post
            } else {
                db.insert(UserEntity) {
                    set(it.username, user.username)
                    set(it.password, user.password)
                }

                //call.respond(FreeMarkerContent("index.ftl", kotlinx.html.emptyMap))
                currentUser = user
                currentLink = "#"
                call.respondRedirect("http://localhost:8080")
            }
        }

        post("/submit") {
            val params = call.receiveParameters()
            val name = params["name"]
            val email = params["email"]
            val phone = params["phone"] ?: 0
            val date = params["date"]
            val time = params["time"]
            val noOfPeople = params["noOfPeople"]?.toInt()
            val message = params["message"]

            db.insert(ReservationEntity) {
                set(it.name, name)
                set(it.email, email)
                set(it.phone, phone)
                set(it.date, date)
                set(it.time, time)
                set(it.noOfPeople, noOfPeople)
                set(it.message, message)
            }

            call.respondRedirect("http://localhost:8080/reservation")
        }

        get("/reservation") {
            call.respond(FreeMarkerContent("rezervacija.ftl", kotlinx.html.emptyMap))
        }
    }
}
