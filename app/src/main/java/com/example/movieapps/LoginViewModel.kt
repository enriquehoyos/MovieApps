package com.example.movieapps

import android.app.Application
import android.util.Log
import android.view.View
import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.movieapps.DB.Repository

/**
 * Created by Quique on 28/10/2022.
 */
class LoginViewModel(): ViewModel(), Observable {


    @Bindable
    val inputUsername = MutableLiveData<String>()

    @Bindable
    val inputPassword = MutableLiveData<String>()

    fun loginButton(username: String, pass: String) {
        val result = Repository.login(username, password)
        Log.e("Quique","auibutton")
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        TODO("Not yet implemented")
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        TODO("Not yet implemented")
    }
}