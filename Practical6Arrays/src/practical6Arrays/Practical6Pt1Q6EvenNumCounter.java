package practical6Arrays;

public class Practical6Pt1Q6EvenNumCounter {

	public static void main(String[] args) {
		// Populate an array with all the even numbers 1-100

		int target = 100;
		int totalEven = 0;
		int total = 0;

		// loop to get array size
		for (int i = 0; i <= target; i++) {
			if (i % 2 == 0) {
				totalEven += 1;
			}
		}
		//System.out.println(totalEven);

		int[] evenNums = new int[totalEven];

		for (int counter = 1; counter <= target; counter++) {
			if (counter % 2 == 0) {
				evenNums[counter / 2] = counter;
				total += counter;
			}

		}
		// printing headers
		System.out.printf("%s%8s\n", "Index", "Value");

		// printing array
		for (int counter = 1; counter < evenNums.length; counter++) {
			System.out.printf("%5d%8d\n", counter, evenNums[counter]);

		}
		System.out.printf("The total of all even numbers from 1 to %s is %d", target, total);
	}
}
