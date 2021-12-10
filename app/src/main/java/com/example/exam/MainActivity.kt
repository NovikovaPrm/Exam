package com.example.exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNext:Button=findViewById(R.id.buttonStart1)
        buttonNext.setOnClickListener {
            val intent=Intent(this@MainActivity,ActivityTwo::class.java)
            startActivity(intent)
        }

        val button1:Button=findViewById(R.id.button1)
        button1.setOnClickListener {
            val intent=Intent(this@MainActivity,ActivityThree::class.java)
            val edit_address: EditText=findViewById(R.id.address)
            intent.putExtra("username",edit_address.text.toString())
            startActivity(intent)

        }


    }
}