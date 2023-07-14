package challengeSquareMeUp;

import java.util.Scanner;

public class ChallengeSquareMeUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//first prompt
		System.out.println("Enter the length of the box");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		
		System.out.println("Enter the character to build the box with");
		String userLetter = sc.next();
		
		//draw top
		drawTop(length, userLetter);
				
		//draw sides
		drawSides(length, userLetter);
		
		//draw bottom
		drawBottom(length, userLetter);

		sc.close();

	}

	public static void drawTop(int lengthSize, String userLetter) {
		for (int i = 0; i < lengthSize; i++) {
			System.out.printf("%s ", userLetter);
		}
	}

	public static void drawSides(int lengthSize, String userLetter) {
		String spacer = " ";
		for (int i = 0; i < (lengthSize - 2); i++) {
			System.out.println();
			System.out.printf("%s%s%s", userLetter, spacer.repeat((lengthSize * 2) - 3), userLetter);
		}
		System.out.println();
	}

	public static void drawBottom(int lengthSize, String userLetter) {
		for (int i = 0; i < lengthSize; i++) {
			System.out.printf("%s ", userLetter);
		}

	}
}

