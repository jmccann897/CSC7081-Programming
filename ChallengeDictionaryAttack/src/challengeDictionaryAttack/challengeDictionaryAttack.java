package challengeDictionaryAttack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class challengeDictionaryAttack {
	public static Scanner sc = new Scanner(System.in); // declare scanner for use

	public static void main(String[] args) {
		/*
		 * 
		 * write a program that will:
		 * 
		 * 1. Prompt the user for a password
		 * 
		 * 2. Read-in the contents of rockyou.txt
		 * 
		 * 3. Check if the user's password is in common usage ie part of the rockyou
		 * Word List.
		 */

		String pswrd = prompt();
		check(pswrd);

	}

	public static void check(String password) {
		// need to readInFile - would be nice as own method but not sure of what to pass
		String line;
		try {
			// create file object
			File file = new File("rockyou.txt");
			// create file reader
			FileReader filereader = new FileReader(file.getName());
			// create buffered reader
			BufferedReader bufferReader = new BufferedReader(filereader);
			// read contents
			line = bufferReader.readLine();
			boolean flag = false;
			// be careful to put null check first on loop through file
			// otherwise the final value is null and will test
			// conditions and cause null pointer exception
			while (line != null && !flag) {
				// flag = false; //no match found
				if (line.equals(password)) {
					flag = true; // match changes flag
				}
				line = bufferReader.readLine(); // move to next line
			}
			//check for password found or not by flag status
			if (flag) {
				System.out.println("Weak password! Try Another");
			} else {
				System.out.println("Password not found..could be a good one");
			}
			System.out.println("Bye");

			// close resources
			filereader.close();
			bufferReader.close();

			// exception catches
		} catch (FileNotFoundException e) {
			System.out.println("Hmmm couldn't find the Word List !");
		} catch (IOException e) {
			System.out.println("Well, I had a problem reading the Word List  !");
		} catch (Exception e) {
			System.out.println("Now that's a real problem ! Something bad happened.");
		}
	}

	/**
	 * Ask user for a password to check against rockYou Return user string entry
	 */
	public static String prompt() {
		//
		System.out.println("Please enter a password to check against RockYou list");
		String userpswrd = sc.nextLine();
		System.out.println("OK, let's check that one...");
		return userpswrd;
	}

}
