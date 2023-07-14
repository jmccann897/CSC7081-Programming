package challengeCodeBreaker;

import java.util.Scanner;
import java.util.Arrays;

public class ACSIIConverterAlt {

		//create scanner object to capture input
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// take in a name
		userPrompt();
		
		// using next line to clear whitespace post entering
		String name = sc.nextLine();
		
		
		//convert name to ascii
		int[] codedmsg = toAscii(name);
		System.out.println(Arrays.toString(codedmsg));
		
		
		//decode from ascii to string
		String secretmsg = decode(codedmsg);
		System.out.println(secretmsg);
		
		
		sc.close();
	}
/**
 * Returns string of ascii char of the values of an int array
 * @param codedmsg
 * @return
 */
	public static String decode(int[] codedmsg) {
		// create String to hold chars
		String msg = "";
		//populate string by looping through and casting int to char
		for (int i=0; i<codedmsg.length; i++) {
			msg += (char)(codedmsg[i]);
		}
		return msg;
	}
/**
 * Returns int array of ascii values of a string
 * @param name
 * @return
 */
	public static int[] toAscii(String name) {
		// create array to hold values
		int [] asciiValues = new int[name.length()];
		//populate array by looping through and casting char to ints
		for (int i=0; i<name.length(); i++) {
			asciiValues[i] = (int)(name.charAt(i));
		}
		return asciiValues;
		//System.out.println(Arrays.toString(asciiValues));
	}
/**
 * user prompt to screen
 */
	public static void userPrompt() {
		// 
		System.out.println("Please enter name to be coded");
		
	}
	
}
