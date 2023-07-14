package lecture13_15Nov2022;

public class ExceptionExamples {

	public static void main(String[] args) {
		// Note when a method throws an exception it looks for something to handle it
		// The error message will show the call stack (list of methods)

		int[] nums = new int[] { 1, 2, 3, 4 }; // array of length 4, indexed 0 to 3

		
		//use try&catch blocks for code that risks throwing exceptions
		try {
			for (int i = 0; i < 6; i++) { // loop will hit out of bounds exception when i=4
				System.out.println(nums[i]);
			}
		}catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println("Exception occurred at this point");
			//use err (error stream) when throwing errors
		}finally {
			System.out.println("in finally block");
		}

		
		//finally block occurs will always occur post try block and after catch if there is one
		//often used for tidying up - only use if needed
		
		//the Exception is an object that has methods which can help
		//the Exception object is initialised during runtime when error is generated
	}

}
