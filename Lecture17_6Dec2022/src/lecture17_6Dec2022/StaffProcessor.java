package lecture17_6Dec2022;

public class StaffProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lecturer emp1 = new Lecturer("Aidan", "McG", "EECS");
		emp1.calculateSalary(40, 10);
		
		Employee emp2 = new Lecturer("Josh", "McCann", "EECS"); //can create abstract employee object via lecturer constructor
		emp2.calculateSalary(50, 10);
		
		Employee emp3 = new Reader("Bobby", "Jonas", "programming");
		emp3.calculateSalary(50, 10);
		
		emp3.printLineManager();
		emp2.printLineManager();
	}

}
