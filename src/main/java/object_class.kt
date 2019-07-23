object ObjectClass {
    fun doSomeTransaction() {
        println("I am doing some transaction!!")
    }
}

fun main() {
    ObjectClass.doSomeTransaction()
    Companion.getValue()
}


class Companion {

    companion object {
        @JvmStatic //Interop
        fun getValue(): String {
            return "I am companion"
        }
    }
}
