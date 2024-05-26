package com.example.projekterbaru1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login_layout)

        val signInButton = findViewById<Button>(R.id.ButtonSignIn)
        signInButton.setOnClickListener {
            // Tindakan yang ingin dilakukan saat tombol diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(this, BottomNavbar::class.java)
            startActivity(intent)
        }
    }
}
