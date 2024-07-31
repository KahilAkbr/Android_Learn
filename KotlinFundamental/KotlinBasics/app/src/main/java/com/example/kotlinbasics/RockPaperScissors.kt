package com.example.kotlinbasics

fun main (){
    var computerChoice : String = ""
    var playerChoice : String = ""

    println("Enter your choice: ")
    playerChoice = readln()
    while (playerChoice !in listOf("Rock", "Paper", "Scissors")) {
        println("Enter your choice: ")
        playerChoice = readln()
    }

    val randomNumber = (1..3).random()
    when (randomNumber) {
        1 -> computerChoice = "Rock"
        2 -> computerChoice = "Paper"
        3 -> computerChoice = "Scissors"
    }

    println("Player choice: $playerChoice")
    println("Computer choice: $computerChoice")

    val winner = when{
        playerChoice == computerChoice -> "Draw"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    println("Winner: $winner")
}
