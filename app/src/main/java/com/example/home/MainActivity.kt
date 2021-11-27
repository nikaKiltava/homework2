package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var textview: TextView
    private lateinit var mail: TextView
    private lateinit var password: TextView
    private lateinit var user: TextView
    private lateinit var login: Button

    val rightmail = "nika"
    val rightpassword = "123"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textview = findViewById(R.id.signUp)
        mail = findViewById(R.id.et1)
        user = findViewById(R.id.et1)
        password = findViewById(R.id.et2)
        login = findViewById(R.id.button1)

        user.text = intent.extras?.getString("username", "nika")

        textview.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }
    }

    fun check(view:View){
            if (password.text.toString() == rightpassword && mail.text.toString() == rightmail){
                Toast.makeText(this, "Meow, Meow", Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this, "type nika and 123", Toast.LENGTH_SHORT).show() }
    }
}