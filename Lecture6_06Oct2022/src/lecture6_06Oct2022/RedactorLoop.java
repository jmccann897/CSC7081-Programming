package lecture6_06Oct2022;

import java.util.Scanner;

public class RedactorLoop {

	public static void main(String[] args) {
		//

		System.out.println("Please enter your name");
		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ') {
				System.out.print(" ");
			} else {
				System.out.print("*");
			}
		}

		System.out.println();
		System.out.println("End of Program");
		sc.close();
	}

}
