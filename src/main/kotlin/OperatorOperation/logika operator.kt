package OperatorOperation

fun main() {
    /**
     * Logika Operator
     * AND OR dan NOT
     * &&  ||     !
     * || itu bernilai salah jika keduanya bernilai salah, jika tidak maka iya bernilai benar
     * && (And) itu terjadi benar apalbila kedua kondisi itu bernilai benar
     * ! ITU ADALAH KEBALIKAN DARI HASIL KONDISI
     * */

    var nomorPertama = 2
    val nomorKedua = 3
    val nomorKetiga = 5

    if ((nomorKedua < nomorKetiga) && (nomorPertama > nomorKetiga)){
//                 Benar                     Salah
        println ("kondisi berilai benar")

    }else{
        println("kondisi bernilai salah")
    }

    if (!(nomorKedua  > nomorKetiga) ||  !(nomorPertama > nomorKetiga)){
//                Benar                     BENAR
        println ("kondisi bernilai benar")

    }else{
        println("kondisi bernilai salah")
    }
}