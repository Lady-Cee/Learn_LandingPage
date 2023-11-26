package com.example.classapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CreateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)

        val haveAccount: TextView = findViewById(R.id.alreadyHaveAcct)
        haveAccount.setOnClickListener {
            funHaveAccount()
        }
        }
        private fun funHaveAccount(){
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
