package classandobjects.geometricShapes
/*
Base class for circles instances
*/

// top level for compile time constant
const val PI = 3.1416

//declare class with object to make singleton
object CircleConstants{
    const val PI_CONSTANT = 3.1416
}

open class Circle(private var radius:Double?): Figure() {
    //using companion object
    companion object{
        const val ANOTHER_PI = 3.1416
    }

    private var mPi:Double = 3.1416
    override fun draw() {
        super.draw()
        println("Override methods")
    }

    override fun fill() {
        super.fill()
        println("fill")
    }

    fun calculateArea(): Double? {
        return this.radius?.times(ANOTHER_PI)
    }

    //formula for perimeter
    /*init {
        this.mPi = 9.3
    }*/

}