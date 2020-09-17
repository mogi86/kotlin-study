package objects

fun main() {
    val person = Person("Taro", 25)
    person.show()

    val person2 = Person2("Yamada", 28)
    person2.show()

    val person3 = Person3("John", 22)
    person3.show()
}

// see: https://kotlinlang.org/docs/reference/classes.html#constructors
//   The primary constructor cannot contain any code.
//   Initialization code can be placed in initializer blocks, which are prefixed with the init keyword.
class Person(name: String, age: Int) {
    private var name: String
    private var age: Int

    init {
        this.name = name
        this.age = age
    }

    fun show() {
        println("your name is ${this.name}. And your age is ${this.age}.")
    }
}

// Much the same way as regular properties,
// the properties declared in the primary constructor can be mutable (var) or read-only (val).
//
// Property declarations can be omitted if we use syntax like as below.
class Person2(val name: String, val age: Int) {
    fun show() {
        println("your name is ${this.name}. And your age is ${this.age}.")
    }
}

// If the constructor has annotations or visibility modifiers(e.g public),
// the constructor keyword is required, and the modifiers go before it.
class Person3 public constructor(val name: String, val age: Int) {
    fun show() {
        println("your name is ${this.name}. And your age is ${this.age}.")
    }
}