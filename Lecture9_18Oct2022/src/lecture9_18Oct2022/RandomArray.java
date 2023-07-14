package lecture9_18Oct2022;

import java.util.Random;

public class RandomArray {

	public static void main(String[] args) {
		// 
		Random rand = new Random();
		int [] numbers = new int[3];
		//create values and assign in arrayy
		for (int i=0; i<numbers.length; i++) {
			numbers[i]= rand.nextInt(10);
		}
		//printing array
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]+" ");
		}

	}

}
