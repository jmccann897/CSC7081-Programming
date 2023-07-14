package importingandconditions26Sep2022;

//Importing scanner class into package
import java.util.Scanner;

public class inputExperiment26Sep2022 {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		
		num1 = 100;
		System.out.println("Please enter an integer number and press Enter");
		num1 = sc.nextInt();
		
		System.out.println("Please enter another number");
		num2 = sc.nextInt();
		
		int result = num1 / num2;
				
		System.out.println(num1 + " div " + num2 +" is "+result);
		
		sc.close();
	}

}
