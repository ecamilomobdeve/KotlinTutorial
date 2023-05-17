package classandobjects.`class`

class OuterClass {
    class InnerClass(){
        init {
            println("we're in a Inner Class")
        }
    }
    interface InnerInterface{
        fun foo(){ println("foo() in a InnerInterface")}
    }
}