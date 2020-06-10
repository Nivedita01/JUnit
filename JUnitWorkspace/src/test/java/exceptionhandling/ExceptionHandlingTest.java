package exceptionhandling;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Nivedita Hari
 */
public class ExceptionHandlingTest {
    
    public ExceptionHandlingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testMain() {
     new ArrayList<Object>().get(0); 
    }

    @Test (expected = ArithmeticException.class)
    public void testDivideByZero()
    {
        int x = 10/0;
    }
}

