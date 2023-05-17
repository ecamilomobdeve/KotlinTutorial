@file:Suppress("ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE")

package utils

import java.util.*

object ControlFlow {
    enum class Bit{
        ZERO, ONE, TWO
    }
    enum class Color{
        RED,GREEN,BLUE
    }

    fun controlFlowIf(){
        val a:Int = -15
        val b = -10
        var max:Int? = null
        max = a
        max = if (a == b) 0 else 1
    }

    fun controlFlowWhen(){
        when(-1) {
            0 -> println("Good night")
            12 ->println("Good Morning")
            1 -> println("Good Afternoon")
            -1 -> println("less than zero")
            //else -> println("Not found") STATEMENT NOT REQUIRED the "else"
        }
        val weather = 3
        when{
            weather < 0 -> println("Ice on the floor")
            weather >0 -> println("having a cold day")
            weather == 0 -> println("Zero weather")
        }

        val numericValue = when (getRandomBit()){
            Examples.Bit.ZERO -> 0
            Examples.Bit.ONE -> 1
            Examples.Bit.TWO ->2
            // expressions NOT require the "else" if cases are covered.
            //else -> print("No number available")
        }
        println("Bit: $numericValue")

        when (getColor()) {
            Examples.Color.RED -> println("red") // no branches for GREEN and BLUE
            else -> println("not red") // 'else' is required
        }

        //common for multiple cases
        val x = 4
        when(x){
            0,1 -> println("x==0 or x==1")
            else-> println("Otherwise")
        }

        //use of arbitrary expressions
        val stringNumber = "1"
        when(x){
            stringNumber.toInt() -> println("number parsed to String")
            else -> println("String not parsed")
        }

        //in or !in range or a collection
        val validNumbers = 1..2
        when(x){
            in 1..10 -> toDoOne()
            !in 1..10 -> println("Not in range 1/10")
            in validNumbers -> println("is valid number")
            else -> println("None of the above")
        }

        // value "is" or "!is" of a particular type
        val value:Boolean = hasPrefix(4)
        println("has prefix @ : $value")

        when(isOdd(x)){
            0 -> println("is Even")
            1 -> println("is Odd")
            in 1..10-> print("is In range")
            else -> println("Error")
        }

    }

    fun controlFlowFor(){
        var x:IntArray = intArrayOf(0,2,4,6,8)
        println("-- IN/UNTIL starting at any value --")
        for (item in 1 until x.size){
            println(x[item])
        }
        println("-- IN for all elements including zero --")
        for (item in x){
            println(item)
        }
        println("-- iterating an array --")
        for (i in x.indices){
            println(x[i])
        }
        println("-- alternatively using withIndex() --")
        for ((index, value) in x.withIndex()){
            println("The element at index: $index is $value")
        }
        println("-- Over a range of numbers decreasing --")
        for (i in x.size-1 downTo 0 step 2){
            println(x[i])
        }
        println("-- iterating an array increasing by N step  --")
        for (i in x.indices step 2){
            println(x[i])
        }
        println("-- iterating over a range --")
        for (i in 4 downTo 0 step 2){
            println(i)
        }
        for (i in 0..4 step 2){
            println(i)
        }
    }

    fun controlFlowWhile(){
        var x = 3
        while (x>=0){
            println(x)
            x--
        }
        x=3
        do {
            println("Enter number: ")
            val read = Scanner(System.`in`)
            val anyChar = read.next().first()
            //var inputNumber = Char (readLine())
        }while (anyChar != 'a')
    }

    fun returnAndJumps(){
        val arrayTwo = arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(4, 5, 6),
            arrayOf(7, 8, 9)
        )
        val list = mutableListOf<MutableList<Int>>()


        val array = Array(3) { IntArray(3) }
        var oddCounter =0
        var evenCounter =0
        var random1 = 0
        loop@ for(i in array.indices) {
            for(j in array.indices) {
                if (j==1){
                    do {
                        random1 = (0..100).shuffled().random()
                    } while (random1 < 50 || isOdd(random1) == 1)
                    array[i][j] = random1
                    break@loop
                }

            }
        }

        println("-- Use of Break and Continue labels --")
        for (i in array.indices){
            for (j in array.indices){
                println("value i:$i and j:$j is  ${array[i][j]}")
            }
        }
        println("-- Use of Return labels --")
        foo()
        println("-- we return from the neatest enclosing function --")
    }
}

fun getRandomBit(): Examples.Bit {
    return Examples.Bit.ONE
}

fun getColor():Examples.Color{
    return Examples.Color.BLUE
}

fun isOdd(x: Int): Int {
    return if(x%2 ==0){
        0
    }else return 1
}

fun hasPrefix(x:Any) = when (x){
    is Char -> x.isLetterOrDigit()
    is String ->x.startsWith("a")
    //!is Boolean -> println("Not a Boolean")
    //is String-> println("Its a String")
    is Boolean -> true
    is Int -> true
    else->false
}

fun toDoOne(){}

fun foo(){
    println("Local return to the caller of the anonymous function - the forEach loop")
    listOf(1,2,3,4,5).forEach lit@{
        if ( it ==3) return@lit
        println(it)
    }
    println("-- done with explicit label --")

    listOf(1, 2, 3, 4, 5)
        .forEach(fun(value: Int) {
            if (value == 3) return
            print(value)
        })
}