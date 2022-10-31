package com.example.movieapps.DB

import android.content.Context
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * Created by Quique on 28/10/2022.
 */
@Database(entities = arrayOf(User::class), version = 1, exportSchema = false)
public abstract class UserDatabase: RoomDatabase() {
    abstract fun userDao(): com.example.movieapps.DB.Dao

    companion object {
        @Volatile
        private var INSTANCE: UserDatabase? = null

        fun getDatabase(context: Context): UserDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase::class.java,
                    "user_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}