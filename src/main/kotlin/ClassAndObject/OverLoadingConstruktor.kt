package ClassAndObject


/**
 * pembuatan class and object dengan overloading konstruktor pada class kendaraan
 * */

class Kendaraan(){
    //    set properies
    var nama :String?=null
    var roda :String?=null
    var sayap:Int?=null
    var warna:String?=null

    /*
    * membuat construktor dengan 4 parameter
    * */
    constructor(nama:String,roda:String,sayap:Int,warna:String):this(){
        this.nama = nama
        this.roda = roda
        this.sayap = sayap
        this.warna = warna

        println("object : "+ this.nama)
        println("object : "+ this.roda)
        println("object : "+ this.sayap)
        println("object : "+ this.warna)
    }

    /*
    * membuat construktor ke 3 dengan 3 parameter
    * */

    constructor(nama: String,warna: String,roda: String):this(){
        this.nama = nama
        this.warna = warna
        this.roda = roda

        println("object : "+ this.nama)
        println("object : "+ this.roda)
        println("object : "+ this.warna)
    }

    constructor(nama: String,warna: String,sayap: Int):this(){
        this.nama = nama
        this.warna = warna
        this.sayap = sayap

        println("object : "+ this.nama)
        println("object : "+ this.sayap)
        println("object : "+ this.warna)
    }

    /*
    * membuat construktor ke 5 dengan 2 parameter
    * */
    constructor(nama: String,warna: String):this(){
        this.nama = nama
        this.warna = warna

        println("object : "+ this.nama)
        println("object : "+ this.warna)
    }
}

fun main() {
    var becak = Kendaraan("Becak","hitam")

    var garudaAir= Kendaraan("Pesawat","tiga",2, "Coklat")

    var roket= Kendaraan("Roket", "Ungu", 3)


}