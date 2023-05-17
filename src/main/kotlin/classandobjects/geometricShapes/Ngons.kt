package classandobjects.geometricShapes

class Ngons(var sides:Double, var sideLength:Double, var apothem:Double): Shape(){

    override fun perimeter() = sides*sideLength
    override fun area() = (perimeter()*apothem)/2
}