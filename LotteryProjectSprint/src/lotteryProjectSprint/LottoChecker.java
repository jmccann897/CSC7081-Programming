package lotteryProjectSprint;

public class LottoChecker {

	public static void main(String[] args) {
		// Vars
		int num1, num2, num3, num4, num5, num6;
		num1 = 2;
		num2 = 8;
		num3 = 9;
		num4 = 31;
		num5 = 24;
		num6 = 36;

		int win1, win2, win3, win4, win5, win6;
		win1 = 2;
		win2 = 8;
		win3 = 9;
		win4 = 24;
		win5 = 31;
		win6 = 36;
		
		//variable to check matches
		int matches;
		matches=0;
		String matchmsg = "";
		
		// print statements
		System.out.println("Lotto Checker ...");
		System.out.printf("Your selection..%s, %s, %s, %s, %s, %s%n", num1, num2, num3, num4, num5, num6);
		System.out.printf("Winning balls..%s, %s, %s, %s, %s, %s%n", win1, win2, win3, win4, win5, win6);
		System.out.println("Checking for winners...");

		if ((num1 == win1) || (num1 == win2) || (num1 == win3) || (num1 == win4) || (num1 == win5) || (num1 == win6)) {
			System.out.println(num1 + " is a winner!");
			matches+=1;
		} else {
			System.out.println(num1 + " not a winner.");
		}
		if ((num2 == win1) || (num2 == win2) || (num2 == win3) || (num2 == win4) || (num2 == win5) || (num2 == win6)) {
			System.out.println(num2 + " is a winner!");
			matches+=1;
		} else {
			System.out.println(num2 + " not a winner.");
		}
		if ((num3 == win1) || (num3 == win2) || (num3 == win3) || (num3 == win4) || (num3 == win5) || (num3 == win6)) {
			System.out.println(num3 + " is a winner!");
			matches+=1;
		} else {
			System.out.println(num3 + " not a winner.");
		}
		if ((num4 == win1) || (num4 == win2) || (num4 == win3) || (num4 == win4) || (num4 == win5) || (num4 == win6)) {
			System.out.println(num4 + " is a winner!");
			matches+=1;
		} else {
			System.out.println(num4 + " not a winner.");
		}
		if ((num5 == win1) || (num5 == win2) || (num5 == win3) || (num5 == win4) || (num5 == win5) || (num5 == win6)) {
			System.out.println(num5 + " is a winner!");
			matches+=1;
		} else {
			System.out.println(num5 + " not a winner.");
		}
		if ((num6 == win1) || (num6 == win2) || (num6 == win3) || (num6 == win4) || (num6 == win5) || (num6 == win6)) {
			System.out.println(num6 + " is a winner!");
			matches+=1;
		} else {
			System.out.println(num6 + " not a winner.");
		}
		
		switch (matches) {
		case 0 : matchmsg = " No luck at all!";
		break;
		case 1 : matchmsg = " Not bad";
		break;
		case 2 : matchmsg = " Not bad";
		break;
		case 3 : matchmsg = " Good, maybe a trip to the shops";
		break;
		case 4 : matchmsg = " Don't give up your job but maybe a holiday";
		break;
		case 5 : matchmsg = " Pay your uni fees";
		break;
		case 6 : matchmsg = " Tell the boss where to go.....";
		break;
		}
		
		
		
		System.out.println("Overall result");
		System.out.println("Number of winning balls: "+matches+matchmsg);

		
		
	}

}
