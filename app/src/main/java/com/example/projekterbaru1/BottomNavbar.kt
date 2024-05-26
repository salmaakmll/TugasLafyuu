package com.example.projekterbaru1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projekterbaru1.databinding.ActivityBottomNavbarBinding

class BottomNavbar : AppCompatActivity() {

    private lateinit var binding: ActivityBottomNavbarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavbarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home())


        binding.bottomNav.setOnItemSelectedListener {

            when(it.itemId){
                R.id.home -> replaceFragment(Home())

                else -> {

                }
            }
            true
        }

    }

    private fun replaceFragment(fragment: Home){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame,fragment)
        fragmentTransaction.commit()
    }
}