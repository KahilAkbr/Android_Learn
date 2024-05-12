//fun main() {
//    printResult(10 ,sum)
//}
//
//fun printResult(value: Int, sum: (Int) -> Int) {
//    val result = sum(value)
//    println(result)
//}
//
//var sum: (Int) -> Int = { value -> value + value }

//fun main() {
//    printResult(10, { value ->
//        value + value
//    })
//}
//
//fun printResult(value: Int, sum: (Int) -> Int) {
//    val result = sum(value)
//    println(result)
//}

fun main() {
    printResult(10){ value ->
        value + value
    }
    printResult(20){ value ->
        value + value
    }
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}