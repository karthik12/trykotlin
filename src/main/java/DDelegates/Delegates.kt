package DDelegates

import kotlin.properties.Delegates

class LazySample {
    init {
        println("created!")
    }


    val lazyStr: String by lazy {
        println("computed!")
        "my lazy"
    }

    var obser: String by Delegates.observable("Init Value")
    { _, oldValue, newValue ->
        println(oldValue + newValue)
    }
}

fun main() {
    val sample = LazySample()
    println("lazyStr = ${sample.lazyStr}")
    println(" = ${sample.lazyStr}")

    sample.obser = "first"

    sample.obser = "second"
}