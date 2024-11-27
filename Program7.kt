package KotlinPractice

fun main() {
    val a: String? = "йооооу"
    safety(a!!)
}
fun safety(a: String) {
    if (a != null) {
        println(a.length)
    } else {
        println("строка пуста")
    }
}