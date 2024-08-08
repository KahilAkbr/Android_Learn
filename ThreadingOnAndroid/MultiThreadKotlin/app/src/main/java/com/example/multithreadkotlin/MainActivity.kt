package com.example.multithreadkotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.multithreadkotlin.databinding.ActivityMainBinding
import com.example.multithreadkotlin.fragment.exercise.Exercise1Fragment
import com.example.multithreadkotlin.fragment.exercise.Exercise2Fragment
import com.example.multithreadkotlin.fragment.exercise.Exercise3Fragment
import com.example.multithreadkotlin.fragment.latihan.customhandler.CustomHandlerFragment.CustomHandlerFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnExercise1 = binding.btnExercise1
        val btnExercise2 = binding.btnExercise2
        val btnCustomHandler = binding.btnCustomhandler
        val btnExcercise3 = binding.btnExercise3

        binding.apply {
            btnExercise1.setOnClickListener { switchFragment(Exercise1Fragment()) }
            btnExercise2.setOnClickListener { switchFragment(Exercise2Fragment()) }
            btnCustomHandler.setOnClickListener { switchFragment(CustomHandlerFragment()) }
            btnExcercise3.setOnClickListener { switchFragment(Exercise3Fragment()) }
        }
    }

    override fun onBackPressed(){
        if (supportFragmentManager.backStackEntryCount > 0) {
            supportFragmentManager.popBackStack()
        } else {
            super.onBackPressed()
        }
        binding.mainLayout.visibility = View.VISIBLE
    }

    private fun switchFragment(fragment : Fragment) {
        binding.mainLayout.visibility = View.GONE
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_exercise, fragment)
            .addToBackStack(null)
            .commit()
    }
}