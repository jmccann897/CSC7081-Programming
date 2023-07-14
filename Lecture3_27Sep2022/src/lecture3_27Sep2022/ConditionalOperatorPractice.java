package lecture3_27Sep2022;

public class ConditionalOperatorPractice {

	public static void main(String[] args) {
		
		//Logical Operators
		//	&& == AND
		//	|| == OR (RHS Alt + Shift + #) 
		// The opposite of conditionals requires thought of the output - de Morgan's Theorem
		
		String job = "Lecturer";
		String name = "Aidan";
		
		if (name.equalsIgnoreCase("aidan") && job.equalsIgnoreCase("lecturer")) {
			System.out.println("First branch is true");
		}
		
		if (name.equalsIgnoreCase("Matt") || job.equalsIgnoreCase("lecturer")) {
			System.out.println("Second branch is true");
		}
		
		int age = 50;
		int num2 = 23;
		int num3 = 40;
		
		if (age ==30 || (num2==23 && num3==40)) {
			System.out.println("True");
		}
		
		System.out.println("End of program"); 
		
		
	}

}
