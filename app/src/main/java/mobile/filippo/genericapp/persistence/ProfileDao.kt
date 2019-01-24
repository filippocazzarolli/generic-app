package mobile.filippo.genericapp.persistence

import androidx.room.Dao
import androidx.room.Insert
import mobile.filippo.genericapp.persistence.entities.Profile

@Dao
interface ProfileDao {

    @Insert
    fun Insert(Profile: Profile)

}