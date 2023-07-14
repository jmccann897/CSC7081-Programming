package challengeGoal;

import java.util.Scanner;
import java.util.Random;

public class ChallengeGoal {

	public static void main(String[] args) {
		// Penalty shoot out simulator
		int numOfRounds = 5;

		// prompt
		System.out.println("Game on....");

		penaltyGame(numOfRounds);
	}

	public static void introDisplay() {
		// TODO Auto-generated method stub
		System.out.println("	________________");
		System.out.println("	|  1    2    3  |");
		System.out.println("	|  4    5    6  |");
		System.out.println("	|  7    8    9  |");
		System.out.println("_________________________________");
		System.out.println("                x");
	}

	public static void penaltyGame(int numOfRounds) {
		// create array of 5 positions
		int[] results = new int[5];
		// System.out.println("Penalty number: "+results[i]+" out of "+results.length);
		// store result of penalty outcome to each position
		for (int i = 0; i < numOfRounds; i++) {
			introDisplay();
			System.out.printf("Penalty number %d out of %d \n", i + 1, results.length);
			results[i] = penaltyRound(userShot(), goalieDecision());
			System.out.println(results[i]);
		}
		publishResults(results);

		// return final status
		// use index to map penalty number

	}

	public static void publishResults(int[] results) {
		//
		int total = 0;
		for (int i = 0; i < results.length; i++) {
			total += results[i];
		}
		System.out.printf("Goals scored: %d / %d \n", total, results.length);
		performanceReview(total);
		System.out.println("Thanks for playing");

	}

	public static void performanceReview(int total) {
		//
		switch (total) {
		case 0:
			System.out.println("You have disgraced your family");
			break;
		case 1:
			System.out.println("You have disgraced your family");
			break;
		case 2:
			System.out.println("Back to training");
			break;
		case 3:
			System.out.println("Try using your good foot");
			break;
		case 4:
			System.out.println("Not bad");
			break;
		case 5:
			System.out.println("Fluke");
			break;
		default:
			System.out.println("Something went wrong :(");
		}
	}

	public static int penaltyRound(int userShot, int goalieDecision) {
		// returns 1 or 0 depending on outcome
		int goalCount = 0;
		System.out.println("Placing the ball...Walking back.....Run up...Shoot!");
		if (userShot == goalieDecision) {
			System.out.println("SAVE!!");
			goalCount = 0;
		} else {
			System.out.println("Goal! Keeper went to " + goalieDecision);
			goalCount = 1;

		}
		return goalCount;
	}

	public static int userShot() {
		// prompt user to shoot
		System.out.println("Select shot...");
		Scanner sc = new Scanner(System.in);
		int userShot = sc.nextInt();
		return userShot;
	}

	public static int goalieDecision() {
		// have goalie randomly select a position to save
		Random rand = new Random();
		int goalieDecision = rand.nextInt(9) + 1;
		return goalieDecision;
	}

}
