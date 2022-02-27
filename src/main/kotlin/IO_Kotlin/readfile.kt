package IO_Kotlin/*
* import library read and write file
* */
import java.io.FileReader
import java.io.FileWriter


fun main() {

    println("Enter a message")
    val message = readLine().toString() //input keyborad menggunakna readline

    //memeriksa apakah user memasukan pesan atau tidak
    if (message == "") {
        println("Please enter a message")
    }else {
        writeToFile(message)
    }
    readFile()
}



fun readFile() {
    val reader = FileReader("message.txt")
    var char: Int?

    try {
        do {
            char = reader.read()
            print(char.toChar())

        }while (char != -1)

    }catch (ex: Exception) {
        print(ex.message)
    }
}


/**
 * membuat fungsi menulis to file dengan FileWriter
 * */
fun writeToFile(message: String) {
    try {
        val writer = FileWriter("message.txt", true)
        writer.write(message + "\n")
        writer.close()

    }catch (ex: Exception){
        println("Exception $ex")
    }
}




//fun readFromFile() {
//    val stream = Files.newInputStream(Paths.get("message.txt"))
//    stream.buffered().reader().use {
//        reader -> println(reader.readText())
//    }
//}