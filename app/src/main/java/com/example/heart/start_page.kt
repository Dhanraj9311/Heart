package com.example.heart

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.heart.databinding.ActivityStartPageBinding

class start_page : AppCompatActivity() {
    private val buiding: ActivityStartPageBinding by lazy{
        ActivityStartPageBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(buiding.root)
        buiding.startButton.setOnClickListener {
            val intent = Intent(this, login_page::class.java)
            startActivity(intent)
        }

    }
}