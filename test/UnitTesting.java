import jdk.jfr.StackTrace;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTesting {

    @Test
    public void testSum() {
        assertEquals(10, 5,5);
    }

    @Test
    public void testDifference() {
        assertEquals(15, 20,5);
    }

    @Test
    public void testDivision() {
        assertEquals(21, 210,10);
    }

    @Test
    public void testMultiply() {
        assertEquals(14, 2,7);
    }
}
