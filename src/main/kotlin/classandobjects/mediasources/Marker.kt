package classandobjects.mediasources

interface Marker {
    val colorMarker:Int

    val sizeMarker:Int
        get() = 12
    fun markPageWithColor(color:Int)
    fun deleteMarkPageWithColor(color:Int){
        println("Delete marked page in Marker interface: $color")
    }
}