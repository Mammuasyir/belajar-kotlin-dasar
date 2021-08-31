fun main() {
    println("HUMAM".uppercase())
    println("memski".helloWorld())
    (12.add())
}
//UPDATE DEFAULT FUNCTION STRING
fun String.uppercase(): String {
    return "${this.lowercase()}"
}
//MEMBUAT FUNCTION BARU DI DALAM TIPE DATA STRING
fun String.helloWorld(): String {
    return "$this Hello World"
}
fun Int.add() {
    print("$this 15")
}


