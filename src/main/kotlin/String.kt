fun main() {
    var firstname: String = "Rezky"
    var lastname: String = "Bambang"
    var fullname: String = firstname + " " + lastname
    var address: String = """
    Street Jonggol Premium,
    Provinci Batavia,
    Country Indonesia
    """.trimIndent()
    println(firstname)
    println(lastname)
    println(fullname)
    println(address)

    var alamat: String = """
    >Street Jonggol Medium,
    >Provinci Banten,
    >Country Indonesia
    """.trimMargin(">")
    println(alamat)
    var namalengkap: String = "$firstname $lastname"
    var desc: String = "$fullname length = ${fullname.length}"
    println(namalengkap)
    println(desc)

}