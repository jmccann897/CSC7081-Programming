package lecture6_06Oct2022;

import java.util.Scanner;

public class MenuSystem {

	public static void main(String[] args) {
		//initialising
		int option;
		Scanner sc = new Scanner(System.in);

		// Creating do while 
		do {
			System.out.println("1: File");
			System.out.println("2: Edit");
			System.out.println("3: Delete");
			System.out.println("4: Exit");
			System.out.println();
			//if this is outside it becomes infinite loop
			option = sc.nextInt();

			if (option == 1) {
				System.out.println("Chose File");
			} else if (option == 2) {
				System.out.println("Chose Edit");
			} else if (option == 3) {
				System.out.println("Chose Delete");
			} else if (option == 4) {
				System.out.println("Chose Exit");
			} else {
				System.out.println("Unknown Input");
			}
			System.out.println();
		} while (option != 4);
		System.out.println("Exitting program");

		sc.close();
	}

}
