import utils.extensions.*

interface Factory <T>{
    fun create():T
}

class Example {
    fun printFunctionType() { println("Class method") }
    companion object: Factory<Example> {
        override fun create(): Example {
            println("creating ...")
            return Example()
        }
    }
}

class MyTest{
    companion object: Factory<Int>{
        override fun create(): Int {
            println("creating Int")
            return 10
        }
    }
}

fun Example.printFunctionType() { println("Extension function") }
fun Example.printFunctionType(i: Int?){
    println(i?:-1)}

fun main() {
    val c = Example

    val f: Factory<Example> = Example
    val g: Factory<Int> = MyTest
    f.create()
    println(g.create())
    val instance = CompExtExamples.create()
    println(CompExtExamples.PI)
    println(CompExtExamples.getSum(4,4)*CompExtExamples.PI)
}