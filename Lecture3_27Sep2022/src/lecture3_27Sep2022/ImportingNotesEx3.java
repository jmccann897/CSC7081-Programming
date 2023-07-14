package lecture3_27Sep2022;

import java.util.Scanner;

public class ImportingNotesEx3 {

	public static void main(String[] args) {
		// Vars

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		double ui = sc.nextInt();
		
		//calc
		double res = Math.sqrt(ui);
		
		System.out.println("Square root is: "+res);
		
		
		sc.close();
	}

}
