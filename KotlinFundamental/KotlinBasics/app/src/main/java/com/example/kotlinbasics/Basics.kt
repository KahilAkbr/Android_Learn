package com.example.kotlinbasics

fun main(){
    // var vs val <-->

    /* val number1 = 1
    number1 = 2 */

    var myAge : Byte = 35
    myAge = 36
    println(myAge)
    println("Hello World!")

    // float and double <-->
    val pi = 3.14
    val pi2 : Float = 3.14f
    println(pi)

    // boolean <-->
    val myTrue : Boolean = true
    val myFalse : Boolean = false

    println(myTrue || myFalse)
    println(myTrue && myFalse)
    println(!myTrue)

    // char and string<-->
    val myChar : Char = '\u00A9'
    println(myChar)

    var name = "Kahil"
    name = "Akbar"
    println(name.lowercase())

    // if else <-->
    var age = 0

    println("Enter your age : ")
    age = readln().toInt()

    if(age >= 18){
        println("You are eligible to vote")
    }else{
        println("You are not eligible to vote")
    }

    // while loop <-->
    var count = 0
    while (count < 3){
        count++
        println(count)
    }
}