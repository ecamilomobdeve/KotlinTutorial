package classandobjects.geometricShapes

import org.junit.Before
import java.awt.print.Book
import kotlin.test.Test
import kotlin.test.assertEquals

internal class CircleTest {
    private lateinit var c :Circle

    @Before fun setup(){
        println(::c.isInitialized)
        c = Circle(5.5)
    }

    @Test
    fun testArea(){
        println(::c.isInitialized)
        var result = c.calculateArea()
        assertEquals(17.2788, result)
        c = Circle(0.0)
        result =c.calculateArea()
        assertEquals(0.0, result)
        result = null
        assertEquals(null, result)
    }
}