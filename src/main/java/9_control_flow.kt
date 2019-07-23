fun main() {
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "one"                              // 2
        "Hello" -> 1                            // 3
        is Long -> false                        // 4
        else -> 42                              // 5
    }
    return result
}

/**
 * Loops are same as java . for .while. dowhile
 */
class MyClass


fun loop(){
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) { //Ranges explain 
        println("Yummy, it's a $cake cake!")
    }
}