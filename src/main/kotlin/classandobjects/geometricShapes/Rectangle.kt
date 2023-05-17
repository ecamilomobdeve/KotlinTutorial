package classandobjects.geometricShapes


//declare top level compile time constant
const val MYPI = 3.1416

// declare class with object to make singleton
object Physicss{
    const val GRAVITY =10
}

class Rectangle(private val w:Int, private val h:Int) {
    val otherPi = 3.1416F

    companion object{
        const val SUBSYSTEM_DEPRECATED ="this has been deprecated"
    }

    @Deprecated(SUBSYSTEM_DEPRECATED)
    fun foo() {
        println(SUBSYSTEM_DEPRECATED)
    }

    val pI get() = MYPI

    private var _table: Map<String, Int>? = null
        get() = field
        set(value) {
            field = value
        }
    public val table: Map<String, Int>
        get() {
//            if (_table == null) {
//                _table = HashMap() // Type parameters are inferred
//                println("_table is null")
//            }
            return if (_table == null) {
                _table = HashMap()
                _table as HashMap<String, Int>

            }else _table as Map<String, Int>
               //_table ?: throw AssertionError("Set to null by another thread")
        }

    fun setTable(){
        this._table = null
    }


    /*
    Getters and Setters backing fields
     */
    var age: Int =0
        get() = field
        private set(value) {
            field = when{
                value >=18 -> 18
                else -> 0
            }
        }


    fun updateCounter(x:Int){
        this.age = x
    }

    /*
    Backing properties
     */




}
