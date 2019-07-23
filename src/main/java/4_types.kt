fun main() {
    /**
     * Any
     * Unit
     * Any?
     * Unit?
     */
    fun types(): Unit {

    }


    println(types())

    /**
     * Java type inference
     */

    println(Helper().interOpFunc())

    /**
     * Explain interop type
     */
    val interOpNullFunc = Helper().interOpNullFunc()

    /**
     * Elvis explain
     */
    interOpNullFunc.length

}