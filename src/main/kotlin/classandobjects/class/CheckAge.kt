package classandobjects.`class`

class CheckAge: OuterInterface.InnerInterface{
    override fun foo(p: Child): Boolean {
        return p.age<=18
    }
}