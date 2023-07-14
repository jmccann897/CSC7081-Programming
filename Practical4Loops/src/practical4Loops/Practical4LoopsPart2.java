package practical4Loops;

import java.util.Scanner;

public class Practical4LoopsPart2 {

	public static void main(String[] args) {
		//Part2
		Scanner sc = new Scanner(System.in);
		int ui;
		do {
			System.out.println("1. File");
			System.out.println("2. Edit");
			System.out.println("3. Save");
			System.out.println("4. Delete");
			System.out.println("5. Exit");
			System.out.println("Select option . . .");
			ui = sc.nextInt();

			switch (ui) {
			case 1:
				System.out.println("You selected File");
				break;
			case 2:
				System.out.println("You selected Edit");
				break;
			case 3:
				System.out.println("You selected Save");
				break;
			case 4:
				System.out.println("You selected Delete");
				break;
			case 5:
				break;
			default:
				System.out.println("Unknown input");
			}

		} while (ui < 5);

		System.out.println("Exitting program");

		sc.close();
	}

}
