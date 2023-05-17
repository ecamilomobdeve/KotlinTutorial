package classandobjects.mobile

abstract class Camera :PhoneActions(){
    abstract val quality:String

    abstract override fun takePicture(x:Int)
    abstract fun zoomIn(x: Int)
    abstract fun zoomOut(x: Int)

    fun closeCamera() {

        println("Abstract method close camera")
    }

    open fun rotatePhone() {
        println("rotate phone as private method")
    }


}