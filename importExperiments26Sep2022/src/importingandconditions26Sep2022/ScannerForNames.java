package importingandconditions26Sep2022;

import java.util.Scanner;

public class ScannerForNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String name;
		
		System.out.println("Who are you?");
		name = sc.nextLine();
		
		System.out.println("Hello "+name+".");
		
		sc.close();
	}

}
