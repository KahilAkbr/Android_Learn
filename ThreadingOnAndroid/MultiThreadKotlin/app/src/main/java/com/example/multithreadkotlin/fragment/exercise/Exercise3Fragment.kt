package com.example.multithreadkotlin.fragment.exercise

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.multithreadkotlin.R
import java.util.concurrent.atomic.AtomicBoolean

class Exercise3Fragment : Fragment() {
    private lateinit var mCountHandler: CountHandler
    private val SECONDS_TO_COUNT = 3

    private lateinit var mBtnCountSeconds: Button
    private lateinit var mTxtCount: TextView

    private val mainHandler = Handler(Looper.getMainLooper())

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_exercise3, container, false)
        isButtonEnabled(true)

        mBtnCountSeconds = view.findViewById(R.id.btn_count_seconds)
        mTxtCount = view.findViewById(R.id.txt_count)

        mBtnCountSeconds.setOnClickListener {
            countIterations()
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mCountHandler = CountHandler()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mCountHandler.stop()
    }

    private fun countIterations() {
        mCountHandler.post {
            isButtonEnabled(false)
            for (i in 1 .. SECONDS_TO_COUNT) {
                if (mCountHandler.countAbort.get()) {
                    return@post
                }
                mainHandler.post {
                    mTxtCount.text = i.toString()
                }
                try {
                    Thread.sleep(1000)
                } catch (e: InterruptedException) {
                    return@post
                }
                Log.d("Exercise 3", "screen time: ${i}s")
            }
            isButtonEnabled(true)
            mainHandler.post {
                mTxtCount.text = "0"
            }
        }
    }

    private fun isButtonEnabled(boolean : Boolean) {
        mainHandler.post{
            mBtnCountSeconds.isEnabled = boolean
        }
    }

    private class CountHandler {
        private val handler = Handler(Looper.getMainLooper())
        val countAbort: AtomicBoolean = AtomicBoolean(false)

        fun stop() {
            countAbort.set(true)
        }

        fun post(runnable: Runnable) {
            handler.post(runnable)
        }
    }
}