//lateinit var name: String
//
//fun main() {
//    name = "Dicoding Miaw"
//    print(name.length)
//}

//lateinit var name: String
//
//fun main() {
////    name = "Dicoding Miaw"
//    if (::name.isInitialized)
//        print(name.length)
//    else
//        print("Not Initialized")
//}

val name: String by lazy {
    "Dicoding Miaw"
}
fun main() {
    print(name.length)
}