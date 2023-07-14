package practical6Arrays;
import java.util.Scanner;
public class Practical6Pt1Q5CharCounter {

	public static void main(String[] args) {
		// prompt
		System.out.println("Please enter your name");
		Scanner sc = new Scanner(System.in);
		//string stored
		String username = sc.nextLine();
		
		vowelCounter(username);
		sc.close();

	}

	public static void vowelCounter(String username) {
		// create counters for each vowel
		int aCount=0;
		int iCount=0;
		int eCount=0;
		int oCount=0;
		int uCount=0;
		
		//create char array from String
		
		for (int i=0; i<username.length();i++) {
			char letter[] = username.toLowerCase().toCharArray();
			if (letter[i]=='a') {
				aCount+=1;
			}
			if (letter[i]=='e') {
				eCount+=1;
			}
			if (letter[i]=='i') {
				iCount+=1;
			}
			if (letter[i]=='o') {
				oCount+=1;
			}
			if (letter[i]=='u') {
				uCount+=1;
			}
		}
			
		System.out.printf("%s has %d a's, %d i's, %d e's, %d o's, %d u's", username, aCount, iCount, eCount, oCount, uCount);
		
		
		}
		
		
	}
