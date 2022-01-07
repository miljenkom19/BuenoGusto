package ba.buenogusto.db

import org.ktorm.database.Database

object DatabaseConnection {

    val database = Database.connect(
        "jdbc:mysql://localhost:3306/buenogusto",
        "com.mysql.cj.jdbc.Driver",
        "root",
        "password"
    )
}