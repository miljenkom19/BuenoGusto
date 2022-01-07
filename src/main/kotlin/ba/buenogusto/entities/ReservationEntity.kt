package ba.buenogusto.entities

import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.text
import org.ktorm.schema.varchar

object ReservationEntity: Table<Nothing>(tableName = "reservation") {
    val id =            int("id").primaryKey()
    val name =          varchar("name")
    val email =         varchar("email")
    val phone =         varchar("phone")
    val date =          varchar("date")
    val time =          varchar("time")
    val noOfPeople =    int("number_of_people")
    val message =       text("message")
}
