/**
 * 
 */
package challengeASCIIConverter;

/**
 * @author joshm
 *
 */

//imports
import java.util.Scanner;

public class ChallengeASCIIConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// scanner initialise and user input ui
		Scanner sc = new Scanner(System.in);
		int ui;

		// menu
		// do while used as I want to print menu first then allow user input

		do {
			System.out.println("ASCII Converter Menu .......");
			System.out.println("1. Show ASCII table");
			System.out.println("2. Convert a Character to ASCII");
			System.out.println("3. Convert your name to ASCII");
			System.out.println("4. Quit");
			System.out.println("Enter a number and return");

			// user input ui capture
			ui = sc.nextInt();
			sc.nextLine(); // clearing return character

			// using switch to align option choice to output
			switch (ui) {
			case (1):
				System.out.println("ASCII Table...");
				int i;
				for (i = 32; i < 128; i++)
					System.out.printf("%d	%s%n", i, ((char) i));
				break;
			case (2):
				System.out.println("Please enter character to find its ASCII value");
				String sym = sc.nextLine();
				System.out.println((int) sym.charAt(0));
				break;
			case (3):
				System.out.println("Please enter your name to be converted to ASCII");
				String name = sc.nextLine();
				// Loop through string
				for (int i1 = 0; i1 < name.length(); i1++)
					// find char at index
					System.out.printf("%d->%s%n", (int) name.charAt(i1), name.charAt(i1));
				break;
			default:
				break;
			}
		} while (ui != 4); // Exit option enacted
		System.out.println("You have exitted the program");

		sc.close();

	}

}
