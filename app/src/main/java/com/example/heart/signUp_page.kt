package com.example.heart

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.heart.databinding.ActivitySignUpPageBinding

class signUp_page : AppCompatActivity() {
    private val binding: ActivitySignUpPageBinding by lazy {
        ActivitySignUpPageBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.doHave.setOnClickListener {
            val intent = Intent(this, login_page::class.java)
            startActivity(intent)
        }
        binding.SignButton.setOnClickListener {
            val intent = Intent(this, login_page::class.java)
            startActivity(intent)
          }
    }
}

