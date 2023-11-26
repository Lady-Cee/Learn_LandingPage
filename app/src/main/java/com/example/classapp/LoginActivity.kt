package com.example.classapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val forgotButton: Button = findViewById(R.id.forgottenPassword)

        //set a listener to the button
        forgotButton.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)

        }

        val newAccount: Button = findViewById(R.id.newAcct)

        //set a listener to the button
        newAccount.setOnClickListener {
            val intent = Intent(this, CreateActivity::class.java)
            startActivity(intent)

        }

        var loginBtn: Button = findViewById(R.id.loginButton)
        var userNameText: EditText = findViewById(R.id.username)
        var passwordText: EditText = findViewById(R.id.password)

        //set a listener to the button
        loginBtn.setOnClickListener {
            val inputUsername: String = userNameText.text.toString()
            val inputPassword: String = passwordText.text.toString()

            var displayMessage = " ";

            if (inputUsername.isEmpty() and inputPassword.isEmpty()){
                displayMessage = "Please enter your username and password "
            }else if (inputUsername.isEmpty()){
                displayMessage = "please fill in your username"
            }else if (inputPassword.isEmpty()){
                displayMessage ="please fill in your password "
            }else{
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
            Snackbar
                .make(
                    findViewById(R.id.loginScreen),
                    displayMessage,
                    Snackbar.LENGTH_LONG
                )
                .show()
        }
    }
    //authentication


}