package lecture10_20Oct2022;

public class DynamicPop {

	public static void main(String[] args) {
		// Dynamically populating an array
		// Provides a more practical method to populate an array

		
		int[] numbers = new int[5];
		
		//int val = 0;		
		for (int i =0; i<numbers.length; i++) {
			numbers[i]= i+1;
			//val+=2;
		}
		
		int total = 0;
		for (int i=0; i <numbers.length; i++) {
			total+=numbers[i];
		}
		
		System.out.println("Final total is "+ total);
		
		//display values and corresponding index
		for (int i=0; i<numbers.length; i++) {
			System.out.printf("%d \t %d \n", i, numbers[i]);
		}
		
//		//displaying values in reverse order
//		for (int i = numbers.length-1; i>=0; i--) {
//			System.out.printf("%d \t %d \n", i, numbers[i]);
//		}
		
		
	}

}
