package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity2 : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var button1 : Button
    private lateinit var username :TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        button1 = findViewById(R.id.button2)
        button = findViewById(R.id.button3)
        username = findViewById(R.id.usernameET)

        button.setOnClickListener {
            val intent1 = Intent(this, MainActivity::class.java)
            startActivity(intent1)
        }

        button1.setOnClickListener {
            val nika = username.text.toString()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("username", nika)
            startActivity(intent)
        }
    }
}