package com.example.heart

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.heart.databinding.ActivityLoginPageBinding

class login_page : AppCompatActivity() {
    private val binding: ActivityLoginPageBinding by lazy {
        ActivityLoginPageBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.notHave.setOnClickListener {
            val intent = Intent(this, signUp_page::class.java)
            startActivity(intent)
        }

        binding.LoginButton.setOnClickListener {
        val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}