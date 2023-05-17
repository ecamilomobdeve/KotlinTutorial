package classandobjects.mobile


open class Screen{
    private var size = 0
    private var type =""
    private var price =0
    init {
        println("Screen init ...")
    }
    constructor(_size:Int){
        this.size = _size
        println("Screen second constructor: size $size")

    }

    constructor(_size: Int, _type:String):this(_size){
        this.size = _size
        this.type = _type
        println("Screen third constructor ...")
    }
    constructor(_size: Int, _type:String, _price:Int):this(_size){
        this.size = _size
        this.type = _type
        this.price = _price
        println("Screen Third four constructor ...")

    }

}