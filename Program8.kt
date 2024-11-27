package KotlinPractice

fun main() {
    println("введите возраст")
    val a = readLine()!!.toInt()

    if (a >= 18) {
        println("Совершеннолетний")
    }  else if (a < 0) {
        println("некорректно")
    } else {
        println("Несовершеннолетний")
    }
}
