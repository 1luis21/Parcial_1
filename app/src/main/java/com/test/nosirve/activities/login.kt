package com.test.nosirve.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.test.nosirve.R
import com.test.nosirve.databinding.ActivityLoginBinding

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityLoginBinding>(this,
            R.layout.activity_login
        )

        supportActionBar?.hide()

        val user = "Luis@gmail.com"
        val passwd = "clave3322"

        if (binding.editTextEmail.text.toString() == user && binding.editTextPasswd.text.toString() == passwd){
            binding.btnLogin.setOnClickListener {
                startActivity(Intent(this, mainMenu::class.java))

            }
        }
    }
}