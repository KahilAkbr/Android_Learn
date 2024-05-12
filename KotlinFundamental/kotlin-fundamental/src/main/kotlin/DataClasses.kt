class User(val name : String, val age : Int){
    override fun toString(): String{
        return "User(name=$name, age=$age)"
    }
}

data class DataUser(val name : String, val age : Int)

//fun main(){
//    val user = User("nrohmen", 17)
//    val dataUser = DataUser("nrohmen", 17)
//
//    println(user)
//    println(dataUser)
//}
//fun main(){
//    val dataUser = DataUser("nrohmen", 17)
//    val dataUser2 = DataUser("nrohmen", 17)
//    val dataUser3 = DataUser("dimas", 24)
//    val dataUser4 = dataUser.copy(age=15)
//
//    println(dataUser4)
//}
fun main(){
    val dataUsers = DataUser("nrohmen", 17)

    val name = dataUsers.component1()
    val age = dataUsers.component2()

    val (names, ages) = dataUsers

    println("My name is $name, I am $age years old")
    println("My name is $names, I am $ages years old")

    println(dataUsers)
}