package lecture4_29Sep2022;

public class SwitchStatementExample {

	public static void main(String[] args) {
		//If statement is for one condition 
		//If else statement allows you to handle multiple conditions
		//Switch statements allow you to handle multiple possibilities with a particular value of a constant
		//Only works on byte, short, int, char and from Java 1.7 Strings
		//Cases can occur in any order, its good practice to place default at end
		//and no need for a break for last case
		//Can be set to fall through - allow multiple cases to assign a particular output
		
		

		//new keywords - switch  / case / default / break
		
		//example 1
		
//		int num = 1;
//		
//		switch (num) {
//		case 1:
//			System.out.println("one");
//			break;
//		case 2:
//			System.out.println("two");
//			break;
//		case 3:
//			System.out.println("three");
//			break;
//		default:
//			System.out.println("unknown");
//		}
		
		//example 2 - can do operations on switch condition
		
//		int num = 1;
//		
//		switch (num*2) {
//		case 1:
//			System.out.println("one");
//			break;
//		case 2:
//			System.out.println("two");
//			break;
//		case 3:
//			System.out.println("three");
//			break;
//		default:
//			System.out.println("unknown");
//		}
		
		
		//Example 3 - fall through assignment
		
		String season;
		int month = 12;

		switch (month) {
		case 12:
		case 1:
		case 2:
			season = "Winter";
			break;
		case 3:
		case 4:
		case 5:
			season = "Spring";
			break;
		case 6:
		case 7:
		case 8:
			season = "Summer";
			break;
		case 9:
		case 10:
		case 11:
			season = "Autumn";
			break;
		default:
			season = "Error";
		}

		System.out.println(season);

	}
}

