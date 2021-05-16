package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var login : EditText
    lateinit var username : EditText
    lateinit var password : EditText
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        username=findViewById(R.id.username)
        password=findViewById(R.id.password)
        button=findViewById(R.id.button)

        button.setOnClickListener(){
            if (username.text.toString()== "GrowlinAdmin" && password.text.toString() == "DareToGrow" ){
                val text = "Logged in successfully!"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext,text,duration)
                toast.show()
                intent=Intent(this,HomeActivity::class.java)
                startActivity(intent)
                }
            else{
                val text ="Incorrect username or password"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext,text, duration)
                toast.show()
            }


        }

    }
}