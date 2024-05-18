package com.dicoding.newsapp.utils

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import java.io.IOException

object JsonConverter {
    fun readStringFromFile(fileName : String) : String {
        try {
            val applicationContext = ApplicationProvider.getApplicationContext<Context>()
            val inputStream = applicationContext.assets.open(fileName)
            val builder = StringBuilder()
            val reader = inputStream.bufferedReader()
            reader.readLines().forEach {
                builder.append(it)
            }
            return builder.toString()
        }catch (e: IOException){
            throw e
        }
    }
}