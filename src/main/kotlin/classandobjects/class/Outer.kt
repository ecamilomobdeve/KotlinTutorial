package classandobjects.`class`

class Outer {
    val anyValue = 5
    init {
        println("Init Outer class ...")
    }
    private val bar:Int =1
    class Nested{
        init {
            println("Init Nested class in Outer...")
        }
        fun foo()= 2
    }
}