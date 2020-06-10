package calculator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nivedita Hari
 */
public class SumTest {
    
    public SumTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testSummation() {
        int[] nums = {1,2,3,4,5};
        Sum sum = new Sum();
        int expResult = 15;
        int result = sum.total(nums);
        assertEquals(expResult, result);
  
    }
    
}
