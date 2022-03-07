package ba.buenogusto.entities

import org.ktorm.schema.*

object ReservationEntity: Table<Nothing>(tableName = "reservation") {
    val id =            int("id").primaryKey()
    val user =          int("user")
    val email =         varchar("email")
    val phone =         varchar("phone")
    val dateTime =      datetime("dateTime")
    val noOfPeople =    int("noOfPeople")
    val message =       text("message")
}
