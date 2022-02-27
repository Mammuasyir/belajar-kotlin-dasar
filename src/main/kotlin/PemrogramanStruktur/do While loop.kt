package PemrogramanStruktur

fun main() {

    /**
     * do while loop
     * akan memlakukan minimal 1 kali tindakan walaupaun iya tidak maasuk kondisi while
     * */

    var perhitungan = 4

// melakukan perulangan do
    do {

        println("hitung.....$perhitungan")
        perhitungan -- //pengurangan -1 pada value dalam variable perhitungan

    } while (perhitungan >= 5) //memberikan kondisi pada perhitungan

    println("$perhitungan nilai hitung tidak memenuhi kondisi")
}