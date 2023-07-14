package lecture5_04Oct2022;

import java.util.Scanner;
import java.util.Random;

public class LoopExcercise {

	public static void main(String[] args) {
		// 
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int rn = (rand.nextInt(10));
		rn++;
		
		System.out.println("Try to guess a number between 1 and 10: ");
		
		//System.out.println(rn);
			
		//trying to ensure guesses are within range
		int ug;
		do {
			System.out.println("Please guess 1-10: ");
			ug =sc.nextInt();
		} while (ug<1 || ug>10);
		
		
		//trying to check if numbers match and allow multiple entries
		while (rn!=ug) {
			System.out.println("Wrong");
			if (ug==rn+1 || ug==rn-1) {
				System.out.println("But you are close (1 away");
			}
			System.out.println("Please try again: ");
			ug=sc.nextInt();
		}
		
		if (rn==ug) {
			System.out.println("Congrats, you are correct, it was "+ rn);
		}
		
		sc.close();
		
		
	}

}
