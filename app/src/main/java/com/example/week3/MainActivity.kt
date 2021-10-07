package com.example.week3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.week3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i("Lifecycle", "MainActivity.onCreate() method")

        binding.button.setOnClickListener {
            var intent = Intent(this, secondActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onStop() {
        super.onStop()
        Log.i("Lifecycle", "MainActivity.onStop() method")

    }

    override fun onStart() {
        super.onStart()
        Log.i("Lifecycle", "MainActivity.onStart() method")

    }

    override fun onResume() {
        super.onResume()
        Log.i("Lifecycle", "MainActivity.onResume() method")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Lifecycle", "MainActivity.onDestroy() method")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Lifecycle", "MainActivity.onPause() method")

    }
}