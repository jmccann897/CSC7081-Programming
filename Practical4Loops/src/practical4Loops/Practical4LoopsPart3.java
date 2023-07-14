package practical4Loops;

import java.util.Scanner;

public class Practical4LoopsPart3 {

	public static void main(String[] args) {
		// Part3.1
//		String name;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please eneter a name: ");
//		name = sc.nextLine();
//
//		for (int i = 1; i < 11; i++) {
//			System.out.println("Iteration number is: " + i + " and the name is " + name);
//		}
//		sc.close();
		
		//Part 3.2
//		int i = 1;
//		for (; i < 10; i++) {
//			System.out.print(i + ",");
//		}
//		System.out.print(i);
		
		//Part 3.3
//		for (int i = 10; i > 0; i--) {
//			System.out.print(i + ",");
//		}
//		System.out.println(" Liftoff!");
		
		//Part 3.4
//		int i = 10;
//		while (i > 0) {
//			System.out.print(i + ",");
//			i--;
//		}
//		System.out.print(" Liftoff!");
		
		//Part 3.5
//		for (int i = 1; i < 101; i++) {
//			if (i % 2 == 0) {
//				System.out.print(i + ",");
//			}
		
		//Part 3.6
//		for (int i = 10; i < 41; i++) {
//			if (i % 2 != 0) {
//				System.out.print(i + ",");
//			}
			
		//Part 3.7
//		for (int i = 1000; i >= 0; i--) {
//			System.out.print(i + ",");
//			if (i == 333) {
//				System.out.println("Abort");
//				break;
//			}
//
//		}
		
		//Part 3.8
		//outer loop runs for three
//		for (int outer = 1; outer <= 3; outer++) {
//			// inner loop runs for ten
//			for (int inner = 1; inner <= 10; inner++) {
//				// Using outer variable to set * prefix
//				if (outer == 1) {
//					System.out.print("*");
//				} else if (outer == 2) {
//					System.out.print("**");
//				} else {
//					System.out.print("***");
//				}
//
//				System.out.print(inner);
//
//				// formatting
//				if (inner != 10) {
//					System.out.print(", ");
//				}
//
//			}
//			// operating within outer loop
//			System.out.println();
		
		//Part 3.9
//		for (int i = 1910; i <= 1990; i++) {
//			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
//				System.out.println(i + " is a leap year");
//			}
		
		//Part 3.10
//		Scanner sc310 = new Scanner(System.in);
//		int age;
//
//		// try block to end more gracefully than red error labels
//		try {
//			do {
//				System.out.println("Please enter your age: ");
//				age = sc310.nextInt();
//				// age validation step
//			} while ((age < 1) || (age > 120));
//
//			// output message
//			if (age >= 1 && age <= 30) {
//				System.out.println("You are young");
//			} else if (age >= 31 && age <= 60) {
//				System.out.println("You are getting on!");
//			} else {
//				System.out.println("You look amazing for your age!");
//			}
//		} catch (Exception exception) {
//			System.out.println("Opps that went wrong!");
//		}
//
//		sc310.close();

	}

}


