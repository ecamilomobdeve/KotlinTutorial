package classandobjects.geometricShapes

import kotlin.math.sqrt

/*
Base for Triangles shape
*/
class Triangle (private val base: Double, private val height:Double): Shape(){

    //override fun area():Double = (base*height)/2
    //var otherArea = (base*height)/2

    override fun perimeter ():Double = sqrt(base*base+height*height)+base+height
    override fun area(): Double = (base*height)/2


}