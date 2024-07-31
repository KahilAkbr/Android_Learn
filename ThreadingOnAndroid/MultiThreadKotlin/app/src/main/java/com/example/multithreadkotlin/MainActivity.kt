package com.example.multithreadkotlin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.multithreadkotlin.fragment.Exercise1Fragment
import com.example.multithreadkotlin.fragment.Exercise2Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnExercise1 = findViewById<Button>(R.id.btn_exercise1)
        val btnExercise2 = findViewById<Button>(R.id.btn_exercise2)

        btnExercise1.setOnClickListener {
            findViewById<View>(R.id.main_layout).visibility = View.GONE
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_exercise, Exercise1Fragment())
                .addToBackStack(null)
                .commit()
        }

        btnExercise2.setOnClickListener {
            findViewById<View>(R.id.main_layout).visibility = View.GONE
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_exercise, Exercise2Fragment())
                .addToBackStack(null)
                .commit()
        }
    }

    override fun onBackPressed(){
        if (supportFragmentManager.backStackEntryCount > 0) {
            supportFragmentManager.popBackStack()
//            findViewById<Button>(R.id.btn_exercise1).visibility = View.VISIBLE
        } else {
            super.onBackPressed()
        }
        findViewById<View>(R.id.main_layout).visibility = View.VISIBLE
    }
}