package variable

fun main() {
    var num: Int = 123
    num = 777

    println(num)

    // null
    useNull()
}

fun useNull() {
    // Basically, kotlin don't allow null.
    // But,can set "null" if use "?".
    var str: String?
    str = null

    println(str)

    // Safe calls
    // see: https://kotlinlang.org/docs/reference/null-safety.html#safe-calls
    var num: Int?
    num = null
    println(num?.compareTo(123))
}
