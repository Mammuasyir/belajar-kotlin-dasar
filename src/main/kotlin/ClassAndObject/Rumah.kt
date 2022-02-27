package ClassAndObject
/**
 * membuat sebuah klass rumah dengan beberapa parameter
 * */
class Rumah(var tipe :String, val harga:Double, val tahunPembangunan :Int, val pemilik:String){
    /*
    * melakukan inisialisasi clas rumah
    * */
    init {
        this.tipe
        this.harga
        this.tahunPembangunan
        this.pemilik
    }

    /**
     * getters and setters adalah sebuah optional pada kotlin tidak seperti java
     * membuat setters dan getters adalah bad programming pada kotlin
     * kootlin menginginkan kita untuk selalu menggunkaan properties untuk mengakses dan set class
     * */
}


fun main() {
    /**
     * membuat sebuah object Rumah
     * */
    val rumah = Rumah("Mewah",20000000.0,2021,"Humam Ajib")

    //mencetak sebuah object rumah
    println("rumah ${rumah.pemilik} tahun pembangunan ${rumah.tahunPembangunan} dengan harga ${rumah.harga} tipe ${rumah.tipe}")

    val ruko = Rumah("Lantai 5",4500000.0,2019,"Dadang")

    println("rumah ${ruko.pemilik} tahun pembangunan ${ruko.tahunPembangunan} dengan harga ${ruko.harga} tipe ${ruko.tipe}")


}