package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var button2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val actionBar = supportActionBar
        actionBar!!.title="Home"
        textView=findViewById(R.id.textView)
        button2=findViewById(R.id.button2)
        button2.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}