package classandobjects.`class`

import classandobjects.interfaces.B
import classandobjects.interfaces.G

open class Test: B, G {
    open fun toDo(){
        println("toDo() method in Test Class")
    }

    override fun bar() {
        TODO("Not yet implemented")
    }

    override fun toDoOne(x: Int) {
        TODO("Not yet implemented")
    }

    override fun toDoTwo() {
        TODO("Not yet implemented")
    }


}