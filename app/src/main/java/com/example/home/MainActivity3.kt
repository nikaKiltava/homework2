package com.example.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        findViewById<TextView>(R.id.info).text = intent?.extras?.getString("first", "")

        val info = intent?.extras?.getString("mail", "")
        findViewById<Button>(R.id.button4).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("mail", info)
            startActivity(intent)
        }
    }
}