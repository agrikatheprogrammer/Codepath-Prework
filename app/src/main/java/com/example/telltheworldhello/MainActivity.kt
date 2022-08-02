package com.example.telltheworldhello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button2).setOnClickListener {
            Log.i("Agrika","Tapped on button")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }

    }
}