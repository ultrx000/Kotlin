package KotlinPractice

fun main() {
    println("введите длину списка")
    val a = readLine()?.toInt()

    val list = ArrayList<String>()

    println("введите элементы списка")
    for (i in 1..a!!) {
        list.add(readLine()!!)
    }

    val uniqueSet = list.toSet()
    list.clear()
    list.addAll(uniqueSet)

    for (i in list) {
        println(i)
    }

}