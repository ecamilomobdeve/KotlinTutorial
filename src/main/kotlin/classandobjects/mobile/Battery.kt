package classandobjects.mobile

interface Battery {
    val energyPercentage: Int //abstract
    val propertyWithImpl: String
        get() = "Battery class"
    val type: Int

    fun printClassName()
}