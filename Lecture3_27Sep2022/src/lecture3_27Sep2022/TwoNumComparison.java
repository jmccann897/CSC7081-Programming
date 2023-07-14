package lecture3_27Sep2022;

public class TwoNumComparison {

	public static void main(String[] args) {
		// vars
		int num1;
		int num2;
		
		num1 = 300;
		num2 = 300;
		
		if (num1>num2) { 
			System.out.println(num1+" is num1");
		}
		else if (num2>num1) {
			System.out.println(num2+" is num2");
		}
		else if (num1==num2) {
			System.out.println("Both numbers are the same");
		}

	}

}
