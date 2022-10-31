package com.example.movieapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.inflate
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.example.movieapps.DB.Dao
import com.example.movieapps.DB.Repository
import com.example.movieapps.DB.User
import com.example.movieapps.DB.UserDatabase
import com.example.movieapps.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var loginViewModel: LoginViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)
        val username = binding.etUsername
        val password = binding.etPassword
        val button = binding.btnLogin
        val db = Room.databaseBuilder(applicationContext,UserDatabase::class.java, "user_database").allowMainThreadQueries().build()

        val dao = UserDatabase.getDatabase(this)
        val repository = Repository(dao)
        val factory = LoginViewModelFactory(repository, application)
        loginViewModel = ViewModelProvider(this, LoginViewModelFactory())
            .get(LoginViewModel::class.java)
        binding.viewModel = viewModels
        binding.lifecycleOwner = this

        val usernameU = "Admin"
        val passwordU = "Password*123"
        val user = User(usernameU,passwordU)

        db.userDao().insert(user)



    }




}


