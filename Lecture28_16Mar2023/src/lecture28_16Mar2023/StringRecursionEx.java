package lecture28_16Mar2023;

public class StringRecursionEx {

	public static void main(String[] args) {


		String name = "Aidan";
		
		//String flipped = reverseString(name);
		String flipWithRecursion = reverseStrRecursively(name);
		
		System.out.println("Before : "+name);
		//System.out.println("After  : "+flipped);
		System.out.println("Rec ver: "+flipWithRecursion);

	}

	private static String reverseStrRecursively(String str) {
		
		System.out.println("In method with "+str);
		//base case
		if (str.length()<=1) {
			//already reversed
			System.out.println("Base case reached");
			System.out.println("Returning "+str);
			return str;
		}
		//recursive step
		
		//take the head off
		//move it to the end
		//call reverse on the rest (the tail)
		String result = reverseStrRecursively(str.substring(1)) + str.charAt(0);
		
		System.out.println("Returning " +result);
		
		return result;
	}

	/**
	 * Using normal looping methods
	 * @param str
	 * @return
	 */
	private static String reverseString(String str) {

		String result = "";
		
		for (int i = str.length()-1; i>=0; i--) {
			result += str.charAt(i);
		}

		return result;
	}

}
