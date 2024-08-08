package com.example.multithreadkotlin.fragment.exercise

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.multithreadkotlin.R
import java.util.concurrent.atomic.AtomicBoolean

// Fixing Memory Leak Because unterminated thraead
class Exercise2Fragment : Fragment() {
    private lateinit var mDummyData: ByteArray
    private var countAbort : AtomicBoolean = AtomicBoolean(false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mDummyData = ByteArray(50 * 1000 * 1000)
        return inflater.inflate(R.layout.fragment_excercise2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        countScreenTime()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        countAbort.set(true)
    }

    private fun countScreenTime() {
        countAbort.set(false)
        Thread(Runnable {
            var screenTimeSeconds = 0
            while (true) {
                try {
                    Thread.sleep(1000)
                } catch (e: InterruptedException) {
                    return@Runnable
                }
                if (countAbort.get()) {
                    return@Runnable
                }
                screenTimeSeconds++
                Log.d("Exercise 2", "screen time: " + screenTimeSeconds + "s")
            }
        }).start()
    }
}