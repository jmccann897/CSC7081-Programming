package lecture12_27Oct2022;

import java.util.Arrays;

public class Revisionpt2 {

	
		 public static void addToArray(int[] theArray) {
		        int addToEach = 5;
		        for(int i=0;i<theArray.length;i++) {
		            theArray[i] += addToEach;
		        }
		    }
		    public static void secondAdd(int[] theArray) {
		        int addToEach = 5;
		        for(int variable: theArray) {
		            //do something with every value in array 
		            //one at a time
		            variable += addToEach;
		        }
		        /*
		        I was confused by the syntax of the foreach loop 
		        as I used For (int i : Array) and then tried to 
		        print Array[i] and got unexpected values...
		        */
		    }
		    public static void add(int num) {
		        int addToNum = 15;
		        num = addToNum+num;
		    }
		    public static void main(String[] args) {
		        int[] nums = new int[] {7,14,70,2,6};
		        secondAdd(nums);
		        System.out.println(Arrays.toString(nums));
		        int num = 7;
		        System.out.println("a:"+nums[3]);
		        add(num);
		        System.out.println("b:"+num);
		        addToArray(nums);
		        System.out.println("c:"+nums[3]);
		        add(nums[3]);
		        System.out.println("d:"+nums[3]);

	}

}

