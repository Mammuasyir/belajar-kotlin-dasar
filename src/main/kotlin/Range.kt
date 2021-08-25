fun main() {
    val range = 0..500 step 2
    println(range.count())
    println(range.contains(432))
    println(range.first)
    println(range.last)
    println(range.step)

    val range2 = 1000 downTo 0
    println(range2.count())
    println(range2.step)
    println(range2.last)
    println(range2.first)
    println(range2.contains(675))
}