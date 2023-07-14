package lecture3_27Sep2022;

//imports
import java.util.Random;
import java.util.Scanner;

public class RandomNumGuessingGame {

	public static void main(String[] args) {
		//Challenge
				//Random number guessing game
				//Log a random number
				//Intake a guess from user
				//Check if it matches
		
		//Vars
		int guess;
		int rn; 
		
		//Open scanner and Random object
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		//Initialise random number (adding +1 to value to exclude 0 and include upper bound value)
		rn= (rand.nextInt(3))+1;
		//Useful check when testing 
//		System.out.println(rn);
		
		// prompt user for guess
		System.out.println("Please enter your guess on the random number between 1 and 3");
		guess = sc.nextInt();

		// Check value against random value
		if (guess == rn) 
		{
			System.out.println("Congratulations!! You guessed correctly!");
		} else if (guess > rn) 
		{
			System.out.println("Sorry but your guess is larger than the random number");
			System.out.println("Please enter another guess");
			guess=sc.nextInt();
				if (guess==rn) 
				{
					System.out.println("Congrats!");
				} else 
				{
					System.out.println("Better luck next time");
				}
		} else if (guess < rn) 
		{
			System.out.println("Sorry but your guess is smaller than the random number");
			System.out.println("Please enter another guess");
			guess=sc.nextInt();
				if (guess==rn) 
				{
					System.out.println("Congrats!");
				} else 
				{
					System.out.println("Better luck next time");
				}
		} 
			// close scanner
			sc.close();
		}
}