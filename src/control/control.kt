package control

fun main() {
    var str1: String = "test"
    var str2: String = "test"

    // same as "a===b" for Java.
    println(str1 == str2)

    // same as "b.equals(a)" for Java.
    println(str1 === str2)

    // kotlin don't have "ternary operator".
    // see: https://kotlinlang.org/docs/reference/control-flow.html#if-expression
    val validation: Int = 10
    var result: Int = 0
    if (validation > 5) result = 1
    println(result)

    val validation2: Int = 10
    var result2: Int
    result2 = if (validation2 > 5) 1 else 0
    println(result2)

    // When expression
    useWhen()
}

// see: https://kotlinlang.org/docs/reference/control-flow.html#when-expression
fun useWhen() {
    val score = 60

    when(score) {
        0 -> {
            println("Let's try again!")
        }
        in 1..59 -> {
            println("good!")
        }
        in 60..89 -> {
            println("great!")
        }
        else -> {
            println("excellent!")
        }
    }
}