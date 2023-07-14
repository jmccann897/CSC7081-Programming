package lotteryProjectSprint;

import java.util.Scanner;
import java.util.Random;

public class LottoCheckerTest {

	public static void main(String[] args) {

		System.out.println("Lotto Checker ...");
		System.out.println("Select your six numbers between 1 and 38");
		// set picks 
		// note scanner use within method pickNums
		int userpicks[] = pickNums();
		// set winners
		int winners[] = setWinNums();
		// check matches & print statements
		checkMatches(userpicks, winners);
	}

	public static String checkMatches(int[] userPicks, int[] winners) {
		// counter to hold number for winners matched to picks
		int matches;
		matches = 0;
		String matchmsg = "";
		
		// check values at each position of userPicks against winners arrays
		if ((userPicks[0] == winners[0]) || (userPicks[0] == winners[1]) || (userPicks[0] == winners[2])
				|| (userPicks[0] == winners[3]) || (userPicks[0] == winners[4]) || (userPicks[0] == winners[5])) {
			System.out.println(userPicks[0] + " is a winner!");
			matches += 1;
		} else {
			System.out.println(userPicks[0] + " not a winner.");
		}
		if ((userPicks[1] == winners[0]) || (userPicks[1] == winners[1]) || (userPicks[1] == winners[2])
				|| (userPicks[1] == winners[3]) || (userPicks[1] == winners[4]) || (userPicks[1] == winners[5])) {
			System.out.println(userPicks[1] + " is a winner!");
			matches += 1;
		} else {
			System.out.println(userPicks[1] + " not a winner.");
		}
		if ((userPicks[2] == winners[0]) || (userPicks[2] == winners[1]) || (userPicks[2] == winners[2])
				|| (userPicks[2] == winners[3]) || (userPicks[2] == winners[4]) || (userPicks[2] == winners[5])) {
			System.out.println(userPicks[2] + " is a winner!");
			matches += 1;
		} else {
			System.out.println(userPicks[2] + " not a winner.");
		}
		if ((userPicks[3] == winners[0]) || (userPicks[3] == winners[1]) || (userPicks[3] == winners[2])
				|| (userPicks[3] == winners[3]) || (userPicks[3] == winners[4]) || (userPicks[3] == winners[5])) {
			System.out.println(userPicks[3] + " is a winner!");
			matches += 1;
		} else {
			System.out.println(userPicks[3] + " not a winner.");
		}
		if ((userPicks[4] == winners[0]) || (userPicks[4] == winners[1]) || (userPicks[4] == winners[2])
				|| (userPicks[4] == winners[3]) || (userPicks[4] == winners[4]) || (userPicks[4] == winners[5])) {
			System.out.println(userPicks[4] + " is a winner!");
			matches += 1;
		} else {
			System.out.println(userPicks[4] + " not a winner.");
		}
		if ((userPicks[5] == winners[0]) || (userPicks[5] == winners[1]) || (userPicks[5] == winners[2])
				|| (userPicks[5] == winners[3]) || (userPicks[5] == winners[4]) || (userPicks[5] == winners[5])) {
			System.out.println(userPicks[5] + " is a winner!");
			matches += 1;
		} else {
			System.out.println(userPicks[5] + " not a winner.");
		}

		// switch statement to print correlating msg to matches number
		switch (matches) {
		case 0:
			matchmsg = " No luck at all!";
			break;
		case 1:
			matchmsg = " Not bad";
			break;
		case 2:
			matchmsg = " Not bad";
			break;
		case 3:
			matchmsg = " Good, maybe a trip to the shops";
			break;
		case 4:
			matchmsg = " Don't give up your job but maybe a holiday";
			break;
		case 5:
			matchmsg = " Pay your uni fees";
			break;
		case 6:
			matchmsg = " Tell the boss where to go.....";
			break;
		}

		System.out.println("Overall result");
		System.out.println("Number of winning balls: " + matches + matchmsg);

		return matchmsg;
	}

	public static int[] setWinNums() {
		// create array for random numbers representing winning numbers
		int[] winNums = new int[6];
		Random rand = new Random();
		for (int i = 0; i < 6; i++) {
			winNums[i] = rand.nextInt(38) + 1;
		}
		// print array
		System.out.printf("The winning numbers are: %d, %d, %d, %d, %d, %d%n", winNums[0], winNums[1], winNums[2],
				winNums[3], winNums[4], winNums[5]);
		return winNums;
	}

	public static int[] pickNums() {
		// create array for selected ints
		int[] nums = new int[6];
		Scanner sc = new Scanner(System.in);
		// print message to request numbers
		for (int i = 0; i < 6; i++) {
			System.out.println("Please enter number ");
			nums[i] = sc.nextInt();
		}
		System.out.printf("Your selection: %d, %d, %d, %d, %d, %d%n", nums[0], nums[1], nums[2], nums[3], nums[4],
				nums[5]);
		sc.close();
		return nums;
	}

}
