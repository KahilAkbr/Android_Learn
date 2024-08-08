package com.example.multithreadkotlin.fragment.latihan.customhandler.CustomHandlerFragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.multithreadkotlin.databinding.FragmentCustomHandlerBinding
import java.util.concurrent.BlockingQueue
import java.util.concurrent.LinkedBlockingQueue

class CustomHandlerFragment : Fragment() {
    private var _binding: FragmentCustomHandlerBinding? = null
    private val binding get() = _binding!!

    private val SECONDS_TO_COUNT: Int = 5
    private var mCustomHandler: CustomHandler? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCustomHandlerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSendJob.setOnClickListener {
            sendJob()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onStart() {
        super.onStart()
        mCustomHandler = CustomHandler()
    }

    override fun onStop() {
        super.onStop()
        mCustomHandler?.stop()
    }

    private fun sendJob() {
        mCustomHandler?.post(Runnable {
            for (i in 0 until SECONDS_TO_COUNT) {
                try {
                    Thread.sleep(1000)
                } catch (e: InterruptedException) {
                    return@Runnable
                }
                Log.d("CustomHandler", "iteration: $i")
            }
        })
    }

    private class CustomHandler {
        private val mQueue: BlockingQueue<Runnable> = LinkedBlockingQueue()
        private val POISON = Runnable{}

        init {
            initWorkerThread()
        }

         fun initWorkerThread() {
            Thread(Runnable {
                while (true) {
                    var runnable : Runnable
                    try {
                        runnable = mQueue.take()
                    } catch (e: InterruptedException) {
                        return@Runnable
                    }
                    if(mQueue == POISON) {
                        return@Runnable
                    }
                    runnable.run()
                }
            }).start()
        }

        fun stop() {
            mQueue.clear()
            mQueue.add(POISON)
        }

        fun post(job: Runnable?) {
            mQueue.add(job)
        }
    }
}