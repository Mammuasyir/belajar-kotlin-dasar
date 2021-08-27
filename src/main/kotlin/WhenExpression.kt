fun main() {
    val hasilUjian = 'W'
    when (hasilUjian) {
        'A' -> print("Amazing")
        'B' -> print("Boss")
        'C' -> print("Ccd")
        'D' -> print("Duh")
        'E' -> print("Eh")
        else -> println("Kasihan")
    }
    //----------------------------------------------------------------------------------------------------------
    val hasilUjian1 : Any = "Bambang"
    when (hasilUjian1) {
        is Long -> println("Variablenya bertipe Long")
        is Int -> println("Variablenya bertipe Int")
        is String -> println("Variablenya bertipe String")
        else -> println("Gaada Typenya")
    }
    //----------------------------------------------------------------------------------------------------------
    val value = 50
    val range = 0..100
    when (value) {
        in range -> println("Is avaible")
        //!in range -> println("Not avaible")
        else -> println("Undefined")
    }
    //----------------------------------------------------------------------------------------------------------
    val number = 1
    when (number) {
        1 -> {
            println("satu")
            val nomor = "Nomor"
            println("Ini adalah $nomor satu")
        }
        else -> println("Undefined")
    }
}