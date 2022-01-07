package ba.buenogusto.model

import kotlinx.serialization.Serializable

@Serializable
data class Reservation(
    val id: Int,
    val name: String,
    val email: String,
    val phone: String,
    val date: String,
    val time: String,
    val noOfPeople: Int,
    val message: String
)
