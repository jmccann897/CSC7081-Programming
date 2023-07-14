package practical3;

import java.util.Scanner;

public class practical3part3 {

	public static void main(String[] args) {
		//part1
		
		//vars
		int age;
		String name;
		Scanner sc = new Scanner(System.in);
		
		
//		// prompt
		System.out.println("Enter age:");
		age = sc.nextInt();
		sc.nextLine(); // Finish reading the line
	
		
//		
//		//If statement
		if (age>0 && age<17) {
			System.out.println("too young to continue");
		} else if (age<=0) {
			System.out.println("sorry don't recognise your input");
		} else {
			System.out.println("Please enter name:");
			name = sc.nextLine();
			//sc.nextLine(); // Finish reading the line
			System.out.printf("Name entered %s and age entered %d%n", name, age);
		}
		
		//Part 2
		System.out.println("Enter 'Con' for Conservative and 'Lab' for Labour");
		String result = sc.next();
		sc.nextLine(); // Finish reading the line
		result = result.toLowerCase();
		
		if (result.contentEquals("con")) {
			System.out.println("You voted for Conservative");
		} 
		else if (result.contentEquals("lab")) {
			System.out.println("You voted for Labour");
		}
		else {
			System.out.println("Sorry voting party unrecognised");
		}
	
			
		sc.close();
	}

}
