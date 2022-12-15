package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {

    lateinit var userName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userName = findViewById(R.id.userName)

        userName.addTextChangedListener {
            text ->  Log.d("Nombre de usuario", text.toString())
        }

        val buttonClick = findViewById<Button>(R.id.button);
        buttonClick.setOnClickListener {
            val intent = Intent(this, NewActivity::class.java)
            startActivity(intent)
        }
    }
}