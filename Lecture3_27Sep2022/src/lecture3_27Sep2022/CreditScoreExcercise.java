package lecture3_27Sep2022;

//imports
import java.util.Scanner;


public class CreditScoreExcercise {

	public static void main(String[] args) {
		// vars
		int age;
		boolean goodCreditHistory;
		
		//open scanner
		Scanner sc = new Scanner(System.in);
		
		//Request user age
		System.out.println("Please enter your age");
		age = sc.nextInt();
		
		//Request credit history
		System.out.println("Do you have good credit history (Yes/No)");
		goodCreditHistory = sc.hasNext("Yes");

//		System.out.println(age);
//		System.out.println(goodCreditHistory);
		
		// Check for conditions
		if (age >= 18 && goodCreditHistory) {
			System.out.println("Approved");
		}
		else {
			System.out.println("Rejected");
		}
		sc.close();
	}

}
