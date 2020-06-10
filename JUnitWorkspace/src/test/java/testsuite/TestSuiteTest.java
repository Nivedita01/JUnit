package testsuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Nivedita Hari
 */
@RunWith(Suite.class)				
	@Suite.SuiteClasses({				
		SuiteTest1.class,
		SuiteTest2.class,  			
	})		

	public class TestSuiteTest {
        public TestSuiteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testMain() {
    }
}