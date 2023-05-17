package classandobjects.mobile

class Oled(quality: String) :PixelDevice(quality){
    override val quality: String
        get() = super.quality

    override fun zoomIn(x: Int) {
        //super.zoomIn(x)
    }

    override fun zoomOut(x: Int) {
        //super.zoomOut(x)
    }
}