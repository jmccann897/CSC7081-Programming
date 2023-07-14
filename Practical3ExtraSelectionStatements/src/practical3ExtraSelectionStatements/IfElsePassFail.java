package practical3ExtraSelectionStatements;

import java.util.Scanner;

public class IfElsePassFail {

	public static void main(String[] args) {
		// q5/ q6
		//No assumption that >100 is impossible

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter user mark: ");
		int um = sc.nextInt();
		String dis = "Wonderful";
		String com = "Commendation";
		String pass = "Pass";
		String fail = "Fail";

		if (um > 69) {
			System.out.println(dis);
		} else if (um > 59) {
			System.out.println(com);
		}else if (um > 49) {
			System.out.println(pass);
		}else if (um > 0) {
			System.out.println(fail);
		}else {
			System.out.println("Invalid Input");
		}
		sc.close();
	}

}
