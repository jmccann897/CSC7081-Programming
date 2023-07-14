package lecture7_11Oct2022;

import java.util.Scanner;

public class FactorialLoop {
	
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		int res = 1;

		System.out.println("Please enter a number to return the numbers factorial: ");
		num = sc.nextInt();

		System.out.print(num + "! = ");

		for (int i = num; i >= 1; i--) {

			System.out.print(i + "");
			if (i > 1) {
				System.out.print(" x ");
			} else {
				System.out.print(" = ");
			}
			res *= i;

		}
		System.out.println(res);
		sc.close();
	}

}
