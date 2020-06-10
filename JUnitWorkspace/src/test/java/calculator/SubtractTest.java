package calculator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nivedita Hari
 */
public class SubtractTest {
    
    public SubtractTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testMinus() {
        int a = 17;
        int b = 5;
        Subtract sub = new Subtract();
        int expResult = 12;
        int result = sub.minus(a, b);
        assertEquals(expResult, result);
     
    }
    
}
