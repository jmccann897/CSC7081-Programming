package challengeThreadingGame;

public class TimeThread implements Runnable{
	private int currentCount;

	@Override
	public void run() {
		
		this.currentCount=0;
		System.out.println("Timer started!");
		System.out.println("Hit any key and enter when you think time is up");
		try {
			
			do {
			Thread.sleep(1000);
			currentCount++; //update count
			} while(currentCount<=TimeGuess.gameLength*2);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @return the currentCount
	 */
	public int getCurrentCount() {
		return currentCount;
	}

	

}
