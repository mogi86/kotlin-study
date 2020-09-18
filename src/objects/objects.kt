package objects

fun main() {
    val person = Person("Taro", 25)
    person.show()

    val person2 = Person2("Yamada", 28)
    person2.show()

    val person3 = Person3("John", 22)
    person3.show()

    //--
    // It seems that the constructor to be called can be changed
    // depending on the difference in the arguments.
    //__
    // call "Secondary Constructor 2"
    val calc1 = Calc()
    println(calc1.getResult())
    // call "Primary Constructor"
    val calc2 = Calc(200, 300)
    println(calc2.getResult())

    val dog = Dog("Hachi")
    val result = dog.showName()
    println(result)

    val benz = Benz()
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

// Secondary constructors
class Calc(val x: Int, val y: Int) {
    init {
        println("Primary Constructor. x=${this.x}, y=${this.y}")
    }

    // Secondary constructor 1
    constructor(x: Int) :this(x, 100) {
        println("Secondary Constructor 1")
    }

    // Secondary constructor 2
    constructor() :this(20) {
        println("Secondary Constructor 2")
    }

    fun getResult(): Int {
        return this.x * this.y
    }
}

// Inheritance
// see: https://kotlinlang.org/docs/reference/classes.html#inheritance
//   By default, Kotlin classes are final: they can’t be inherited.
//   To make a class inheritable, mark it with the "open" keyword.
open class Animal(var name: String) {
    open fun showName(): String {
        return this.name
    }
}

class Dog(name: String) : Animal(name) {
    override fun showName(): String {
        return "name is ${this.name}"
    }
}

// initialization order
// see: https://kotlinlang.org/docs/reference/classes.html#derived-class-initialization-order
//   initialization is ran as below order.
//     1. Super class
//     2. Derived class
open class Car {
    init {
        println("I'm super class.")
    }
}

class Benz : Car() {
    init {
        println("I'm derived class.")
    }
}
