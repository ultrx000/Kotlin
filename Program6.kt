package KotlinPractice

fun main() {
    print(deleteAndAdd(toArray("лолкек")))


}

fun toArray(a: String): Array<Char?> {
    val array = arrayOfNulls<Char>(a.length)
    for (i in a.indices) array[i] = a[i]

    return array
}

fun deleteAndAdd(array: Array<Char?>): String {
    val firstSecond = array.copyOfRange(0, 2)
    val c = array.copyOfRange(2, array.size)


    return array.contentToString()
}