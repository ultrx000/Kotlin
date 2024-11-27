package KotlinPractice

fun main() {
    print("введите элементы списка через запятую: ")
    val inputString = readLine()!!
    val elements = inputString.split(",").map { it.trim() }

    val elementCounts = mutableMapOf<String, Int>()
    for (i in elements) {
        elementCounts[i] = (elementCounts[i] ?: 0) + 1
    }

    println("Результат: $elementCounts")
}