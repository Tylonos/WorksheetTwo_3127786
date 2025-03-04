//Ivan Novik 3127786
package griffith;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversionsTest {

    Conversions conversions = new Conversions(); // Create instance of Conversions class

    @Test
    public void testEuroToDollar() {
        assertEquals(1.1, conversions.euroToDollar(1.0), 0.001);
        assertEquals(11.0, conversions.euroToDollar(10.0), 0.001);
        assertEquals(0.0, conversions.euroToDollar(0.0), 0.001);
    }

    @Test
    public void testDollarToEuro() {
        assertEquals(0.91, conversions.dollarToEuro(1.0), 0.001);
        assertEquals(9.1, conversions.dollarToEuro(10.0), 0.001);
        assertEquals(0.0, conversions.dollarToEuro(0.0), 0.001);
    }

    @Test
    public void testStringToInteger() {
        assertEquals(123, conversions.stringToInteger("123"));
        assertEquals(-45, conversions.stringToInteger("-45"));
        assertThrows(NumberFormatException.class, () -> conversions.stringToInteger("abc"));
    }

    @Test
    public void testIntegerToString() {
        assertEquals("123", conversions.integerToString(123));
        assertEquals("-45", conversions.integerToString(-45));
        assertEquals("0", conversions.integerToString(0));
    }

    @Test
    public void testSwitchCase() {
        assertEquals("hELLO", conversions.switchCase("Hello"));
        assertEquals("tEsT123", conversions.switchCase("TeSt123"));
        assertEquals("123!", conversions.switchCase("123!"));
    }
}