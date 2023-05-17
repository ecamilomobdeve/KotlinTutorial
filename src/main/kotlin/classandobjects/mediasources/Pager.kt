package classandobjects.mediasources


interface Pager : Marker {



    fun goToPage(page:Int)
    fun read()
    fun savePage()
    fun goToIndex()
    fun writeComment()
    override fun deleteMarkPageWithColor(color: Int) {
        //
        println("overriding delete in Pager")
    }

}