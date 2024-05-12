fun main(){
    val integerSet = setOf(1,1,1,1,2,3)

    println(integerSet)
    println(5 in integerSet)


    val mutableSet = mutableSetOf(1,2,2,3,4)
    mutableSet.add(5)
    print(mutableSet)

    val charMutableSet = mutableSetOf('a','b','b','c')
    charMutableSet.add('a')
    print(charMutableSet)

}