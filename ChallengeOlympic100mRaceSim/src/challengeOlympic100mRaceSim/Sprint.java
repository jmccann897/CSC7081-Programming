package challengeOlympic100mRaceSim;

public class Sprint {

	public static void main(String[] args) {
		// 
		try {
			System.out.println("On Your Marks");
			Thread.sleep(1000);
			System.out.println("Ready");
			Thread.sleep(1000);
			System.out.println("BANG!!!!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		int racetime = 0;
		//create runner objects
		
		Runner r1 = new Runner("Usain Bolt", 9.81);
		Runner r2 = new Runner("Justin Gatlin", 9.89);
		Runner r3 = new Runner("Andre De Grasse", 9.91);
		Runner r4 = new Runner("Yohan Blake", 9.93);
		Runner r5 = new Runner("Akani Simbine", 9.94);
		Runner r6 = new Runner("Ben Youssef Meite", 9.96);
		Runner r7 = new Runner("Jimmy Vicaut", 10.04);
		Runner r8 = new Runner("Trayvon Bromell", 10.06);
		
		//create threads for each runner
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);
		Thread t5 = new Thread(r5);
		Thread t6 = new Thread(r6);
		Thread t7 = new Thread(r7);
		Thread t8 = new Thread(r8);
		
		t3.start();
		t5.start();
		t7.start();
		t1.start();
		t8.start();	
		t4.start();
		t2.start();
		t6.start();	
			
			
			
			
		
	}

}
