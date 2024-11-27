package KotlinPractice

fun main() {
    print("введите число")
    val n = readLine()!!.toInt()

    for (i in 2 until n step 2) {
        println(i)
    }
}