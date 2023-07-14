package challengeFinaryBinary;

import java.util.Arrays;

public class ChallengeFinaryBinary {
	
	
	public static void main(String[] args) {
		
		//boolean[] eightBitArray = { true, false, false, true, false, true, false, true };
		

		
		//take in array of boolean and return binary equivalent
		
		boolean[] eightBitArray = {true, false, false, true, false, true, false, true};
		
		//create array to hold binary
		
		int[] binary = new int[8];
		
		
		//loop through eightBit and use if to store corresponding value
		for (int i=0; i< eightBitArray.length; i++) {
			
			if (eightBitArray[i]==true) {
				binary[i]=1;
			}else if(eightBitArray[i]==false) {
				binary[i]=0;
			}
		}
		System.out.println(Arrays.toString(binary));
		
		//converting binary to decimal
		int decimalValue=0;
		//list of base values
		//0,1,2,4,8,16,32,64
		//loop through
		//has to go back to front
		// base increase by doubling each iteration
		
		int base = 1;
		for (int i=binary.length-1; i>=0; i--) {
			decimalValue += binary[i]*base;
			base*=2;
			//System.out.println(decimalValue);
		}
		System.out.println(decimalValue);
		
		
	}
	
	
}
