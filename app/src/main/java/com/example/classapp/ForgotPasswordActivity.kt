package com.example.classapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val logBtn: Button = findViewById(R.id.login)

        //set a listener to the button
        logBtn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

                    }
        //authenticating the password and email
        val sendButton: Button = findViewById(R.id.sendBtn)
        val emailEdit: EditText = findViewById(R.id.email)

        sendButton.setOnClickListener{
           val userEmailEntered: String = emailEdit.text.toString()
            var message = " ";

            if(!userEmailEntered.matches(Regex("^[a-zA-Z0-9.a-zA-Z0-9.!#$%&'*+-/=?^_`{|}~]+@[a-zA-Z0-9]+\\.[a-zA-Z]+"))) {
                message = "You need to enter a valid email address"
            }else{
                message="A recovery email has been sent to $userEmailEntered"
            }
           Snackbar
               .make(
                   findViewById(R.id.layout),
                   message,
                   Snackbar.LENGTH_LONG
               )
               .show()

        }
    }
}