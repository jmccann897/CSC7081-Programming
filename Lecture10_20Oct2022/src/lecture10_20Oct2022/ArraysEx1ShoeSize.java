package lecture10_20Oct2022;

public class ArraysEx1ShoeSize {

	public static void main(String[] args) {
		// Be careful when passing arrays or other reference types in methods
		// They can be modified within methods that persist without returning
		// Primitives when passed, pass the value and unless returned to be stored, are lost
		
		int[] shoeSizes = new int [] { 12, 6, 4, 12, 7};
		
		int[] shoeSize2 = new int [] { 12, 6, 4};
		
		
		System.out.print("Sizes:");
		for (int i = 0; i<shoeSizes.length ; i++) {
			System.out.print(shoeSizes[i]+" ");
		}
		System.out.println();
		
		double avg = arrayAvg(shoeSizes);
		
		System.out.println("Avg is "+avg);
	
		
		System.out.println("The other average is "+arrayAvg(shoeSize2));

				
		
	}

/**
 * Calculate and return an average of an array of ints (rtn'd as a double)	
 * @param numbers - the array of ints to be averaged
 * @return - average as a double
 */
	public static double arrayAvg (int [] numbers) {
		
		int total = 0;
		
		for (int i = 0; i<numbers.length; i++) {
			total+=numbers[i];
		}
		
		double avg = (double)total / numbers.length;
		
		return avg;
	}
	
	public static void modifyArray (int [] values) {
		for (int i =0; i<values.length; i++) {
			values[i] +=10;
		}
	}
	
}
