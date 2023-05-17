package classandobjects.mobile

import kotlin.reflect.KClass

open class CommDevice(_available: Int, _payment: Int) {
    var available =0
    var payment = 0
    protected var serialNumber = "no sn"
    init {
        this.available = _available
        this.payment = _payment
        println("constructor CommDevice: $available and $payment  ")
    }

    protected fun makeCalls(number:String ="911"){
        println("calling from CommDevice to :$number")
    }

    protected  fun addBalance(balance:Int){
        println("Adding $$balance to $$available")
        this.available += balance

    }

    protected  fun checkBalance(){
        println("current Balance is: $available ")
    }
}