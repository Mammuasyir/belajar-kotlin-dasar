package PemrogramanStruktur

fun main() {
    /**
     * for loop???
     * sebuah perulangan dengan kata kunci for pada pemrograman kotlin
     * */

//    melakukan perulangan for loop dan mencari angka genap dan ganjil dari 1-50
    for (x in 0..50) {
        if(x % 2 == 0) {
            println("ini angka genap $x ")
        } else if (x % 2 != 0 ) {
            println("ini angka ganjil $x")
        }
    }

}