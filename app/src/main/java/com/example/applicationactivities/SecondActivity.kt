package com.example.applicationactivities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(R.layout.activity_second) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val tvHelloWord = findViewById<TextView>(R.id.tvHelloWord)


        tvHelloWord.setOnClickListener {
            setResult(
                Activity.RESULT_OK, Intent().apply {
                    putExtra("result","tvHelloWord.text")
                }
            )
            finish()
        }

    }
}