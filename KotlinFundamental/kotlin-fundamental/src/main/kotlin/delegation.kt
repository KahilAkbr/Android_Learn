//import kotlin.reflect.KProperty
//
//class DelegateName {
//    private var value: String = "Default"
//
//    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
//        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
//        return value
//    }
//
//    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
//        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
//        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
//        value = newValue
//    }
//}
//
//
//class Animal {
//    var name: String by DelegateName()
//}
//
//class Person {
//    var name: String by DelegateName()
//}
//
//class Hero {
//    var name: String by DelegateName()
//}
//
//
//fun main() {
//    val animal = Animal()
//    animal.name = "Dicoding Miaw"
//    println("Nama Hewan: ${animal.name}")
//
//    val person = Person()
//    person.name = "Dimas"
//    println("Nama Orang: ${person.name}")
//
//    val hero = Hero()
//    hero.name = "Gatotkaca"
//    println("Nama Pahlawan: ${hero.name}")
//}
//
///*
//output:
//    Fungsi ini sama seperti setter untuk properti name pada class Animal@17f052a3
//    Nilai name dari: Default akan berubah menjadi Dicoding Miaw
//    Fungsi ini sama seperti getter untuk properti name pada class Animal@17f052a3
//    Nama Hewan: Dicoding Miaw
//    Fungsi ini sama seperti setter untuk properti name pada class Person@2e0fa5d3
//    Nilai name dari: Default akan berubah menjadi Dimas
//    Fungsi ini sama seperti getter untuk properti name pada class Person@2e0fa5d3
//    Nama Orang: Dimas
//    Fungsi ini sama seperti setter untuk properti name pada class Hero@5010be6
//    Nilai name dari: Default akan berubah menjadi Gatotkaca
//    Fungsi ini sama seperti getter untuk properti name pada class Hero@5010be6
//    Nama Pahlawan: Gatotkaca
//*/