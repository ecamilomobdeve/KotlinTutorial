package classandobjects.mediasources

class Magazine(private var issuedNumber:Int, date: String, tittle: String):BaseSource(date,tittle) {

    init {
        println("Building Magazine: $tittle ")
    }
    
    fun getIssueNumber() = this.issuedNumber

}