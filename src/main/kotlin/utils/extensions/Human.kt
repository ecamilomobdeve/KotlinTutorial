package utils.extensions

class Human(private val name:String) {
    fun printFunctionType(){
        println("A human Class method")
    }
    fun overloadMemberFunction(){
        println("Overloaded human class method")
    }
}


fun Human.printFunctionType(){
    println("A human Extension Function")
}
/*
its ok to overload a member function with an extension if has the same name but different
signature
 */
fun Human.overloadMemberFunction(x:Int){
    println("overloading class method Extension function: $x ")
}