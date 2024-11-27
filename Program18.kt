package KotlinPractice

fun main() {
    println("введите число элементов первого множества")
    val a = readLine()!!.toInt()

    println("введите число элементов второго множества")
    val b = readLine()!!.toInt()

    val set1 = mutableSetOf<Int>()
    println("введите элементы первого множества")
    for (i in 1..a) {
        set1.add(readLine()!!.toInt())
    }

    val set2 = mutableSetOf<Int>()
    println("введите элементы второго множества")
    for (i in 1..b) {
        set2.add(readLine()!!.toInt())
    }

    val intersectSet = set1.intersect(set2)

    for (i in intersectSet) {
        println(i)
    }
}