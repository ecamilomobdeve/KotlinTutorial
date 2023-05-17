package utils.extensions

import java.lang.StringBuilder

//What is this for?
operator fun Any.invoke(){
    println(this)
}
/*
Make it generic adding the generic type before the function name to make it available
in the receiver type (MutableList<T>.swap ...)
 */
fun <T> MutableList<T>.swap(index1:Int, index2:Int){
    var tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

/*
this refers to the receiver object, the one is passed before the dot
in this case is String
 */
fun String.removeFirst() :String? = if (this.isNullOrEmpty())
    this.substring(1,this.length) else null

fun String.subString(x:Int) = this.substring(x)

fun String.sayHello(){
    println("Testing a hello extension")
}

/*
extension functions can't access private members of "this"
in the following cannot access "name" cause it's private in "Human" class
${this.name} please talk
 */
fun Human.speak():String = "please talk"

/*
extensions can be defined with a nullable receiver type, These extensions can be called
on an object variable even if its value is null, and they can check for this == null inside the body.
val z:Int? = null
println(z.toString())
output: Invalid
 */
fun Any?.toStrings():String = this?.toString() ?: "Invalid"
/*
Every Kotlin has Any as a superclass, we can use it to identify any
primitive data type in extensions
 */
fun Any?.getLength():Int = when(this){
    is String -> this.length
    is MutableList<*> -> this.size
    is Array<*> ->this.size
    else -> 0
}

/*
Kotlin support extension properties, much like it supports Functions
 */
var StringBuilder.firstLetter: Char?
    get() = if (this.isEmpty() || this.isNullOrBlank()) null else get(0)
    set(value) = value?.let { this.setCharAt(0, it) }!!

/*
Generic example  works for List using Generics
 */
    var List<Int>.isLast : Int
    get() = 1
    set(value) = TODO()

val <T> List<T>.isLastIndex:Int
    get() = size - 1  //extension doesn't insert members into classes
// there is no efficient way to use backing fields, this is why initializers
//are not allowed in for Extensions Properties
/*
generic example works out for MutableList using Generics
 */
fun <T> MutableList<T>.lastIndexOf():Int = this.size-1

