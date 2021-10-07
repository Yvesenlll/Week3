package com.example.week3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.week3.databinding.ActivitySecondBinding

class secondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)

        setContentView(binding.root)
        Log.i("Lifecycle", "SecondActivity.onCreate() method")

        binding.backToMainButton.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        //1. Setup the binding
        //2. Create the intent

    }

    override fun onStop() {
        super.onStop()
        Log.i("Lifecycle", "SecondActivity.onStop() method")

    }

    override fun onStart() {
        super.onStart()
        Log.i("Lifecycle", "SecondActivity.onStart() method")

    }

    override fun onResume() {
        super.onResume()
        Log.i("Lifecycle", "SecondActivity.onResume() method")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Lifecycle", "SecondActivity.onDestroy() method")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Lifecycle", "SecondActivity.onPause() method")

    }
}