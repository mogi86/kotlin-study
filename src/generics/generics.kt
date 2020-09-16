package generics

// see: https://kotlinlang.org/docs/reference/generics.html#generics

fun main() {
    val box1: Box<Int> = Box<Int>(100)
    val num: Int = box1.value
    println(num.plus(200))
}

class Box<T>(val value: T)