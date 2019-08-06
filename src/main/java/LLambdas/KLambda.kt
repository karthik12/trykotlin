package LLambdas

fun calculate(x: Int, y: Int, dummy: (Int, Int) -> Int): Int {
    return dummy(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun main() {
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 5) { a, b -> a * b }
    println("sumResult $sumResult, mulResult $mulResult")
}


