package com.example.hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.hello.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import java.net.PasswordAuthentication

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        binding.tvLogin.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
        binding.btSignUp.setOnClickListener {
            validateSignUp()
        }
    }
    fun validateSignUp(){
        val firstName = binding.etFirstName.text.toString()
        val lastName = binding.etLastName.text.toString()
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()
        val confirmation = binding.etConfirmPassword.text.toString()
        var error = false

        if (firstName.isBlank()){
            binding.tilFirstName.error = "First name is required"
            error = true
    }
        if (firstName.isBlank()){
            binding.tilLastName.error = "Last name is required"
            error = true

        }
        if (firstName.isBlank()){
            binding.tilEmail.error = "Email is required"
            error = true
        }
        if (firstName.isBlank()){
            binding.tilPassword.error = "Password is required"
            error = true
        }
        if (firstName.isBlank()){
            binding.tilConfirmPassword.error = "Confirmation password required"
            error = true
        }
        if (password != confirmation){
            binding.tilPassword.error = "Password not match"
            error = true
        }
        if (!error){
            Toast.makeText(this,"$firstName $lastName $email",Toast.LENGTH_LONG)
                .show()
        }
}
}



