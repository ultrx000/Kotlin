package KotlinPractice

fun main() {
    stringUnit("Привет", "меня", "зовут", "Максим", "!")
}

fun stringUnit(a: String, b: String, c: String, d: String, e: String) {
    val concat = "$a $b $c $d $e"
    print(concat)
}