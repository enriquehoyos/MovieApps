package com.example.movieapps.DB


/**
 * Created by Quique on 28/10/2022.
 */
class Repository(private val userDao: Dao) {
    val users = userDao.getName("")

    val allUsers: List<User> = userDao.getAlphabetizedWords()
    suspend fun insert(user: User) {
        userDao.insert(user)
    }
    suspend fun getUserName(userName: String):User?{
        return userDao.getName(userName)
    }



}