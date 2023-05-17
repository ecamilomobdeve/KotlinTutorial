package classandobjects.mobile

class  Mobile  (_available: Int, _payment: Int):CommDevice(_available,_payment){
    //class properties
    var brand: String = ""
    var model: String = ""
    var mrp: Float = 0f
    var discount: Float = 0f
    init {
        this.available = _available
        this.payment = _payment

        println("primary constructor")
    }

    // Second secondary constructor
    constructor(_available:Int, _payment:Int, _brand: String, _model: String) : this(_available,_payment) {
        this.available = _available
        this.payment = _payment
        this.brand = _brand
        this.model = _model
        println("Second secondary constructor")
    }

    // Third secondary constructor
    constructor(_available:Int, _payment:Int, _brand: String, _model: String,
                _mrp: Float, _discount: Float):this(_available,_payment){
        this.available = _available
        this.payment = _payment
        this.mrp = _mrp
        this.discount = _discount
        println("Third secondary constructor")
    }

    //member function
    fun getActualPrice():Float{
        return mrp - discount
    }

    fun printDetails(){
        println("Mobile details:")
        println("Available: $available")
        println("Payment: $payment")
        println("Brand: $brand")
        println("Model: $model")
        println("MRP: $mrp")
        println("Discount: $discount")
    }

    fun addMoney(x:Int){
        super.addBalance(x)
    }

    fun reviewMoney(){
        super.checkBalance()
    }

    fun updatingSerialNumber(sn:String){
        this.serialNumber = sn
        println("sn updated to : ${this.serialNumber}")
    }
}
