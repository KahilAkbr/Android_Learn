package com.example.multithreadkotlin.fragment.exercise

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.multithreadkotlin.R

// Creating Anonymous Thread
class Exercise1Fragment : Fragment() {
    private val ITERATIONS_COUNTER_DURATION_SEC = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_exercise1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btn_count_iterations).setOnClickListener {
            countIterations()
        }
    }

    private fun countIterations() {
        Thread(Runnable {
            val startTimestamp = System.currentTimeMillis()
            val endTimestamp: Long =
                startTimestamp + ITERATIONS_COUNTER_DURATION_SEC * 1000

            var iterationsCount = 0
            while (System.currentTimeMillis() <= endTimestamp) {
                iterationsCount++
            }

            Log.d(
                "Exercise1",
                "iterations in " + ITERATIONS_COUNTER_DURATION_SEC + "seconds: " + iterationsCount
            )
        }).start()
    }
}