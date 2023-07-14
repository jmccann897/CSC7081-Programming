package lecture5_04Oct2022;

public class Lecture5_04Oct2022 {

	public static void main(String[] args) {
		// Compound Assignment Operators
		int num;
		num=10;
		System.out.println("number before modifying " +num);
		
		num%=4;
		
		System.out.println("number after modifying "+num);
		
		num++;
		
		System.out.println("number after modifying "+ num);
		
		// note ++ can be prefixed
		// can work for doubles, bytes, characters
		
//		int num = 4;
//		num*=4;
//		System.out.println("a = " + ++num);
//		System.out.println("b = " + num--);
//		System.out.println("c = " + num);

	}

}
