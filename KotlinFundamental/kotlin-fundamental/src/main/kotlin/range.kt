package com.dicoding.kotlin

fun main() {
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)

    val ranges = 1.rangeTo(10) step 3
    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }

    val ranges2 = 1.rangeTo(10) step 3
    ranges2.forEach { value ->
        println("value is $value!")
    }

    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }

    for (i in 1..3) {
        for (j in 1..i) {
            print(j)
        }
    }
    for (i in 10 until 12) {
        print("$i ")
    }

    var a = 10

    when (a) {
        // ...
    }
}