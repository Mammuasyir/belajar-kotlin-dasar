fun main() {     //Function vararg argumen
    println(test("Bambang",1,2,3,4,5,6,7))
    println(contohArray(arrayOf(50,60,70,80)))
}
         //parameter
fun test(name: String, vararg number: Int): String {
    return "angkanya adalah ${number[4]} namanya $name"
}
fun contohArray(number: Array<Int>): String {
    return "angkanya ada ${number[0]}"
}
//varargs(variable argumens)
/*
varargs = menyederhanakan bbrp parameter yang memiliki tipe data yg sama menajdi parameter tunggal.
 */
//Rules varargs :
// 1. tidak boleh ada 2 varargs dalam satu parameter
// 2. kalau ada 2 parameter dalam 1 function, letakan varargs sebagai parameter akhir.