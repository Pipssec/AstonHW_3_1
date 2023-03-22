package com.example.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var showCount: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showCount = findViewById(R.id.show_count_second)
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        showCount = findViewById(R.id.show_count_second)
        showCount.text = message.toString()
    }
}