package math.examples;

public class NumberCruncher {
	
	/**
	 * default constructor
	 */
	public NumberCruncher() {
		
	}

	/**
	 * Method to add two nums and return results
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int addNumbers(int num1, int num2) {
		return num1+num2;
	}
	
	/**
	 * Method to add three nums and return results
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public int addNumbers(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	/**
	 * Method to multiply two ints
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int multiplyNumbers(int num1, int num2) {
		return num1*num2;
	}
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 * @throws illegal arg exception if div by 0
	 */
	public double divNum (double num1, double num2) {
		if (num2==0) {
			throw new IllegalArgumentException("Can't divide by zero");
		}
		return num1/num2;
	}
}
