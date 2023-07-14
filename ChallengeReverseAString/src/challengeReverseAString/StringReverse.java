package challengeReverseAString;

public class StringReverse {

	public static void main(String[] args) {
		// Take in a string object
		
		//reverse the string using recursion
		
		String palindrome = "text";
		int length = palindrome.length();
		char[] tempCharArray = new char[length];
		char[] charArray = new char[length];
		
		//put orig string in array of chars
		int loopCount=0;
		for (int i=palindrome.length()-1; i>-1;i--) {
			char c = palindrome.charAt(i);
			//original in char array
			charArray[i] = c;
			//reverse in char array
			tempCharArray[loopCount] = c;
			loopCount++;
		}
		
		String reversed = new String (tempCharArray);
		String original = new String(charArray);
		System.out.println("Original string: " + original);
		System.out.println("String reversed: " + reversed);
		//reverse array of chars
		
		//check if orig was palindrome

		char cOrig;
		char cRev;
		int count =0;
		boolean verify = true;
		
		for(int i=0; i<palindrome.length();i++) {
			//check match
			cOrig = palindrome.charAt(i);
			cRev = reversed.charAt(i);
			if(cOrig == cRev) {
				verify = true;
			}else {
				verify = false;
				break;
			}
			
		}
		
	
//		System.out.println("Size of charArray: "+charArray.length);
//		System.out.println("Size of tempCharArray: "+tempCharArray.length);
//		
//		System.out.println();
//		System.out.println("Checking the original string is the same as the reverse");
//		System.out.println();
//		
//		if (verify) {
//			System.out.println("String is a palindrome");
//		}else {
//			System.out.println("String is not a palindrome");
//		}
		
		
		
		//using String Builder
		
		StringBuilder sb = new StringBuilder();
		sb.reverse();
		System.out.println(sb);
		
		
		
	}

}
