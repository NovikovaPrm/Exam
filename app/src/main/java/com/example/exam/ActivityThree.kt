package com.example.exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        var user = intent.extras?.getString("username")
        val text_view_info:TextView=findViewById(R.id.textView4)
        text_view_info.text = "$user, GET ACTIVE"
    }
}