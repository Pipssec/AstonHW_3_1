package com.example.homework2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    companion object{
        val EXTRA_MESSAGE = "putMainActivity"
    }
    private var mCount = 0
    lateinit var  mShowCount: TextView
    lateinit var buttonToast: Button
    lateinit var buttonCount: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mShowCount = findViewById(R.id.show_count)
        buttonToast = findViewById(R.id.button_toast)
        buttonCount = findViewById(R.id.button_count)
        buttonCount.setOnClickListener {
            mCount++;
            mShowCount.text = mCount.toString();
        }
        buttonToast.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            val message = mCount.toString()
            intent.putExtra(EXTRA_MESSAGE, message)
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("count", mCount)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        mCount = savedInstanceState.getInt("count")
        mShowCount.text = mCount.toString()
    }
}