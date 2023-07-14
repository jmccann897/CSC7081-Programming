package challengeOlympic100mRaceSim;

public class Runner implements Runnable {
	private String name;
	private double time;
	
	


	public  Runner(String name, double time) {
		this.name = name;
		this.time = time;
	}
	

	@Override
	public void run() {
		
		
		
		
		// delay details until time achieved
		long millis = (long)(1000*this.time);
		try {
			Thread.sleep(millis);
			printRunnerDetails();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}

	private void printRunnerDetails() {
		//
		System.out.printf("%s finished with a time of %.2f%n", this.getName(), this.getTime());
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the time
	 */
	public double getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(double time) {
		this.time = time;
	}

	
	
}
