package com.example.hellotestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var helloText : TextView = findViewById<TextView>(R.id.textView1)
        var helloButton : Button = findViewById<Button>(R.id.button1)
        helloButton.setOnClickListener {
            helloText.text = "Androidアプリを作成しました!"
        }
    }
}