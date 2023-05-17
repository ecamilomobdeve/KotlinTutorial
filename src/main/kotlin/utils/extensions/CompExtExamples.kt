package utils.extensions

class CompExtExamples {
    var y = 5
    fun getCompanionValue() = x

    /*
    an object declaration can be marked with the 'companion' keyword
    Members can be called by using the class name as the qualifier
    val instance = CompExtExamples.create()
     */
    companion object {
        private var x = 6
        const val PI = 3.1416

        /*
        name of the companion object(in this case Factory) can be omitted and the 'Companion'
        will be used example: val instance = CompExtExamples.Companion.create()
         */
        fun create(): CompExtExamples = CompExtExamples()
        fun print() {
            println("print in companion object")
        }

        fun getSum(x: Int, y: Int) = x + y
    }
}