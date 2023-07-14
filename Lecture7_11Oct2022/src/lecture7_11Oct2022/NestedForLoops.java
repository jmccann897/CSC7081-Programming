package lecture7_11Oct2022;

public class NestedForLoops {

	public static void main(String[] args) {
		// 

//		int count=1;
		
//		for (int row = 1; row <= 3; row++) {
//			for (int col = 1; col <= 5; col++) {
//				System.out.print(count++ +", ");
//			}
//		}
		
		
		for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 5; col++) {
				System.out.print("["+row+","+col+"]");
			}
			//take new line for next outer loop
			System.out.println();
		}

	}

}
