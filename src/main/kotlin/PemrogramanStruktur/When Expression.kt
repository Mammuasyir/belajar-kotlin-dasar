package PemrogramanStruktur

fun main() {
    /**
     * when expression adalah salah satu percabangan dalam pemrograman kotlin
     * dalam bahasa pemrograman lain mirip seperti switch case
     * when Expression (swich case) + Readline???
     * */

    /*aplikasi tebak tebakan umur*/

    println("saya sekolah di sd negeri indonesia kelas 5 tebak umur saya 10 tahun kedepan")
    val jawaban = readLine()!!.toInt() //menggunakan input keyboard

//    umur 23
    /*
    * menggunakan when expresion
    * */
    when(jawaban){
        18 -> print("anda salah menebak umur")
        19 -> print("waduuh kurang dikiiiitt lagi abangg ")
        20 -> print("kurang sangat amat dikit bangg")
        22 -> print("kurang sangat amat dikit sekali baang")
        23 -> print("yuuup horeee anda benar sekalih")
        else -> {
            print("jauh banget banggg tebakannya")
        }
    }
}