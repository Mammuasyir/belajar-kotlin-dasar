fun main() {
    val listOfNumber = listOf(1,2,3, null, 5,6, null)
    for (i in listOfNumber) {
        if (i == null) continue
        print(i)
    }
    println()
    val listOfMandi = listOf("Wibu ", "Babu ", "Rizky ", "Rodho ", "Air mati ", "Yaha ", "Yehe ")
    for (u in listOfMandi) {
        if (u == "Air mati ") break
        print(u)
    }
}