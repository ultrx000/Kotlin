package KotlinPractice

fun main() {
    println("введите число ")
    val a = readLine()?.toInt()

    if (a != null && a > 0) {
        for (i in a downTo 1) {
            println(i)
            Thread.sleep(500)
        }
        println("старт")
    } else {
        println("некорректное значение")
    }
}