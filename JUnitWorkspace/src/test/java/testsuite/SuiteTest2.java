package testsuite;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Nivedita Hari
 */
public class SuiteTest2 {
    @Test
    public void testPrintMessage()
    {
        String hello = "Hello World";
        Assert.assertNotNull(hello);
        Assert.assertEquals("Hello World", hello);
    }
}
