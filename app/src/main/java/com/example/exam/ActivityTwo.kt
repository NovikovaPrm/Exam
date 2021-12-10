package com.example.exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        val buttonReturn: Button =findViewById(R.id.buttonReturn)
        buttonReturn.setOnClickListener {
            val intent= Intent(this@ActivityTwo, MainActivity::class.java)
            startActivity(intent)
        }
        val buttonBegin: Button =findViewById(R.id.buttonBegin)
        buttonBegin.setOnClickListener {
            val intent2= Intent(this@ActivityTwo, ActivityThree::class.java)
            startActivity(intent2)
        }

    }
}