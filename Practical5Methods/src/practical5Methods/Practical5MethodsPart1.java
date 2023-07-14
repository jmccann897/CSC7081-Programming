package practical5Methods;

import java.util.Random;
import java.util.Scanner;
import java.util.Calendar;

public class Practical5MethodsPart1 {

	public static void main(String[] args) {
		// All questions will generate methods
		// Which can be called to test in main

		oddEvenChecker(30);
		makeLowerCase('7');
		isMultiple(5, 100);
		randTenNumOutOfHundred();
		countDownStarPrinter();
		printNumberInWord();
		sumAvgPrint(100);
		amPMcheck();
	}

	/**
	 * This method is an odd or even checker Solution for Practical 5 Methods Part
	 * 1, Q1
	 * 
	 * @param a
	 */
	public static void oddEvenChecker(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is even!");
		} else {
			System.out.println(a + " is odd!");
		}
	}

	/**
	 * This method take an Upper case character parameter and prints it in lower
	 * case Solution for Practical 5 Methods Part 1, Q2
	 * 
	 * @param letter
	 */
	public static void makeLowerCase(char letter) {
		if (Character.isLetter(letter)) {
			if (Character.isUpperCase(letter)) {
				System.out.println(Character.toLowerCase(letter));
			} else {
				System.out.println("This character is already lower case");
			}
		} else {
			System.out.println("You didn't enter a letter");
		}
	}

	/**
	 * This method determines if the second int is a multiple of the first Solution
	 * for Practical 5 Methods Part 1, Q3
	 * 
	 * @param a
	 * @param b
	 */

	public static void isMultiple(int a, int b) {
		if (b % a == 0) {
			System.out.println(b + " is a multiple of " + a);
		} else {
			System.out.println(a + " is not a factor of " + b);
		}
	}

	/**
	 * This method should generate a set of 10 random numbers between 1 and
	 * 200(inclusive). The numbers are generated and stored within the local method,
	 * not main. Solution for Practical 5 Methods Part 1, Q4
	 */
	public static void randTenNumOutOfHundred() {
		Random rand = new Random();
		int num1 = (rand.nextInt(100)) + 1;
		int num2 = (rand.nextInt(100)) + 1;
		int num3 = (rand.nextInt(100)) + 1;
		int num4 = (rand.nextInt(100)) + 1;
		int num5 = (rand.nextInt(100)) + 1;
		int num6 = (rand.nextInt(100)) + 1;
		int num7 = (rand.nextInt(100)) + 1;
		int num8 = (rand.nextInt(100)) + 1;
		int num9 = (rand.nextInt(100)) + 1;
		int num10 = (rand.nextInt(100)) + 1;
		System.out.println("Generating 10 random integers in range 1..100");
		System.out.println("Generated : " + num1);
		System.out.println("Generated : " + num2);
		System.out.println("Generated : " + num3);
		System.out.println("Generated : " + num4);
		System.out.println("Generated : " + num5);
		System.out.println("Generated : " + num6);
		System.out.println("Generated : " + num7);
		System.out.println("Generated : " + num8);
		System.out.println("Generated : " + num9);
		System.out.println("Generated : " + num10);
	}

	/**
	 * This method takes an integer input between 5 and 50 inclusive and prints the
	 * number with the number of stars on a line and counts down to 1
	 * Solution for Practical 5 Methods Part 1, Q5
	 * @param a
	 */

	public static void countDownStarPrinter() {
		// prompt for input and validation
		System.out.println("Please enter an integer between 5 and 50");
		Scanner countDownScanner = new Scanner(System.in);
		int a = countDownScanner.nextInt();
		if (a < 5 || a > 50) {
			System.out.println("Error: Value is outside expected range");
		} else {

			// Loop for printing
			for (int i = a; i >= 1; i--) {
				for (int j = 0; j < 1; j++) {
					String stars = "*".repeat(i);
					System.out.println(i + " " + stars);
				}
			}
		}

	}
	/**
	 * This method allows user to input a number and
	 * prints the number in word form
	 * Solution for Practical 5 Methods Part 1, Q6
	 */
	public static void printNumberInWord() {
		//prompt to capture input
		System.out.println("Please enter a number");
		Scanner printNumberInWordSc = new Scanner(System.in);
		int a = printNumberInWordSc.nextInt();
		
		
		//Nested Loop to convert integer to String
		//to get length of integer, casting to String to use instance methods
		String numStr = Integer.toString(a);
		for (int i=0; i< numStr.length(); i++) {
			char curDigit = numStr.charAt(i);
			//System.out.println(curDigit);
			if (curDigit=='0') {
				System.out.print("ZERO");
			}else if (curDigit=='1') {
				System.out.print("ONE");
			}else if (curDigit=='2') {
				System.out.print("TWO");
			}else if (curDigit=='3') {
				System.out.print("THREE");
			}else if (curDigit=='4') {
				System.out.print("FOUR");
			}else if (curDigit=='5') {
				System.out.print("FIVE");
			}else if (curDigit=='6') {
				System.out.print("SIX");
			}else if (curDigit=='7') {
				System.out.print("SEVEN");
			}else if (curDigit=='8') {
				System.out.print("EIGHT");
			}else if (curDigit=='9') {
				System.out.print("NINE");
			}
			System.out.print(" ");
			
			
			//doing it with switch case??
			//Does switch work with char cases?
		}
		System.out.println();
	}
		/**
		 * This method iterates up from 1 to the parameter and
		 * prints the sum and average
		 * Solution for Practical 5 Methods Part 1, Q7
		 * @param b
		 */
		public static void sumAvgPrint(int b) {
			int sum = 0;
			double avg = 0;
			for (int i=1; i<=b; i++) {
				sum+=i;
			}
			avg=sum/b;
			System.out.println("The total sum is "+sum);
			System.out.println("The average is "+ avg);
		}
		
		
		/**
		 * This method checks the Hour of the Day and prints a messgae
		 * depending on whether it is AM or PM
		 */
		public static void amPMcheck() {
			Calendar cal = Calendar.getInstance();
			if (Calendar.HOUR_OF_DAY>0 && Calendar.HOUR_OF_DAY<12) {
				System.out.println("Good morning!");
			}else {
				System.out.println("Hope the morning went well. Enjoy the rest of your day!");
			}
			//not getting expected outputs from calendar methods
			System.out.println(Calendar.AM_PM);
			System.out.println(Calendar.HOUR_OF_DAY);
				
					
								
			
		}
		
		
		
		
	}


	
	
	
