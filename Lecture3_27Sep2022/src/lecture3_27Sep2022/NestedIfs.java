package lecture3_27Sep2022;

public class NestedIfs {

	public static void main(String[] args) {
		// Nested Ifs

		int num1 = 45;
		int num2 = 40;
		int num3 = 35;

		if (num1 > num2) {
			System.out.println("num1 is bigger than num2");

			if (num2 > num3) {
				System.out.println("num2 is bigger than num3 but smaller than num1");

			}
		}

		System.out.println("End of program");

	}

}
