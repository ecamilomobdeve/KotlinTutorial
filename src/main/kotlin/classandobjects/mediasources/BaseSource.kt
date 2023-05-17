package classandobjects.mediasources

open class BaseSource(date:String, sourceName:String) : Pager{

    override val colorMarker: Int
        get() = (0..10).shuffled().random()

    override fun markPageWithColor(color: Int) {
        println("mark page with color")

    }


    init {
        println("Base source: $date and $sourceName")
    }

    override fun goToPage(page: Int) {
        TODO("Not yet implemented")
    }

    override fun read() {
        println("Reading ...")
    }

    override fun savePage() {
    }

    override fun goToIndex() {
    }

    override fun writeComment() {
        TODO("Not yet implemented")
    }




}