fun main() {
     val names: Array<String> = arrayOf("Mem", "Ski", "Uhuy")
     for (yuhu in names) {
         println(yuhu)
     }
    //-----------------------------------------------------------------------------------------
    //for range
    //val range = 1..10
    for (i in 1..10) {
        println(i)
    }
    //-----------------------------------------------------------------------------------------
    for (you in 0..2) {
        println("Hay You")
    }
    //-----------------------------------------------------------------------------------------
    for (haha in 10 downTo(1) step 2 ) {
        println(haha)
    }
    //-----------------------------------------------------------------------------------------
    val range = 1..5
    for ((value, index) in range.withIndex()) {
        println("index $index valuenya adalah $value")
    }
    //-----------------------------------------------------------------------------------------
    val ranga = 1..5
    for (i in ranga) {
        for (h in 1..6) {
            print("*")
        }
        println()
    }
    //-----------------------------------------------------------------------------------------
    val rangi = 1..5
    for (i in rangi) {
        for (h in i..5) {
            print("0")
        }
        println()
    }
    //-----------------------------------------------------------------------------------------
    val rangee = 1..4
    for (i in rangee) {
        if (i <= 1) {
            print("1")
        } else {
            print("9")

        }
        }
    //-----------------------------------------------------------------------------------------
    val rangeei = 1..5
    for (i in rangeei) {
        if (i % 2 == 1) {
            print("#")
        } else {
            print("-")
        }
        }
    //kalau ada sisa pembagian maka == 1
}