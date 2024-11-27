package KotlinPractice

fun main() {
    toLow('a')

}

fun toLow(a : Char) {
    a.uppercase()
    val aUnicode = a.toInt()

    print(aUnicode)
}