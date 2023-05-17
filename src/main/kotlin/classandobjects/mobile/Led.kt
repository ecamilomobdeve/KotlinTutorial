package classandobjects.mobile

class Led : Screen,Gestures{
    init {
        println("Led init")
    }
    constructor(a:Int):super(a){
        println("Led Second constructor")
    }
    constructor(a:Int, b:String):super(a,b){
        println("Led Third constructor")
    }
    override fun swipeDown(x:Int, y:Int){
        println("Swipe Down")

    }
    override fun swipeDown(x:Int, y:Int, z:Int){

    }
}