fun main() {
    val result: String = "memski" to "UP"
    println(result)
    val results: Int = 12 to "tambah"
    println(results)
}

infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.uppercase()
    } else {
        return this.lowercase()
    }
}
infix fun Int.to(type: String): Int {
    if (type == "tambah") {
        return this + 1
    } else {
        return this - 1
    }
}