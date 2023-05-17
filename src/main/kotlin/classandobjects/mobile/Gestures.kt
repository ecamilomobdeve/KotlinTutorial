package classandobjects.mobile

interface Gestures {
    fun swipeLeft(){
        println("swipeLeft")
    }
    fun swipeRight(){
        println("swipeRight")
    }
    fun swipeDown(x:Int, y:Int){
        for (i in 1 until 3){
            println(i*(x+y))
        }

    }
    fun swipeDown(x:Int, y:Int, z:Int){

    }
}