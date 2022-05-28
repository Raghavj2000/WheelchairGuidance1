package com.example.wheelchairguidance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.wheelchairguidance.login.LoginActivity
import com.example.wheelchairguidance.login.SignupActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var logoutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logoutButton = findViewById(R.id.logoutButton)

        logoutButton.setOnClickListener { logoutUser() }



    }

    private fun logoutUser() {
        FirebaseAuth.getInstance().signOut();
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}