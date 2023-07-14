package lecture28_16Mar2023;

public class FactorialEx {

	public static void main(String[] args) {
		
		int value = 7;
		
		System.out.println(value+"! = "+factorial(value));

	}

	private static int factorial(int num) {

		if (num==1) {
			return 1;
		}

		//recursive step
		return num*factorial(num-1);
	}

	

}
