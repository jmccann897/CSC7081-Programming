package practical3;

import java.util.Scanner;

public class practical3part1 {

	public static void main(String[] args) {
		// initialise scanner
		Scanner sc = new Scanner(System.in);
		
		double input;
		
		
		//request input & assign to input variable
		System.out.println("Please enter a decimal point number in the format xx.xxxx");
		input = sc.nextDouble();
		
		//use variable
//		double inputSquared=input*input;
//		double inputCubed = Math.pow(input, 3);
//		double inputSqrt = Math.sqrt(input);
		
	
		//print statements 
		//printf for formatting which allows decimal place setting, tabbing, new line and also variable manip
		System.out.printf("Number rounded (two decimal places)\t: %.2f \n", input);
		System.out.printf("Number squared (three decimal places)\t: %.3f \n", input*input);
		System.out.printf("Number cubed to (three decimal places)\t: %.3f \n", Math.pow(input,3));
		System.out.printf("Square root (four decimal places)\t: %.4f \n", Math.sqrt(input));
		
		
		
		
		sc.close();
	}

}
