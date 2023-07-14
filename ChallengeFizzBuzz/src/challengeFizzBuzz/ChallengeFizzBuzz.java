package challengeFizzBuzz;

public class ChallengeFizzBuzz {

	public static void main(String[] args) {
		// print numbers 1 - 100

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				System.out.print("Fizz, ");
			}

			if (i % 5 == 0 && i % 3 != 0) {
				System.out.print("Buzz, ");
			}

			if (i % 5 == 0 && i % 3 == 0) {
				System.out.print("Fizz Buzz, ");
			}

			else {
				System.out.print(i + ", ");
			}

		}

	}

}
