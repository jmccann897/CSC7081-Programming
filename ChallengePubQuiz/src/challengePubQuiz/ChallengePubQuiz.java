package challengePubQuiz;

import java.util.Scanner;
import java.util.Random;

public class ChallengePubQuiz {

	public static Scanner sc = new Scanner(System.in);
	public static Random rand = new Random();
	public static String[] jokeQuestions = { "Largest planet?", "Worse song ever?", "Capital of Peru?",
			"Roman god of WAR?" };
	public static String[] jokeAnswers = { "Jupiter", "Castles in the sky", "Lima", "Mars" };

	public static void main(String[] args) {
		// prompt user
		System.out.println("General knowledge quiz....");
		// method
		quizRound();
	}

	/**
	 * Method to cover Quiz Round actions through sub-methods (askQuestion, checkAns
	 * and checkContinue)
	 */
	public static void quizRound() {
		// TODO Auto-generated method stub
		int qNum = askQuestion(jokeQuestions);
		int ansNum = qNum;
		checkAns(qNum, ansNum, jokeAnswers);
		checkContinue();
	}

	/**
	 * Method to Ask user if they want to continue, either offering another
	 * quizRound or displays msg to signify end
	 */
	public static void checkContinue() {
		// prompt for continue
		System.out.println("Another Question (Y or N)...");
		String pos = "y";
		String neg = "n";
		String userResponse = sc.nextLine();
		if (userResponse.equalsIgnoreCase(neg)) {
			System.out.println("Thanks for playing");
		} else if (userResponse.equalsIgnoreCase(pos)) {
			quizRound();
		} else {
			System.out.println("Sorry input not recognised");
		}

	}

	/**
	 * Method checks answer array using set answer index against user input
	 * @param questionIndex
	 * @param answerIndex
	 * @param answers
	 */
	public static void checkAns(int questionIndex, int answerIndex, String[] answers) {
		//
		String userResponse = sc.nextLine();
		if (userResponse.contentEquals((answers[answerIndex]))) {
			System.out.println("Well done!");
		} else {
			System.out.println("Not a bad guess but it was " + answers[answerIndex]);
		}
	}

	/**
	 * Method to randomly select question from array of strings Prints question to
	 * console Returns question index
	 */
	public static int askQuestion(String[] qs) {
		//
		int qnum = rand.nextInt(qs.length);
		System.out.println(qs[qnum]);
		return qnum;
	}
}
