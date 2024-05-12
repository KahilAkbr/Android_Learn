package com.dicoding.kotlin

fun setUser(name: String = "Ganjar", age: Int): String{
    return "Your name is $name and you $age years old"
}

fun printUser(name: String) {
    print("Your name is $name")
}

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun printAll(vararg values: Any) {
    for (value in values) {
        println(value)
    }
}

fun main(){
    printUser("Adi")
    println("")
    println(setUser(age = 15))

    val number = sumNumbers(10, 20, 30, 40)
    println(number)

    printAll(1, "Hello", true, 3.14)
}