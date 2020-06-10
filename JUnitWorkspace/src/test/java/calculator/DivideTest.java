package calculator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nivedita Hari
 */
public class DivideTest {
    
    public DivideTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testQuotient() {
        int numerator = 0;
        int denominator = 0;
        Divide div = new Divide();
        int expResult = 0;
        int result = div.quotient(numerator, denominator);
        assertEquals(expResult, result);
        numerator = 10;
        denominator = 2;
        expResult = 5;
        result = div.quotient(numerator, denominator);
        assertEquals(expResult,result);
    }
    
}
