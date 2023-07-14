package lecture6_06Oct2022;

public class ForLoops {

	public static void main(String[] args) {
		// Use While/Do While Loop for unknown iterations
		//Use For Loop for known iterations
		
//		for (int count=1; count<11; count++) {
//			System.out.println("Count is: "+count);
//		}
		
		//Selecting substring from string using for loop
		String name = "Matthew";
		
		for (int i=1; i<6; i++) {
			System.out.println(i+" "+name.charAt(i));
		}

	}

}
