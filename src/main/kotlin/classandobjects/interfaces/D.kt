package classandobjects.interfaces

open class D:A,B {
    override val prop: Int
        get() = TODO("Not yet implemented")

    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
        super<A>.bar()
    }

    override fun test() {
        TODO("Not yet implemented")
    }

}