package practical6Arrays;

public class Practical6Pt1Q7ArrayPrinter {

	public static void main(String[] args) {
		// 
		
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		
		arrayPrinter(nums);

	}

	public static void arrayPrinter(int[] intArray) {
		for (int i=0; i < intArray.length; i++) {
			System.out.printf("%d \n", intArray[i]);
		}
		
		
	}
}
