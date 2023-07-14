package challengePractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
* @author - McCannJoshua 40059274
*/
public class Driver {
	
	public static void main(String[] args) {
		
		//write show menu 
		showMenu();
		
		
		//write read /write from scratch
		
	}

	private static void showMenu() {
		// allow user to input number to select option in menu
		
		Scanner sc = new Scanner(System.in);
		int userInput;
		
		do {
			//print menu
			System.out.println("Please enter number and press enter to select action");
			System.out.println();
			System.out.println("Option 1: Read in data");
			System.out.println("Option 2: Order data by size");
			System.out.println("Option 3: Print to screen word version of data");
			System.out.println("Option 4: Remove duplicate values and print to screen");
			System.out.println("Option 5: Exit menu system");
			userInput = sc.nextInt();
			switch (userInput) {
			case 1: readInData(); break;
			case 2: OrderDataBySize(); break;
			case 3: PrintWordVer(); break;
			case 4: RemoveDup(); break;
			case 5: Exit(); break;
			}
			
			
		} while(userInput != 5); 
		
		sc.close();
	}

	private static void Exit() {
		// 
		System.out.println("Exitting program");
		
	}

	private static void RemoveDup() {
		// TODO Auto-generated method stub
		
	}

	private static void PrintWordVer() {
		// TODO Auto-generated method stub
		
	}

	private static void OrderDataBySize() {
		// TODO Auto-generated method stub
		
	}

	private static void readInData() {

		String filename = "dumData.csv";

		File f = new File(filename);
		String line = "";
		
		try (FileReader fr = new FileReader(f); 
				BufferedReader br = new BufferedReader(fr);){
			
			//data is integers, read into a list
			
			line = br.readLine();
			
			//split by comma
			String[] extract = line.split(",");
			
			List<Integer> data = new ArrayList<Integer>();
			
			
			for (String s: extract) {
				Integer toAdd = Integer.parseInt(s);
				data.add(toAdd);
			}
			
			System.out.println(data);
			
			System.out.println("Max value in data is: "+Collections.max(data));
			System.out.println("Min value in data is: "+Collections.min(data));
			System.out.println("No.5 occurs: "+Collections.frequency(data, 5)+" times");
			
 			Collections.sort(data);
			System.out.println(data);
			
			SortedSet<Integer> mySet = new TreeSet<Integer>(data);
			System.out.println(mySet);
			
			System.out.println();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
