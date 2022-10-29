package com.example.movieapps.DB


/**
 * Created by Quique on 28/10/2022.
 */
class Repository(private val userDao: Dao) {

    val allWords: List<User> = userDao.getAlphabetizedWords()
    suspend fun insert(user: User) {
        userDao.insert(user)
    }
}