fun getMessage(name: String): String {
    return "Hello $name"
}

fun main() {
    val total = listOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
    val result1 = total.distinct()
    val result2 = result1.slice(1..3)
    println(result2)
}
