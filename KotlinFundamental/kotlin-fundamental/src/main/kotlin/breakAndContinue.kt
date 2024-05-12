package com.dicoding.kotlin

fun main(){
    val listOfInt = listOf(1,3,5,null,7)

    for(i in listOfInt){
        if(i==null) continue
        print(i)
    }

}