package com.example.mylivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.example.mylivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val liveDataTimerViewModel : MainViewModel by viewModels()
    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
        subscribe()
    }

    private fun subscribe() {
        val elapsedTimeObserver = Observer<Long?>{aLong ->
            val newText = this@MainActivity.getString(R.string.seconds, aLong)
            activityMainBinding.timerTextview.text = newText
        }

        liveDataTimerViewModel.getElapsedTime().observe(this, elapsedTimeObserver)
    }
}