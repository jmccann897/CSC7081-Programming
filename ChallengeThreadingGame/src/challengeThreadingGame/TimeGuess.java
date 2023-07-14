package challengeThreadingGame;

import java.util.Scanner;

public class TimeGuess {
	public static final int gameLength = 10;

	public static void main(String[] args) {
		System.out.println("Count of 10 secs game");
		System.out.println("Press any key and enter to start..then estimate 10s have elapsed");
		
		Scanner sc = new Scanner(System.in);
		//user start
		sc.nextLine();
		
		//create runnable object
		TimeThread tt = new TimeThread();
		//create second thread
		Thread newThread = new Thread(tt);
		newThread.start();
		
		//user guess
		sc.nextLine();
		
		//check if timeThread is still active
				if (newThread.isAlive()) {
					// too early, late or on the money!
					if (tt.getCurrentCount()<gameLength) {
						System.out.println("Too early : that was "+tt.getCurrentCount() +" secs");
					} else if (tt.getCurrentCount()>gameLength) {
						System.out.println("Too late : that was "+tt.getCurrentCount() +" secs");
					} else {
						System.out.println("Nice one you got it exactly right!");
					}
					// stop the thread
					newThread.interrupt();
				} else {
					// thread has died so way too late 
					System.out.println("Way too late! You missed the target by at least double ");
					newThread.interrupt();
				}		
				
				System.out.println("Game over!");

				// tidy the house !
				sc.close();
		
		
	}
}
