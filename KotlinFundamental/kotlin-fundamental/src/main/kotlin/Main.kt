package com.dicoding.kotlin

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val nama: String = "Kahil"
    print("Hello $nama")
    println("")

    val namaLengkap : String? = "Kahil"
    val namaLengkapLength = namaLengkap?.length?:0
    print("Panjang dari nama lengkap adalah $namaLengkapLength")
    println("")

    val integerList = listOf(4,2,1,5,1,2)
    print(integerList[0])
    println("")

    val integerSet = setOf(4,2,1,5,1,2)
    print(integerSet)
    println("")

    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India",
    )
    print(capital["Jakarta"])
    println("")
    print(capital.getValue("London"))
    println("")

    val anyList = mutableListOf('a', "Kotlin", 3, true)
    println("List Awal : $anyList")
    anyList.add(1,"ad")
    println("Adding Element 'ad' in index 1 of List : $anyList")
    anyList[3] = "Anjay"
    println("Changing Index 3 to 'Anjay' : $anyList")
    anyList.removeAt(2)
    println("Removing Index 2 of List : $anyList")

    val firstWord : String =  "Aku"
    val secondWord : String = "Kamu"
    println("Kita adalah $firstWord dan $secondWord")

    val angka1 : Int = 10
    val angka2 : Int = 20
    val result = angka1 + angka2
    println("$angka1 + $angka2 = $result")

    var isUserPaymentValid: Boolean? = null
    var nullSafetyPayement = isUserPaymentValid?:true

    if(nullSafetyPayement == true){
        println("U need to redo the payment")
    }else if(nullSafetyPayement == false){
        println("transaction success!")
    }else{
        println("error system")
    }

    var Vocal : Char = 'A'

    println("Vocal " + --Vocal)
    println("Vocal " + --Vocal)

//    val text : String = "Kahil"
//    for(char in text){
//        print(char + " ")
//    }
//    println("")

    val statement : String = "Kotlin is \"Awesome!\""
    print(statement + "\n")

    // Menambah tab ke dalam teks
    val tabExample = "Ini\tadalah\tcontoh\ttab."
    println(tabExample)

    // Membuat baris baru di dalam teks
    val newlineExample = "Ini adalah contoh baris pertama.\nIni adalah contoh baris kedua."
    println(newlineExample)

    // Menambah karakter single quote ke dalam teks
    val singleQuoteExample = "Ini adalah contoh karakter single quote: \'"
    println(singleQuoteExample)

    // Menambah karakter double quote ke dalam teks
    val doubleQuoteExample = "Ini adalah contoh karakter double quote: \""
    println(doubleQuoteExample)

    // Menambah karakter backslash ke dalam teks
    val backslashExample = "Ini adalah contoh karakter backslash: \\"
    println(backslashExample)

    val line = """
        Line 1
        Line 2
        Line 3
        Line 4  ss
    """.trimIndent()

    println(line)

    val hour = 8
    println("Office ${if(hour > 7) "Buka" else "Tutup"}")

    val openHours = 7
    var now = 20
    val office: String
    office = if (now > openHours) {
        "Office already open"
    } else {
        "Office is closed"
    }

    println(office)

    val officeOpen = 7
    val officeClosed = 16
    now = 20

    val isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else {
        false
    }

    println("Office is open : $isOpen")

    if (!isOpen) {
        println("Office is closed")
    } else {
        println("Office is open")
    }

    var obj: Any = "Dicoding"

    if(obj is String) {
        // Tidak membutuhkan casting secara eksplisit.
        println("String length is ${obj.length}")
    }else{
        println("Hai")
    }

    for (i in 1..12 step 3) {
        print("$i ")
    }


//    val text: String? = null
//    val textLength = text!!.length
    var y = 1
    do {
        println("Hello Dicoding")
        y++
    } while (y < 5)

}