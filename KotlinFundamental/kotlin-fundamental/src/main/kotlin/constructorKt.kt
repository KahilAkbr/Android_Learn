////fun main(){
////    val dicodingCat = Animal(name = "Dicoding Miaw", weight = 4.2, age = 2, isMammal = true)
////    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
////}
////
/////*
////output:
////    Nama: Dicoding Miaw, Berat: 4.2, Umur: 2, mamalia: true
////*/
////
////class Animal(val name: String, val weight: Double, val age: Int, val isMammal: Boolean)
//
//class Animal(pName: String, pWeight: Double = 2.0, pAge: Int, pIsMammal: Boolean){
//    val name: String
//    val pWeight: Double
//    val age: Int
//    val isMammal: Boolean
//
//    init {
//        this.pWeight = if(pWeight < 0) 0.1 else pWeight
//        age = if(pAge < 0) 0 else pAge
//        name = pName
//        isMammal = pIsMammal
//    }
//}
//
//fun main() {
//    val dicodingCat = Animal(pName = "Dicoding Miaw", pWeight = -1.2, pAge = 2, pIsMammal = true)
//    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.pWeight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
//}