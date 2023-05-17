package classandobjects.`class`

import classandobjects.interfaces.lambda.CheckPerson
import classandobjects.interfaces.sam.MathOperations


object FunctionalInterfaces {
    private var x =5

    /*

     */
    fun test(){
        var clicks = object {
            fun myBoolean(x:Boolean):Boolean{
                return x.and(true)
            }
        } .myBoolean(false)
        println(clicks)
    }


    fun showButtonClicked(x: Int, y:Int){
        val btn = object:MathOperations{
            override fun click(x: Int, y: Int) {
                println("$x and $y")
            }
        }.click(x,y)
        //btn.click(5,10)
    }

    fun printPersonWithSam(listPerson: List<Person>) {
        println("With SAM interface")
        for (element in listPerson) {
            if (CheckPerson { it.getAge() == 18 && it.getName().length == 6 }.validateAge(element)) {
                element.printPerson()
            }
        }
    }

    fun printPerson(listPerson: List<Person>, x:CheckPerson) {
        println("With interface functional")
        for (element in listPerson){
            if (x.validateAge(element)){
                element.printPerson()
            }
        }
    }

    fun testObject():Any{
        return object {
            val hello = "Hello"
            val world = "World"
            override fun toString() = "$hello $world"
        }
    }

    fun addListeners(param: Unit) {

    }
}