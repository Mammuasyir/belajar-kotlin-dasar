fun main() {
    val names: Array<String> = arrayOf("Agus", "Febri", "Bandi")
    val agus: String = names[0]
    val febri: String = names.get(1)
    val bandi: String = names.get(2)

    //names.set(2, "Bamboo")
    names[2] = "Bamboo"
    println(names[2])

    val nullArray: Array<String?> = arrayOfNulls(6)

    nullArray[0] = "Bambang"
    nullArray[1] = "Rewbo"
    nullArray[4] = "Ragil"

    println(nullArray.contentToString())
    println(nullArray.size)
}