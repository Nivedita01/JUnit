package calculator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nivedita Hari
 */
public class MultiplyTest {
    
    public MultiplyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testTimes() {
        int c = 10;
        int d = 34;
        Multiply mul = new Multiply();
        int expResult = 340;
        int result = mul.times(c, d);
        assertEquals(expResult, result);
        
    }
    
}
