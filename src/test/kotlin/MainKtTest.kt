import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commission() {
        val sum=10000
        val sumMonth=50000
      val result= commission("mastercard",sum=sum, sumMonth = sumMonth)
        assertEquals(5,result)
    }
}