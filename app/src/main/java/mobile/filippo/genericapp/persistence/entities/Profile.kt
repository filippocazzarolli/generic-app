package mobile.filippo.genericapp.persistence.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "Profile")
class Profile(
    @PrimaryKey
    val id: String,

    val fname: String,
    val lname: String,
    val birthday: Date,
    val phone: String,
    val city: String
) {
}