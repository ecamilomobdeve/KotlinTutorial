package utils

import java.lang.IllegalArgumentException
import utils.Examples.Message as TestMessage//stands for Examples.Message
// If there is a name clash, you can disambiguate by using "as"
// keyword to locally rename the clashing entity:

object ExceptionClasses {
    class Message{

    }

    fun nothingType(){
        val y: TestMessage? = null
        val z:Message? = null
        val a = null
        val l: List<Nothing?> = listOf(null)//Nothing? has ONLY null value
        //compiler infers ?Nothing type if there is no other information
        val x:String? = null
        val s:String = x?: fail("String is null")
        println(s)
    }

    private fun fail(msg:String):Nothing{
        throw IllegalArgumentException(msg)
    }

    fun safeCast(){
        val aInt: Int? = when (val a:Any? = "45.5") {
            is String -> validString(a.filter { !it.isWhitespace() })
            is Char -> validNumbers(a)
            is Int -> a
            is Float -> a.toInt()
            is Long -> a.toInt()
            else -> -1
        }
        println(aInt)
        var b:Any? = "-45.4"
        val c:String? =  b?.toString()?.filter { !it.isWhitespace() }
        println(containsFloatNumber(c))
        println(usingSafeCastInKotlin(b))
    }

    fun ifNullFunctionIsCalled(){
        val person:String? = null
        val department:String? = null
        val head:String? = null
        var value: Any? = person?:getManager()
        println(value)
    }

    fun safeCallOperatorAndLet(){
        val listWithNulls: List<String?> = listOf("Kotlin", null, "home", "car", null, "kitchen")
        for (item in listWithNulls) {
            item?.let { println(it) } // prints Kotlin and ignores null
        }
    }

    fun notUsingTryCatchAndFailing(){
        val n = "@".toInt()
        println(n)
    }

    fun notUsingTryCatchNotFailing(){
        var a:String? = null
        var b = a?.length?:-1 //using the safe call operator "?."
        var c = "Kotlin"
        println("Length: $b")
        println(c?.length)  //c?.length is unnecessary safe call since
                            //c= "Kotlin" is not null

    }

    fun notUsingTryCatchButNPE(){
        val a:String? = null
        val b = a!!.length //using the not null assertion operator "!!"

    }

    fun tryCatchAsStatement() {
        try {
            val data = 20 / 0  //may throw exception
        } catch (e: ArithmeticException) {
            e.printStackTrace()
        } finally {
            continueAfterTryCatch(0)
        }
    }

    fun tryCatchAsExpression(value: Any): Int = try {
        value.toString().toInt()
    }catch (e: NumberFormatException){
        -1
    }finally {
        println("handling exception")
    }

    private fun continueAfterTryCatch(value: Int?){
        println("Continue after try catch block")
    }

    private fun getManager():String?{
        return "Bob"
    }

    private fun validNumbers(x: Any?)=
        if (x is Char && x.isDigit())x.toString().toInt() else -1

    private fun validString(x: Any?) =
        if (x is String && !x.isNullOrBlank() &&
                x.all { c: Char -> c.isDigit()}) x.toInt() else -1

    private fun validFloat(x: Any?) =
        if (x is Float )x.toFloat().toInt() else -1

    private fun containsFloatNumber(x: Any?) =
         if(x is String && !x.isNullOrBlank() && isNumeric(x))x.toFloat()
         else null

    private fun isNumeric(toCheck: String): Boolean {
        val regex = "-?[0-9]+(\\.[0-9]+)?".toRegex()
        return toCheck.matches(regex)
    }

    private fun usingSafeCastInKotlin(x: Any?) =
        x.toString().toFloatOrNull()
}