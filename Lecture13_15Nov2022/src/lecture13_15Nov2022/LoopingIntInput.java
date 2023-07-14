package lecture13_15Nov2022;

import java.util.Scanner;

public class LoopingIntInput {

	public static void main(String[] args) {
		// Error management with do while // try catch logic

		Scanner sc = new Scanner(System.in);

		int age = 0;
		boolean valid = false;
		do {
			System.out.println("Enter your age: ");
			try {
				age = sc.nextInt();
				valid = true; //this prevents infinite loop - allows exit from while loop
			} catch (Exception e) {
				System.out.println("Did you type a number? No fractions either");
				System.out.println("Try again");
				sc.nextLine(); //clearing scanner buffer to allow for input
			}
		} while (!valid);

		System.out.println("Thanks you are " + age + " years old");
	}

}
