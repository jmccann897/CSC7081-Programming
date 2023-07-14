package lecture28_16Mar2023;

public class MethodCalls {

	public static void main(String[] args) {

		countDown(5);
	}

	private static void countDown(int num) {
		//base case
		if (num<=0) {
			System.out.println("end");
		} else {
			//recursive step
			countDown(num-1); //if this is after print it alters effect
			System.out.println(num);
			
			
		}
		
		
	}

}
