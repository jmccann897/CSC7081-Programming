package challengeCodeBreaker;

import java.util.Arrays;

import java.util.Scanner;

public class ChallengeCodeBreaker {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		//prompt for name
		String str = userPrompt();
		
		//method to codify name
		int[] myArray = nameToNum(str);
		
		//print array
		System.out.println(Arrays.toString(myArray));
		
		int[] whoDis = myArray;
		decodeMsg(whoDis);

		sc.close();

	}
	
	/**
	 * Method to cast each elem of an array of ints to char representing ASCII value
	 * Prints to screen, not changing the passed in array
	 * @param codedMsg
	 */
public static void decodeMsg(int[] codedMsg) {
		// take in array of ints
		for (int elem: codedMsg) {
			System.out.print((char)elem);
		}
		
		
	}
/**
 * Method to take in a string and loop through each char in string 
 * casting it to the int or ASCII value and storing in array which is returned
 * @param name
 * @return
 */
	public static int[] nameToNum(String name) {
		// Create an array to hold ASCII values for characters
		int[] codeName = new int[name.length()];

		for (int i = 0; i < name.length(); i++) {
			codeName[i] = (int) name.charAt(i);
		}
		return codeName;
	}

	/**
	 * Method to print out msg and return user input str for name
	 * @return
	 */
	public static String userPrompt() {
		// print msg to screen
		System.out.println("Please enter the name to be codified");
		String name = sc.nextLine();
		return name;
		
	}

}
