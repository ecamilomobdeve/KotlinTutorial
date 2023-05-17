package classandobjects.interfaces.lambda

import classandobjects.`class`.Person

fun interface CheckPerson {

    fun validateAge(p: Person):Boolean
}