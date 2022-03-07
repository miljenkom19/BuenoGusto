package ba.buenogusto.model

import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable
import java.time.LocalTime

@Serializable
data class ReservationRequest(
    val email: String,
    val phone: String,
    val dateTime: LocalDateTime,
    val noOfPeople: Int,
    val message: String
)
