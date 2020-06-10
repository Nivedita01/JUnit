package calculator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Nivedita Hari
 */
@RunWith(Suite.class)
	@Suite.SuiteClasses({
		calculator.MultiplyTest.class, 
		calculator.DivideTest.class, 
		calculator.CalculatorTest.class, 
		calculator.SubtractTest.class, 
		calculator.SumTest.class})

	public class CalculatorSuite {

		@BeforeClass
		public static void setUpClass() throws Exception {
		}
	
		@AfterClass
		public static void tearDownClass() throws Exception {
		}
}
