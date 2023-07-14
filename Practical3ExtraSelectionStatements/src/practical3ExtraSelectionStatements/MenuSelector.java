package practical3ExtraSelectionStatements;

import java.util.Scanner;

public class MenuSelector {

	public static void main(String[] args) {
		// q3/q4

		// initialising
		int option;
		Scanner sc = new Scanner(System.in);

		// Creating do while
		do {
			System.out.println("1: File");
			System.out.println("2: Add");
			System.out.println("3: Edit");
			System.out.println("4: Delete");
			System.out.println("5: Exit");
			System.out.println("Enter Option...");
			// if this is outside it becomes infinite loop
			option = sc.nextInt();

			if (option == 1) {
				System.out.println("You selected File");
			} else if (option == 2) {
				System.out.println("You selected Add");
			}else if (option == 3) {
				System.out.println("You selected Edit");
			}else if (option == 4) {
				System.out.println("You selected Delete");
			} else if (option == 5) {
				System.out.println("You selected Exit");
			} else {
				System.out.println("Unknown Input");
			}
			System.out.println();
		} while (option != 4);
		System.out.println("Exitting program");

		sc.close();
	}

}
