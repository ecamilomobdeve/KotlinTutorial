package classandobjects.`class`

class Person constructor(name: String ) {
    private var name = name
    private var age: Int? = null
    private var phone:String? = null


    init {
        this.name = name
        //println("Primary constructor name: $name")
    }

    class Person private  constructor(){}
    constructor(name: String, age:Int) : this(name) {
        this.age = age
        //println("secondary constructor called $name and $age")

    }

    constructor(name: String, age: Int, phone:String) : this(name, age) {
        this.age = age
        this.phone = phone
        //println("constructor called $name and $age and $phone")
    }

    fun updateAge(){
        println(phone)
    }
    fun getAge(): Int? {
        return this.age
    }
    fun printPerson(){
        println("person: ${this.name} , ${this.age}")
    }
    fun getName():String{
        return this.name
    }

}











/*
constructor(a:Int,b:Int) :this(a,b,7){

}
constructor(a:Int, b:Int, c:Int){
    var sum = a+b+c
    println(sum)
}*/

/*class Person(private val firstName: String, private val lastName: String, private var age: Int) {

    constructor(address:String,  firstName: String,   lastName: String,  age: Int):this(firstName,lastName,34){

    }

    fun updateAge(){}

}*/
