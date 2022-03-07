package ba.buenogusto.model

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class Reservation(
    val id: Int,
    val user: Int,
    val email: String,
    val phone: String,
    val dateTime: LocalDateTime,
    val noOfPeople: Int,
    val message: String
)


