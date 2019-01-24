package mobile.filippo.genericapp.persistence

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import mobile.filippo.genericapp.persistence.entities.Profile

@Database(entities = [Profile::class], version = 1)
abstract class GenericDatabase : RoomDatabase() {

    abstract fun ProfileDao(): ProfileDao

    companion object {

        private var GenericRoomInstance: GenericDatabase? = null

        fun getDatabase(context: Context): GenericDatabase? {
            if (GenericRoomInstance == null) {

                synchronized(GenericDatabase::class.java) {
                    if (GenericRoomInstance == null) {
                        GenericRoomInstance = Room.databaseBuilder<GenericDatabase>(
                            context.applicationContext,
                            GenericDatabase::class.java, "generic_database"
                        )
                            .build()
                    }
                }
            }
            return GenericRoomInstance
        }
    }
}