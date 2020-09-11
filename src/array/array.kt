package array

fun main() {
    // array
    useArray()
}

fun useArray() {
    // It seems that it's possible to set multiple type of value if use "arrayOf".
    var data = arrayOf(1, 2, 3, "test")
    println(data.size)
    println(data[3])

    // It isn't allowed if use "Array".
    // see: https://kotlinlang.org/docs/reference/basic-types.html#arrays
    var data2: Array<Int?> = arrayOfNulls(5)
    data2[0] = 100
    println(data2.get(0))
    println(data2.get(1))

    var data3: Array<Int>
    data3 = Array(5) {i -> (i * 3)}
    for (v in data3) {
        print("$v ")
    }
    println()
}