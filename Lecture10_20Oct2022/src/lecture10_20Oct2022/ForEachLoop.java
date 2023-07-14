package lecture10_20Oct2022;

public class ForEachLoop {

	public static void main(String[] args) {
		// An array of arrays

		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		int total = 0;

		// for each loop
		// enhanced for loop
		// loops through array elements without a counter
		// avoids out of bound risks
		for (int i : array) {
			total += i;
		}
		System.out.println(total);

		// For each loops cannot be used to modify elements just to access them
		for (int num : array) {
			System.out.println("adding 10 to " + num);
			num += 10;
		}

	}

}
