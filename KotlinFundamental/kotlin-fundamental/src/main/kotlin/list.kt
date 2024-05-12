fun main(){
    val numberList : List<Int> = listOf(1,2,3,4,4,5)
    val charList : List<Char> = listOf('A', 'B', 'C')

    val anyList = listOf (true, 3, "Anjay")

    val anyList2 = mutableListOf(true, 3, "Anjay")
    anyList2[0] = false
    println(anyList2)
    println(anyList2[0])
    anyList2[1] = 34.3
    println(anyList2)
}