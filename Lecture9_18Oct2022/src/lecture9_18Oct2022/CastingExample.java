package lecture9_18Oct2022;

public class CastingExample {

	public static void main(String[] args) {
		// Casting
		// Method to convert between data types
		// Widening is automatic
		// Narrowing is manual
		// Need to consider loss of precision when casting calculations
		
		int answer;
		double a;
		double b;
		a = 23.4;
		b = 3.45;
		answer = (int) (a + b);

		System.out.println(answer);
		System.out.println((int) answer);
		System.out.println(Math.round(answer));
		
	}

}
