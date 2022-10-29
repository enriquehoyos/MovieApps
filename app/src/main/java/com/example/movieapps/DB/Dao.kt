package com.example.movieapps.DB

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * Created by Quique on 28/10/2022.
 */
@Dao
interface Dao {
    @Query("SELECT * FROM user_table ORDER BY user ASC")
    fun getAlphabetizedWords(): List<User>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(user: User)

    @Query("DELETE FROM user_table")
    suspend fun deleteAll()

}