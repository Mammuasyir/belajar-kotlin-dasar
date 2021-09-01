fun jumlahan(a: Int, b: Int): Int {
    val hasil = a + b
    return hasil
}
fun bagian(a: Int, b: Int): Int {
    if (b == 0) {
        return 0
    } else {
        val hasilnya = a / b
        return hasilnya
    }
}

fun main() {
    println(jumlahan(100, 29))
    println(jumlahan(54, 56))
    println(bagian(100, 5))
    println(bagian(50, 0))
}
