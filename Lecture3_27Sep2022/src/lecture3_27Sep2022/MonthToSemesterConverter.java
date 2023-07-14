package lecture3_27Sep2022;
import java.util.Scanner;
public class MonthToSemesterConverter {

	public static void main(String[] args) {
		// vars
		int ui;
		
		//prompt
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a integer relating to a month (1 to 12)");
		ui = sc.nextInt();

		if (ui>=9 && ui<13 || ui==1) {
			System.out.println("Semester 1");
		}
		else if (ui>=2 && ui<6) {
			System.out.println("Semester 2");
		}
		else if (ui>=6 && ui<9) {
			System.out.println("Summer");
		}
		sc.close();
	}

}
