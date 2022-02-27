package ClassAndObject
/**
 * membuat class animal dan class Kucing yang merupakan inheritance dari Animal,
 * membuat object dari kelas yang telah dibuat
 * */

/**
 * membuat class Animal dengan hak akses open
 * */
open class Animal(){
    //    deklarasi variable
    var name:String? =null
    var color:String? =null
    var jumlahKaki:Int? =null

    //    membuat konstruktor
    constructor(name:String,color:String,jumlahKaki:Int):this() {
        this.color = color
        this.name = name
        this.jumlahKaki = jumlahKaki

    }
}

/**
 *melakukan inherintance atau pewarisan sifat animal kepada kucing
 * */

class Kucing() :Animal() {

}


fun main() {
    var animal = Animal("ayam","merah",2) //    pembuatan object
    println("Jumlah Kaki ${animal.name} adalah ${animal.jumlahKaki}")
//    pembuatan object kucing dari class Kucing
    var kucing = Kucing()
    kucing.name = "Anak Kucing"
    kucing.jumlahKaki = 4
    println("Jumlah Kaki ${kucing.name} adalah ${kucing.jumlahKaki}")

}