operator fun <T> MutableCollection<T>.plusAssign(element: T) {
    add(element)
}

fun main(args: Array<String>) {
    var listOfColors: List<String> = mutableListOf("Red", "Green")

    println(listOfColors)

    listOfColors+= "Blue"

    println(listOfColors)
}