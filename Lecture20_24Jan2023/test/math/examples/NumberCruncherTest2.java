package math.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberCruncherTest2 {

	// global test data
	int num1, num2, num3;
	NumberCruncher nc; // create object to test

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		num1 = 4;
		num2 = 6;
		num3 = -3;

		nc = new NumberCruncher(); // call constructor

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
	 * Test method for
	 * {@link math.examples.NumberCruncher#addNumbers(int, int, int)}.
	 */
	@Test
	void testAddNumbersIntIntInt() {
		int expected = 7;
		int actual = nc.addNumbers(num1, num2, num3);
		assertEquals(expected, actual);
	}

	/**
	 * Test method for
	 * {@link math.examples.NumberCruncher#addNumbers(int, int, int)}.
	 */
	@Test
	void testMultiplyNumbersIntInt() {
		int expected = 24;
		int actual = nc.multiplyNumbers(num1, num2);
		assertEquals(expected, actual);
	}

	@Test
	void testDivNumDoubleDouble() {
		double expected = 3.333;
		double actual;
		actual = nc.divNum(10, 3);
		assertEquals(expected, actual, 0.01); // final arg is the delta (diff allowed for recurring nums)
	}
	
	@Test
	void testDivByZeroException() {
		assertThrows(IllegalArgumentException.class, ()->{
			//executable code that throws the exception goes here
			nc.divNum(num1, 0);
		});
		//lambda expression is ()->{}
	}

}
