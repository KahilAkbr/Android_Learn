//fun main() {
//    val text = "Hello"
//    val result = text.run {
//        val from = this
//        val to = this.replace(text, "Kotlin")
//        "replace text from $from to $to"
//    }
//    println("result : $result")
//}

//fun main() {
//    val message = "Hello Kotlin!"
//    val result = with(message) {
//        println("value is $this")
//        println("with length ${this.length}")
//    }
//
//    val message2 = "Hello Kotlin!"
//    val result2 = with(message2) {
//        "First character is ${this[0]}" +
//                " and last character is ${this[this.length - 1]}"
//    }
//
//    println(result2)
//}

fun main() {
    val message = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message.toString())
}