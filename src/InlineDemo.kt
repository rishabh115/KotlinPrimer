inline fun <T> inlined(block: (T:Double) -> Unit) {
    println("before")
    block(300.0)
    println("after")
}

fun main(args: Array<String>) {
    inlined <Double>{
        print(Math.pow(it, 3.0))
    }
}