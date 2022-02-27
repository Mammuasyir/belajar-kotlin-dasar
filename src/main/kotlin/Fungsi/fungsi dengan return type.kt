package Fungsi
/**
 * fungsi dengan parameter dan return type
 * */

fun main() {
    println(Perkalian(3,4)) //memanggil fungsi Perkalian dan mencetaknya
    val pembagian = Perkalian(12,2)/ angkaBagi(4) // memberikan nilai variable
    println(pembagian)
    HelloWord() //memanggil fungsi helloword
    println(Nama())//memanggil fungsi nama
}

/*membuat fungsi Perkalian dengan return type Integer*/
fun Perkalian(angkaPertama:Int, angkaKedua:Int):Int{
    val hasil = angkaKedua * angkaPertama
    return hasil
}

/*membuat fungsi pembagian dengan return type Integer*/
fun angkaBagi(angka_bagi:Int):Int{
    return angka_bagi
}

/*membuat fungsi Hellowrod tanpa parameter dan tanpa pengembalian*/
fun HelloWord(){
    print("bismillah hirrahmanirahim")
}

/*fungsi tanpa parameter dengan pengembalian*/
fun Nama():String{
    val nama = readLine()
    return nama.toString()
}