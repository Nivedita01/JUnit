package testsuite;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Nivedita Hari
 */
public class SuiteTest1 {
    @Test
    public void testPrintMessage()
    {
        int num=5;
        Assert.assertEquals(5,num);
    }
}
