package OperatorOperation

fun main() {
    /*kotlin aritmatik*/
    val nomorPertama = 2
    val nomorKedua = 5

//    val result = nomorkedua * nomorpertama
    println("hasil dari perkalian antara $nomorPertama dan $nomorKedua adalah ${nomorPertama * nomorKedua}")

//    melakukan convert data ke float
    val result = nomorPertama / nomorKedua.toFloat()
    println("hasil dari Pembagian antara $nomorPertama dan $nomorKedua adalah $result")
}