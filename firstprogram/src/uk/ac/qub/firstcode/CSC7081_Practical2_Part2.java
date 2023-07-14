/**
 * 
 */
package uk.ac.qub.firstcode;

/**
 * This class is part 2 and shows how to access string properties and functions
 * @author joshm
 *
 */
public class CSC7081_Practical2_Part2 {

	/**
	 * This method is part 2 and shows how to access string properties and functions
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String manipulation
				String yourName;
				yourName = "Josh McCann";
				
				System.out.println("The input String:" +yourName);
				System.out.println("The number of characters in the string:"+yourName.length());
				System.out.println("The first character in the string is "+yourName.charAt(0));
				System.out.println("The second character in the string is "+yourName.charAt(1));
				System.out.println("The string in uppercase: "+yourName.toUpperCase());
				System.out.println("The string with the letter a replaced with % is: "+yourName.replace("a", "%"));
				System.out.println("The character 'n' first occurs in position "+yourName.indexOf("n"));
				System.out.println("The character 'n' last occurs in position "+yourName.lastIndexOf("n"));
	}

}
