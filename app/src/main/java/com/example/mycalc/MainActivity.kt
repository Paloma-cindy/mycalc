package com.example.mycalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var ButtonCalc:Button?= null
    var ButtonInttent:Button?= null
    var ButtonWeb:Button?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonCalc=findViewById(R.id.`btn_calc`)
        ButtonCalc!! .setOnClickListener {
            val intent=Intent(this,activity_calculator::class.java)
            startActivity(intent)
        }
        ButtonInttent=findViewById(R.id.btn_intent)
        ButtonInttent!! .setOnClickListener {
            val intent=Intent(this,activity_intent::class.java)
            startActivity(intent)
        }
        ButtonWeb=findViewById(R.id.btn_Web)
        ButtonWeb!! .setOnClickListener {
            val intent=Intent(this,webactivity::class.java)
            startActivity(intent)
        }
    }
}