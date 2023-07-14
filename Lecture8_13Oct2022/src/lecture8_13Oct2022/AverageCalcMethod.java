package lecture8_13Oct2022;

public class AverageCalcMethod {

	public static void main(String[] args) {
		//
		average(2, 2, 5, 8);
	}

	/**
	 * Average calculator for integers
	 * 
	 * @param num1
	 * @param num2
	 * @param num3
	 * @param num4
	 */
	public static void average(int num1, int num2, int num3, int num4) {
		int total = num1 + num2 + num3 + num4;
		double average = (double)total / 4;
		System.out.println("The average is " + average);

	}
}
