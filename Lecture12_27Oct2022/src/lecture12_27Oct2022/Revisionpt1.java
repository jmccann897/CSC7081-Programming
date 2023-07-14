package lecture12_27Oct2022;

import java.util.Arrays;

public class Revisionpt1 {

	public static void main(String[] args) {
		// checking casting
		
		int i;
		char ch;
		i=88;
		ch=(char)i;
		System.out.println(ch);
		
		//checking array quiz question1
		int[] nums = new int[5];
		int count=0;
		int val=1;
		
		System.out.println("cnt val indx   array");
		while (count<15) {
			nums[count%5] += val;
			System.out.printf("%d   %d   %d     ", count, val, count%5);
			System.out.println(Arrays.toString(nums));
			val++;
			count++;
		}
		System.out.println(Arrays.toString(nums));
		totalArray(nums);
		
		
		
	}
 
	
	/**
	 * a method to print sum of an array of ints
	 * @param theArray
	 */
	public static void totalArray (int[] theArray) {
		int sum=0;
		for(int variable: theArray) {
			//do something on each elem of array
			sum+=variable;
		}
		System.out.println("Final sum is "+sum);
	}
}
