package lecture7_11Oct2022;

public class StarsLoops {

	public static void main(String[] args) {
		// Think of using loops to make it easily maintainable
		// Print numbers 1-10 in rows with row number of stars in front of each number

		int target = 5;
		int rows = 3;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= target; j++) {
				// loop to print stars
				for (int k = 1; k <= i; k++) {
					System.out.print("*");
				}
				System.out.print(j);
				if (j < target) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}

//		for (int i = 1; i <= rows; i++) {
//			for (int j = 1; j <= target; j++) {
//				//use of string method to get stars
//				System.out.print("*".repeat(i));
//				System.out.print(j);
//				if (j < target) {
//					System.out.print(", ");
//				}
//			}
//			System.out.println();
	}

}


