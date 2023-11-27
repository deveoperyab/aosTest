package com.example.aosTest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btn_login : Button = findViewById<Button>(R.id.btn_login)
        btn_login.setOnClickListener() {
            val intent = Intent(this, loginSuccess::class.java)
            startActivity(intent)
        }

        var btn_join : Button = findViewById<Button>(R.id.btn_join)
        btn_join.setOnClickListener() {
            val intent = Intent(this, join::class.java)
            startActivity(intent)
        }
    }
}