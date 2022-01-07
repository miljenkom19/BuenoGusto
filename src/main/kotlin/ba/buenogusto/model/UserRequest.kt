package ba.buenogusto.model

import kotlinx.serialization.Serializable

@Serializable
data class UserRequest(
    val username: String,
    val password: String
) {
    fun isValid(): Boolean {
        return username.length in 3..20 && password.length >= 5
    }
}
