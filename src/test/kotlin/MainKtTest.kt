import org.junit.Test

import org.junit.Assert.*

class MainKtTest {
    @Test
    fun commissionvkPay() {
        val sum=45_000
        val sumMonth=50000
        val result= commission("VKPay",sum=sum, sumMonth = sumMonth)
        assertEquals(0,result)
    }

    @Test
    fun commissionVisa() {
        val sum=100
        val sumMonth=50000
        val result= commission("visa",sum=sum, sumMonth = sumMonth)
        assertEquals(35,result)
    }
    @Test
    fun commissionMir() {
        val sum=10000
        val sumMonth=50000
        val result= commission("mir",sum=sum, sumMonth = sumMonth)
        assertEquals(75,result)
    }
    @Test
    fun commissionMaesto() {
        val sum=100
        val sumMonth=50000
        val result= commission("maestro",sum=sum, sumMonth = sumMonth)
        assertEquals(20,result)
    }
    @Test
    fun commissionMaestoMax() {
        val sum=15000
        val sumMonth=80000
        val result= commission("maestro",sum=sum, sumMonth = sumMonth)
        assertEquals(110,result)
    }
    @Test
    fun commissionMastercard() {
        val sum=10000
        val sumMonth=50000
        val result= commission("mastercard",sum=sum, sumMonth = sumMonth)
        assertEquals(0,result)
    }

    @Test
    fun commissionvkMastercardMax() {
        val sum=45_000
        val sumMonth=50000
        val result= commission("mastercard",sum=sum, sumMonth = sumMonth)
        assertEquals(140,result)
    }
    @Test
    fun commissionvkOther() {
        val sum=45_000
        val sumMonth=50000
        val result= commission("mastercar",sum=sum, sumMonth = sumMonth)
        assertEquals(0,result)
    }
}