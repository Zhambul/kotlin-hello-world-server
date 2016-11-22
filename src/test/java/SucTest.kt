import org.junit.Test
import kotlin.test.assertEquals

/**
 * Created by zhambyl on 23/11/2016.
 */
class SucTest {

    @Test
    fun test() {
        val a = 2 * 2
        assertEquals(a, 4)
    }

    @Test
    fun failTest() {
        val a = 2 * 2
        assertEquals(a, 4)
    }
}