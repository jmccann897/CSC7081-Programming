package lecture11_25Oct2022;

public class Revision {

	public static void main(String[] args) {
		// write methods for single responsibility principle
		// each method/class/package should consider one feature
		// The idea behind the SRP is that every class, module, or function in a program
		// should have one responsibility/purpose in a program.
		// As a commonly used definition, "every class should have only one reason to
		// change
		
		
		// Scanner can be called statically 
		// public static Scanner sc = new Scanner(System.in);
		// this can be invoked by any method in the file

		
		double[] heights = new double[] { 1.4, 1.39, 7.2, 1.4 };

		// avg
		double avg = averageHeight(heights);
		System.out.println("Average is " + avg);

		// biggest
		double maxHeight = maxHeight(heights);
		System.out.println("The max height is " + maxHeight);

		// smallest
		double minHeight = minHeight(heights);
		System.out.println("The min height is " + minHeight);

		// difference between tallest and average
		System.out.println("Diff between tall and avg is " + (maxHeight - avg));

	}
/**
 * find min value in array of doubles
 * @param theHeights
 * @return
 */
	public static double minHeight(double[] theHeights) {
		//
		double min = theHeights[0];
		for (int i = 1; i < theHeights.length; i++) {
			if (theHeights[i] < min) {
				min = theHeights[i];
			}
		}
		return min;
	}

	/**
	 * find max value in array of doubles
	 * @param theHeights
	 * @return
	 */
	public static double maxHeight(double[] theHeights) {
		// below works but changes order of array stored
//		Arrays.sort(theHeights);
//		return theHeights[theHeights.length-1];
		double max = theHeights[0];
		for (int i = 1; i < theHeights.length; i++) {
			if (theHeights[i] > max) {
				max = theHeights[i];
			}
		}
		return max;
	}

	/**
	 * find avg of an array of doubles
	 * @param theHeights
	 * @return
	 */
	// avoid adding printing and returning in same method - single responsibility
	public static double averageHeight(double[] theHeights) {
		if (theHeights.length == 0) {
			return 0;
		} else {
			double sum = 0;
			for (double x : theHeights) {
				sum += x;
			}
			double average = sum / theHeights.length;
			return average;
		}
	}
}
