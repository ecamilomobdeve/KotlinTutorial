package utils.lambda

import classandobjects.`class`.Person

object Lambda {
    data class Person(val title: String, val age: Int)
    data class Result(val result:Int, val error:String )
    fun function():Result{
        return Result(5,"error")
    }

    /*
    a return inside a lambda expression will return from the enclosing function
     */
    fun foo(){

        val vals = listOf(1,2,3,4,5,6)
        vals.forEach {
            if (it==3)
                return // returns to the foo() method which is the caller and DON'T execute any step within the foo() method
            println(it)
        }
        println("lets continue with Lambda")
    }

    /*
    A return statement without a label always returns from the function declared with the fun keyword
     */
    fun bar(){
        val any = fun() {
            for (i in 1 until 3){
                println(i)
                if (i==2)
                    return // returns to anonymous function and continue to next step in bar() function
            }

        }
        any()
        println("lets continue with AF")
    }

    /*
    return a value from a Lambda expression
    you can return a value from Lambda explicitly using ...ints.filter lit@{ ...return@liit  or return@filter

    Often it is more convenient to use implicit labels, because such a label has the same name as the function to which the lambda is passed.
    */
    fun returnValueImplicitly(){
        val ints= listOf(1, 2,3,4,5,6,8,10)
        val output = ints.filter{
            return@filter it%2==0 && it>4
        }
        println(output)
    }

    /*
    local return to the caller of the lambda - the 'filter' collection and
    it returns only from the lambda expression
     */
    fun returnValueExplicitly() {
        val ints = listOf(2, 1, 3, 5, 4, 8, 6, 10)
        val output = ints
            .filter lit@{
                return@lit it % 2 == 0 && it > 4
            }.sortedBy { it }
        println(output)
    }

    /*
    trailing lambda if the last parameter of a function is a function, then a lambda exp passed as the corresponding
    argument can be places outside of the parentheses
     */
    fun returnTrailingLambda(){
        val strings = listOf("banana","apple","pineapple","orange","grape")
        val fruits = strings
            .filter { it.length == 5 }
            .sortedBy { it }
            .map { it.toUpperCase()}
        println(fruits)
    }

    /*
    If the lambda parameter is unused, you can placed an underscore instead of its name
     */
    fun underscoreUnusedVariable(){
        val values = mapOf("1" to "x", "2" to "y", "-3" to "z")
        println(values.entries)
        values.forEach{(x,_)->println("$x ")}
        println(values)
        values.mapValues { (_, value) -> "$value" }
    }

    /*
    Destructuring in lambdas
     */
    fun destructuring(): Unit {
        val map1 = mapOf("beverage" to 2.7, "meal" to 12.4)
        val map2: Map<String, String> = map1.mapValues { entry
            ->
            "${entry.key}! ${entry.value}!"
        }
        println(map2)

        val person = Person("Jon", 23)
        val name = person.component1()
        println(name)

        for ((a, b) in map1) {
            println("$a $b")
        }
    }
}

