package LLambdas

fun main() {
// All examples create a function object that performs upper-casing.
// So it's a function from String to String

    val upperCase1: (String) -> String = { str: String -> str.toUpperCase() }

    val upperCase2: (String) -> String = { str -> str.toUpperCase() }

    val upperCase3 = { str: String -> str.toUpperCase() }

    val upperCase4: (String) -> String = { it.toUpperCase() }

    val upperCase5: (String) -> String = String::toUpperCase

    println(upperCase2("hello"))
    println(upperCase1("hello"))
    println(upperCase3("hello"))
    println(upperCase4("hello"))
    println(upperCase5("hello"))


    //power of extension and lambda - Functional literals with receivers

    val sum: Int.(Int) -> Int = { other -> plus(other) }

    val sum1 = fun Int.(other: (Int)): Int = this + other


    var greet: String.() -> Unit = { println("Hello $this") }


    greet("Android team")

    //koltin standard library is full of this. -  ex: scope function
    //With generics we can achieve still more - todo

}