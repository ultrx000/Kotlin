package KotlinPractice


fun main() {
    unicode('A', 'B')

}

fun unicode(a: Char, b: Char) {
    val aUnicode = a.toInt()
    val bUnicode = b.toInt()
    val diff = aUnicode - bUnicode

    println(diff)
}