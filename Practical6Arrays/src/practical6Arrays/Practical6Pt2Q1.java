package practical6Arrays;

public class Practical6Pt2Q1 {

	public static void main(String[] args) {
		// initialise 2d int array

		int[][] a2DArray = new int[4][4];

		// initial value to start array
		int seed = 2;

		// row looper
		for (int rowCounter = 0; rowCounter < a2DArray.length; rowCounter++) {
			// column looper
			for (int colCounter = 0; colCounter < a2DArray[rowCounter].length; colCounter++) {
				// assign value
				a2DArray[rowCounter][colCounter] = seed;
//				System.out.println(a2DArray[rowCounter][colCounter]);
				seed += 2;
			}
		}

		print2DArray(a2DArray);
		System.out.println(total2DArrayCalculator(a2DArray));
		System.out.println(avg2DArray(a2DArray));

	}

	public static double avg2DArray(int[][] a2DArray) {
		int tot = 0;
		int elemCount = 0;
		for (int i = 0; i < a2DArray.length; i++) {
			for (int j = 0; j < a2DArray[i].length; j++) {
				tot += a2DArray[i][j];
				elemCount++;
			}
		}
		return tot / elemCount;
	}

	public static int total2DArrayCalculator(int[][] a2DArray) {
		int total = 0;
		for (int i = 0; i < a2DArray.length; i++) {
			for (int j = 0; j < a2DArray[i].length; j++) {
				total += a2DArray[i][j];
			}
		}
		return total;

	}

	public static void print2DArray(int[][] a2DArray) {
		// created new loop for practice - create method
		for (int outer = 0; outer < a2DArray.length; outer++) {
			for (int inner = 0; inner < a2DArray[outer].length; inner++) {
				System.out.printf("[%d,%d]: %d\t", outer, inner, a2DArray[outer][inner]);
			}
			System.out.println();
		}
	}

}
