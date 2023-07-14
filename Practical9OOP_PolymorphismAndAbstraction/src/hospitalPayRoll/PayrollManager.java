package hospitalPayRoll;

public class PayrollManager {

	// global vars
	public static int HOURS_PER_WEEK = 35;
	public static Employee[] employees = new Employee[6];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create 6 employees
		Employee porter1 = new Porter("Ivana", "Patient", 10.50, "Royal");
		Employee porter2 = new Porter("Amanda", "Pushabed", 10.50, "BCH");
		Employee surgeon1 = new Surgeon("Jack", "Ripper", 55.25, "Renal", 650.00);
		Employee surgeon2 = new Surgeon("Edward", "Lister", 55.25, "Vascular", 800.00);
		Employee pharmacist1 = new Pharmacist("Poppy", "Pill", 30.50, 7, 750.00);

		// update employee array
		addEmployeeToList(porter1);
		addEmployeeToList(porter2);
		addEmployeeToList(surgeon1);
		addEmployeeToList(surgeon2);
		addEmployeeToList(pharmacist1);

		displayAllEmployees();
		
		processWeeklyPayroll();

	}

	public static void addEmployeeToList(Employee e) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] == null) {
				// add employee
				employees[i] = e;
				break;
			}
		}
	}

	public static void displayAllEmployees() {
		System.out.println("Display all employees");
		System.out.printf("[%-10s] %-20s %-20s %-20s %-20s %n", 
				"Type", "First name", "Last name", "Rate", "Other");
		for (Employee e : employees) {
			if (e != null) {
				e.printAll();
			}
		}
	}

	

	public static void processWeeklyPayroll() {
		System.out.println("Payroll Run.......");
		int employeeTotal=0;
		
		for (Employee e : employees) {
			if (e != null) {
				e.calculateWeeklySalary(HOURS_PER_WEEK);
				employeeTotal+=1;
			}
			
		}
		System.out.println("Total records processed: "+employeeTotal);

	}

}
