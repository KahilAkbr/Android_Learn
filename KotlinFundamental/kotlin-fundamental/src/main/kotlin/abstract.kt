//abstract class Animal(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){
//
//    open fun eat(){
//        println("$name sedang makan !")
//    }
//
//    open fun sleep(){
//        println("$name sedang tidur !")
//    }
//}
//
//fun main(){
//    val dicodingCat = Cat("Dicoding Miaw", 3.2, 2, true, "Brown", 4)
//
//    dicodingCat.playWithHuman()
//    dicodingCat.eat()
//    dicodingCat.sleep()
//}
//
//class Cat(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
//    : Animal(pName, pWeight, pAge, pIsCarnivore) {
//
//    fun playWithHuman() {
//        println("$name bermain bersama Manusia !")
//    }
//
//    override fun eat(){
//        println("$name sedang memakan ikan !")
//    }
//
//    override fun sleep() {
//        println("$name sedang tidur di bantal !")
//    }
//}