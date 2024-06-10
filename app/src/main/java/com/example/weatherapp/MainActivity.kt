package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var exitButton = findViewById<Button>(R.id.exitAppBtn)
        var enterButton = findViewById<Button>(R.id.mainScreenBtn)

        exitButton.setOnClickListener{
            finish()
        }

        enterButton.setOnClickListener{
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
        }
    }

}