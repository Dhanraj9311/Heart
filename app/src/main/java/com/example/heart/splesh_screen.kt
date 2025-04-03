package com.example.heart

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@Suppress("DEPRECATION")
class  splesh_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splesh_screen)
        Handler().postDelayed({
            val intent = Intent(this, start_page::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}