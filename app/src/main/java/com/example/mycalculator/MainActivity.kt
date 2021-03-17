package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val plus = findViewById<Button>(R.id.plus)
        val minus = findViewById<Button>(R.id.minus)
        val x = findViewById<Button>(R.id.x)
        val ratio = findViewById<Button>(R.id.ratio)
        val firstN = findViewById<EditText>(R.id.first)
        val secondN = findViewById<EditText>(R.id.second)
        var result = findViewById<TextView>(R.id.result)

        plus.setOnClickListener {
            result.text = (Integer.parseInt(firstN.text.toString()) + Integer.parseInt(secondN.text.toString())).toString()
        }

        minus.setOnClickListener {
            result.text = (Integer.parseInt(firstN.text.toString()) - Integer.parseInt(secondN.text.toString())).toString()
        }

        x.setOnClickListener {
            result.text = (Integer.parseInt(firstN.text.toString()) * Integer.parseInt(secondN.text.toString())).toString()
        }
        ratio.setOnClickListener {
            result.text = (Integer.parseInt(firstN.text.toString()) / Integer.parseInt(secondN.text.toString())).toString()
        }
    }

}