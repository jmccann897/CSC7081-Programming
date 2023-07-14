package lecture10_20Oct2022;

public class InitialiseArrays {

	public static void main(String[] args) {
		// Can use a constructor syntax to initialise an array
		// Relatively new to Java
		// Don't need to set size, its gathered from syntax
		
		int[] nums = new int[] { 4, 7 , 8, 10};
		// same as 
		//int[] nums = {4, 7 ,8 ,10};
		
		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

}
