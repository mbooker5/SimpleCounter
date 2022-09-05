package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<android.widget.TextView>(R.id.textView)
        val button = findViewById<android.widget.Button>(R.id.button)
        textView.text = 0.toString()
        button.setOnClickListener {
//            android.widget.Toast.makeText(it.context, "Clicked Button!", android.widget.Toast.LENGTH_SHORT).show()
            counter++
            textView.text = counter.toString()
        }
    }
}