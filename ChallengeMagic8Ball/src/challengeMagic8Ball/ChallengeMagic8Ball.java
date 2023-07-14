package challengeMagic8Ball;
//imports
import java.util.Scanner;
import java.util.Random;

public class ChallengeMagic8Ball {

	public static void main(String[] args) {
		// vars
		String printedResponse = "";
		String res1 = "As I see it, yes.";
		String res2 = "Ask again later.";
		String res3 = "Better not tell you now.";
		String res4 = "Cannot predict now.";
		String res5 = "Concentrate and ask again.";
		String res6 = "Don't count on it.";
		String res7 = "It is certain.";
		String res8 = "It is decidedly so.";
		String uq;
		String uqFormatted;
		int responseSelector;
		
		//Initialise
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		//UserPrompt
		System.out.println("Please ask a question to the magic 8 ball");
		
		//CapturingUserQuestion
		uq = sc.nextLine();
		uqFormatted = uq.toLowerCase();
		System.out.println("You want to know "+uqFormatted);
		
		//RandomAssignment
		responseSelector = (rand.nextInt(8))+1;
		
		//Output
		switch (responseSelector) {
		case 1: printedResponse = res1;
		break;
		case 2: printedResponse = res2;
		break;
		case 3: printedResponse = res3;
		break;
		case 4: printedResponse = res4;
		break;
		case 5: printedResponse = res5;
		break;
		case 6: printedResponse = res6;
		break;
		case 7: printedResponse = res7;
		break;
		case 8: printedResponse = res8;
		break;
		}
		//Print Response
		System.out.println(printedResponse);
		
		//Close scanner
		sc.close();
	}

}
