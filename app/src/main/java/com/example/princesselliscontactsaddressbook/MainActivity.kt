package com.example.princesselliscontactsaddressbook

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Princess Ellis
// PA - Contacts Mobile App
// November 15, 2026

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ashleyButton = findViewById<Button>(R.id.btnAshley)
        val amandaButton = findViewById<Button>(R.id.btnAmanda)

        ashleyButton.setOnClickListener {
            val intent = Intent(this, AshleyActivity::class.java)
            startActivity(intent)
        }

        amandaButton.setOnClickListener {
            val intent = Intent(this, AmandaActivity::class.java)
            startActivity(intent)
        }
    }
}