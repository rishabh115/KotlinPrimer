
fun <T> List<T>.midElement(): T {
    if (isEmpty())
        throw NoSuchElementException("List is empty.")
    return this[size / 2]
}

fun main(args: Array<String>) {
    var list = listOf<Int>(1, 2, 3, 4, 5)
    var mid = list.midElement()
    print(mid)
}