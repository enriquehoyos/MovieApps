package com.example.movieapps.DB

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Quique on 28/10/2022.
 */
@Entity(tableName = "user_table")
class User(@PrimaryKey @ColumnInfo(name = "user") val user: String,
           @ColumnInfo(name = "password") val password: String)