package utils

import classandobjects.`class`.Person
import kotlin.math.roundToInt

object Examples {
    class Message{

    }

    enum class Bit{
        ZERO, ONE, TWO
    }

    enum class Color{
        RED,GREEN,BLUE
    }

    fun solveMeFirst(a: Double, b: Float):Float{
        return (a + b).toFloat()
    }

    fun printDouble(a:Double){
        println("This is a ${a.javaClass} : $a")
    }

    fun sumScores(scores: Array<Int>):Int{
        var sum = 0
        for(item in scores){
            println(item)
            sum += item
        }
        return sum
    }

    fun explicitNumberConversions(){
        val a:Int =1000
        val b: Int? = a
        val c:Int? = a
        println(c==b)


    }

    fun numbersRepresentationJvm (){
/*    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a*/

        val b: Int = 1000
        val boxedB: Int? = b
        val anotherBoxedB: Int? = b

        //println(boxedA === anotherBoxedA) // true
        println(boxedB === anotherBoxedB) // false
    }

    fun operationNumbers(){
        println(1 + 2)
        println(2_500_000_000L - 1L)
        println(3.14 * 2.71)
        var modulus: Float = 9.5F
        var a :Float = 5.5F
        modulus %= a
        println(-10.5 % 3.3)
        println("modulus: ${modulus.roundToInt()}")
        println("modulus: ${modulus.toInt()}")
        println("modulus: $modulus")
        val x=5/2.toDouble()
        val y =5L/2
        if(x.toInt() ==2){
            println( "${x==2.5} and x is: $x")
        }
        if (y == 2L){
            println(y == 2L)
        }
    }

    fun bitWiseOperations(){
        val x = (12 shr 1) and  0x07 // number 12 shifted to the right bitwise and
        println(x)
    }

    fun floatingPointComparison(){
        println("floating comparison")
        var x = 2.1f
        var y = 3.5f
        var z = 3.5f

        println(z in x..y)
        /**
         * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
         * or a positive number if it's greater than other.
         */
        println(z.compareTo(-0.0))// -0.0 is considered less than 0.0
    }

    fun booleans(){
        var a:Boolean? = null// ? uses for a null value
        var b = false // uses for a not null value
        println(a)
        println(b)
        if (a == null && !b) { //if we uses "val" a!= is redundant cause val cannot be change
            println("null")
        }

    }

    fun nullableTypes(){
        var a: String ?= "abc"
        val b:String ? = null
        var l = a?.length ?: -1
        println("Nullable types: $a and Length: $l")
        if(! a.isNullOrEmpty()){
            println("not null and not empty")
        }else{
            print("empty string")
        }
        println(b?.length?:-1)
    }

    fun usingOnlyNonNullValues(){
        val listNotNulls:List<String?> = listOf("Kotlin", null)
        for (item in listNotNulls){
            item?.let { println(it) }
        }
    }

    fun throwNPE(){
        var b:String?=null
        val l = b!!.length
        println(l)
    }

    fun safeCast(){
        val b =3
        val aInt: Int? = b
        if (aInt == null)
            println(aInt)
        else println("Not null")

        /*
        To avoid exceptions, use the safe cast operator 'as?', which returns null on failure.
         */
        val location: Any = "Kotlin"
        val safeString: String? = location as? String
        val safeInt: Int? = location as? Int
        println(safeString)
        println(safeInt)
    }

    fun collectionsOfNullableType(){
        val nullableList:List<Int?> = listOf(1,2,null,4)
        val intList:List<Int> = nullableList.filterNotNull()
        for(item in intList ){
            println("Collections List: $item")
            //println(intList.size)
            //println("list.contains('3') is ${intList.contains(1)}" )
            println(intList.indexOf(item))
        }

    }

    fun deleteDuplicates(head: List<Int>):List<Int>{
        return head.distinct()
    }

    fun characters(){

        var aChar: Char
        var myString = "e1r4w098e3r0t"
        var otherString:String =""
        var current:Char? = null
        var next:Char? = null
        var newArrayChar: CharArray? = null
        //var newArrayCharSorted: CharArray = CharArray
        for (element in 0 until myString.length-1) {
            aChar = myString[element]
            if(aChar.isDigit()){
                otherString +=aChar
            }
        }
        newArrayChar = otherString.toCharArray()
        println(newArrayChar)
        for (element in 0 until newArrayChar.size-1){
            current = newArrayChar[element]
            next = newArrayChar[element+1]
            println("current: $current  and next: $next")
            if (current>=next){
                newArrayChar[element]=current
                newArrayChar[element+1]= next
            }


        }
        for(item in newArrayChar){
            print(item)
        }

    }

    fun bubbleSort(num: IntArray):IntArray{
        var shifting = true
        var current:Int? = null
        var next:Int? = null
        var position = 0

        for (pasadas in 0 until num.size-1){
            shifting = false
            for (j in 0 until num.size-1){
                current = num[j]
                next = num[j+1]
                if (current>next){
                    num[j+1] = current
                    num[j] = next
                    shifting = true
                }
            }

        }
        for (item in 0 until num.size-1){
            println(num[item])
        }

        return num
    }

    fun solveMeFirst(a:Int, b:Int):Int{
        return a+b
    }

    fun twoSums(nums:IntArray, target:Int):IntArray{
        //val x: IntArray = intArrayOf(15,11,7,1,2,0,9)


        return nums
    }

}

