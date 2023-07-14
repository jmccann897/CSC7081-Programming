/**
 * 
 */
package math.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author joshm
 *
 */
class NumberCruncherTest {
	
	//global test data
	int num1, num2, num3;
	NumberCruncher nc; //create object to test

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		num1 = 4;
		num2 = 6;
		num3 = -3;
		
		nc = new NumberCruncher(); //call constructor
		
	}

	/**
	 * Test method for {@link math.examples.NumberCruncher#addNumbers(int, int)}.
	 */
	@Test
	void testAddNumbersIntInt() {
		int expected = 10;
		int actual = nc.addNumbers(num1, num2);
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link math.examples.NumberCruncher#addNumbers(int, int, int)}.
	 */
	@Test
	void testAddNumbersIntIntInt() {
		int expected = 7;
		int actual = nc.addNumbers(num1, num2, num3);
		assertEquals(expected, actual);
	}

}
