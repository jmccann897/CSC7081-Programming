package lecture3_27Sep2022;
import java.util.Scanner;
public class ImportingNotesEX2 {

	public static void main(String[] args) {
		// VARS
		double length;
		double area;
		double peri;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please enter the length of the side of the square as a double (X.XX)");
		length = sc.nextDouble();
		
		//calcs
		area = Math.pow(length, 2);
		peri = length*4;  
		
		
		//print results
		System.out.printf("%.2f is the area%n", area);
		System.out.printf("%.2f is the perimeter%n", peri);
		
		sc.close();
	}

}
