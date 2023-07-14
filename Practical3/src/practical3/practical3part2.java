package practical3;
// importing scanner to take input
import java.util.Scanner;

public class practical3part2 {

	public static void main(String[] args) {
		// User prompt
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mark ..");
		
		//Collect & Assign #
		int input = sc.nextInt();
		
		//created a variable to hold result
		String result;
		
		//If statement
		//set conditions - assign appropriate string to variable
		if (input>=70) {
			result= "Classification: Distinction";
		} else if (input>60) {
			result=("Classification: Pass");
		} else if (input>50) {
			result=("Classification: Merit");
		} else {
			result=("Classification: Fail");
		}
		//print result and close scanner
		System.out.println(result);
		sc.close();
	}
}
