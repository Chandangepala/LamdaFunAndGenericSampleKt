package com.basic.lamdafunandgenericsamplekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = listOf("Kotlin", "is", "fun")

        val count = list.count { currentString ->
            currentString.length == 3
        }

        println("Count: $count")

        val countTwo = list.customCount { currentString ->
            currentString.length >= 3
        }

        println("CountViaCustomCount: $countTwo")

    }

    //generic //extension function
    fun <T> List<T>.customCount(function: (T) -> Boolean): Int {
        var counter = 0
        for (string in this) {
            if (function(string)) {
                counter++
            }
        }
        return counter
    }
}
