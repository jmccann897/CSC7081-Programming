package practical3ExtraSelectionStatements;

import java.util.Scanner;
public class VowelConsonantSwitchChecker {

	public static void main(String[] args) {
		// q3
		//check for vowel and else is consonant

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a letter: ");
		String ui = sc.next();
		
		switch (ui.toLowerCase()) {
		case "a": System.out.println("Vowel");
		break;
		case "e": System.out.println("Vowel");
		break;
		case "i": System.out.println("Vowel");
		break;
		case "o": System.out.println("Vowel");
		break;
		case "u": System.out.println("Vowel");
		break;
		default: System.out.println("Consonant");
		}
		
		sc.close();
		
	}

}
