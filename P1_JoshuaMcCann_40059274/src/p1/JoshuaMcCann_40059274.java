package p1;

import java.util.Scanner;
import java.util.Random;

public class JoshuaMcCann_40059274 {

	public static Scanner sc = new Scanner(System.in);
	public static Random rand = new Random();
	public static final int NUM_OF_ROUNDS = 5;

	public static void main(String[] args) {

		// create array to store results
		int[] results = new int[NUM_OF_ROUNDS];

		// complete number of rounds of individual games
		for (int i = 0; i < NUM_OF_ROUNDS; i++) {
			userPrompt(i);
			results[i] = game();
		}
		// print stats
		stats(results);

	}

	/**
	 * method to take in results from a game of RPS and return the statistics of the
	 * results
	 * 
	 * @param results
	 */
	public static void stats(int[] results) {

		double wins = 0;
		double losses = 0;
		double draws = 0;
		int totalRounds = NUM_OF_ROUNDS;
		for (int i = 0; i < results.length; i++) {
			if (results[i] == 1) {
				wins += 1;
			} else if (results[i] == -1) {
				losses += 1;
			} else {
				draws += 1;
			}
		}

		double winPercent = (wins / totalRounds) * 100;
		double lossPercent = (losses / totalRounds) * 100;
		double drawPercent = (draws / totalRounds) * 100;

		// print to screen
		System.out.println("Final Statistics");
		System.out.printf("Win percentage  %.2f  \n", winPercent);
		System.out.printf("Loss percentage %.2f  \n", lossPercent);
		System.out.printf("Draw percentage %.2f  \n", drawPercent);
		System.out.println();
		System.out.println("Thanks for playing");

	}

	/**
	 * capture user choice, generate computer choice match to correct outcome print
	 * choices and outcomes store outcomes in counter variables
	 */
	public static int game() {

		String uc = userchoice();
		String cc = computerchoice();
		int roundResult = result(uc, cc);
		return roundResult;
	}

	/**
	 * method to compare two choices and return an int to results array representing
	 * the outcome
	 * 
	 * @param uc
	 * @param cc
	 * @return
	 */
	public static int result(String uc, String cc) {
		// roundOutcome Counter
		int winCount = 0;
		int loseCount = 0;
		// drawCount is redundant - need to remove
		int drawCount = 0;

		// if user is rock and 3 outcomes
		if (uc.equals("rock") && cc.equals("scissors")) {
			winCount += 1;
		} else if (uc.equals("rock") && cc.equals("paper")) {
			loseCount += 1;
		} else if (uc.equals("rock") && cc.equals("rock")) {
			drawCount += 1;
		}

		// if user is paper and 3 outcomes
		if (uc.equals("paper") && cc.equals("rock")) {
			winCount += 1;
		} else if (uc.equals("paper") && cc.equals("scissors")) {
			loseCount += 1;
		} else if (uc.equals("paper") && cc.equals("paper")) {
			drawCount += 1;
		}

		// if user is scissors and 3 outcomes
		if (uc.equals("scissors") && cc.equals("paper")) {
			winCount += 1;
		} else if (uc.equals("scissors") && cc.equals("rock")) {
			loseCount += 1;
		} else if (uc.equals("scissors") && cc.equals("scissors")) {
			drawCount += 1;
		}

		// map result to int to return to results array
		if (winCount == 1) {
			return 1;
		} else if (loseCount == 1) {
			return -1;
		} else {
			return 0;
		}

	}

	/**
	 * Method to generate and return computer choice in round of RPS
	 * 
	 * @return
	 */
	public static String computerchoice() {
		// computer Decision
		String comChoiceStr = "";
		// generate random num between 0 and 2
		int comChoiceInt = rand.nextInt(3);

		// convert random int between 0 and 2 to string holder
		if (comChoiceInt == 0) {
			comChoiceStr = "Rock";
		} else if (comChoiceInt == 1) {
			comChoiceStr = "Paper";
		} else if (comChoiceInt == 2) {
			comChoiceStr = "Scissors";
		}
		// print Computer choice to screen
		System.out.println("Computer selected " + comChoiceStr);

		return comChoiceStr.toLowerCase();
	}

	/**
	 * method to capture & return user choice in a round of RPS,
	 * 
	 * @return
	 */
	public static String userchoice() {

		// capture user choice
		String userChoice = sc.nextLine();

		// while loop to force user to enter appropriate answer
		// this loop didn't execute to plan and I am running low on time
//		while (!userChoice.equalsIgnoreCase("rock")|| 
//				!userChoice.equalsIgnoreCase("scissors")||
//				!userChoice.equalsIgnoreCase("paper")) {
//			System.out.println("Unrecognised choice, please try again");
//			//userChoice = sc.nextLine();
//		}

		// print to screen user choice
		System.out.println("Player selected " + userChoice);
		// lcUC = lower case User Choice
		String lcUC = userChoice.toLowerCase();
		return lcUC;
	}

	/**
	 * Method to print intro to a round of R,P,S, requires round number to print
	 * 
	 * @param NumOfRound
	 */
	public static void userPrompt(int NumOfRound) {
		// print * line
		System.out.println("*****************");
		System.out.println("ROUND" + (NumOfRound + 1));
		System.out.println("*****************");
		// ask user to choose option
		System.out.println("Choose Rock, Paper or Scissors");

	}

}
