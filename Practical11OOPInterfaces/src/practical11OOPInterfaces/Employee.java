package practical11OOPInterfaces;

public abstract class Employee {
	
	//instance vars
	private String firstName;
	private String lastName;
	private double baseRate;
	
	public Employee(String firstName, String lastName, double baseRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.baseRate = baseRate;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return this.lastName;
	}

	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}
	public double getBaseRate() {
		return this.baseRate;
	}
	
	public double calculateWeeklySalary(double hours) {
		return hours*this.baseRate;
	}
	
	public void printAll() {
		System.out.println("Employee [firstName=" + firstName + ", lastName=" + lastName + ", baseRate=" + baseRate + "]");
	}
	
	
}
