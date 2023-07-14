package lecture4_29Sep2022;

public class TernaryExample {

	public static void main(String[] args) {
		// Ternary operator
		// If Else is conditional execution
		// Ternary is for conditional assignment
		// Allows for a variable assignment based on conditional outcomes
		// Expression - Value if True - Value if False
		//NB Ternarys are not for actions but only for values/variables
		
		//Syntax
		String msg = "";
		int num1 = 10;
		int num2 = 50;

//		Initial program to print msg
//		if (num1 > num2) {
//			msg = "First num is biggest";
//		} else {
//			msg = "Second num is biggest or they are the same";
//		}
		
//		Ternary method to replicate output with one line of code
		msg = (num1>num2) ? "First num is biggest" : "Second num is biggest or they are the same";
		System.out.println(msg);
		
		//or alternative ternary using integers
		int max = (num1>num2) ? num1 : num2;
		System.out.println("Max is "+max);
		
		//another alt using assignment within action
		System.out.println("Max direct is "+( (num1>num2) ? num1:num2) );
	}
}
