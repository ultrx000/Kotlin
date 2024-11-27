package KotlinPractice

fun main() {
    println(checkChar('1'))

}

fun checkChar(a: Char ): Boolean {
    return a.isLetter()
}