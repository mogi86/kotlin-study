package function

fun main() {
    println(calcPlus(10, 20))
    println(calcPlus2(20, 30))

    var num = 2
    var result = num plus 3
    println(result)
}

fun calcPlus(x: Int, y: Int): Int {
    return x + y
}

// see: https://kotlinlang.org/docs/reference/functions.html#single-expression-functions
//   When a function returns a single expression,
//   the curly braces can be omitted and the body is specified after a = symbol:
fun calcPlus2(x: Int, y: Int): Int = x + y

// Infix notation
// see: https://kotlinlang.org/docs/reference/functions.html#infix-notation
infix fun Int.plus(x: Int): Int {
    return this + x
}
