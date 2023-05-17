package classandobjects.mobile

open class PixelDevice(override val quality: String) : Camera() {
    override fun zoomIn(x: Int) {
        println("Zoom in to $x % ... (mandatory method from abstract class)")

    }

    override fun zoomOut(x: Int) {
        println("Zoom Out to $x % ...(mandatory method from abstract class)")
    }

    override fun takePicture(x:Int) {
        println("overriding method from abstract class (calling method from " +
                "abstract class optionally )")
    }

    override fun rotatePhone() {
    }
}