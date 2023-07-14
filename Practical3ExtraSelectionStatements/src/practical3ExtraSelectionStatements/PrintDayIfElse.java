package practical3ExtraSelectionStatements;

import java.util.Scanner;

public class PrintDayIfElse {

	public static void main(String[] args) {
		// question 1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number between 1-7");
		int ui = sc.nextInt();
		
		if (ui==1) {
			System.out.println("Sunday");
		}
		else if (ui ==2) { 
		System.out.println("Monday");
		}
		else if (ui ==3) { 
			System.out.println("Tuesday");
		}
		else if (ui ==4) { 
			System.out.println("Wednesday");
		}
		else if (ui ==5) { 
			System.out.println("Thursday");
		}
		else if (ui ==6) { 
			System.out.println("Friday");
		}
		else if (ui ==7) { 
			System.out.println("Saturday");
		}
		sc.close();
	}

}
