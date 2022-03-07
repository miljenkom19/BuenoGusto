package ba.buenogusto.db

import org.ktorm.database.Database

object DatabaseConnection {

    var user = "root"
    var password = "my-secret-pw"

    val database = Database.connect(
        url = "jdbc:mysql://docker01_db:3306/buenogusto",
        driver = "com.mysql.cj.jdbc.Driver",
        user = user,
        password = password
    )
}