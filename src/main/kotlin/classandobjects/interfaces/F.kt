package classandobjects.interfaces

interface F: A,B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<A>.bar()
        super<B>.bar()
    }

    override fun test() {
        TODO("Not yet implemented")
    }



}