package lecture9_18Oct2022;

public class ByteCastExample {

	public static void main(String[] args) {
		//casting numbers outside byte range -128 to +127 and it will roll over
		
		int i = 128;
		byte b;
		
		b = (byte)i;
		
		System.out.println(b);

		// will cast as long as its within ASCII range
		int j;
		char ch;
		j =88; //ascii code
		ch = (char) j;
		System.out.println(ch);
	}

}
