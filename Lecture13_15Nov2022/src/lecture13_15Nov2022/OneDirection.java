package lecture13_15Nov2022;

import java.util.Random;

public class OneDirection {

	public static void main(String[] args) {
		
		boolean done = false;
		int rand = 0;
		String[] oneDirection = { "Niall", "Harry", "Liam", "Louis" };

		do {
			try {
				Random random = new Random();
				rand = random.nextInt(5);
				System.out.println(oneDirection[rand]);
				done = true;
			} catch (Exception e) {
				System.out.println("Error");
			}
		} while (!done);
	}
}