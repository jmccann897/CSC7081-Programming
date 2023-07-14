package lecture17_6Dec2022;

public abstract class Employee {

	private String firstName;
	private String lastName;
	
	//constructor with args
	public Employee(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}
	
	//return firstname
	public String getFirstName() {
		return firstName;
	}
	
	//set the firstname of the object
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//return lastname
	public String getLastName() {
		return lastName;
	}
	
	//set the lastname of the object
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//calculate salary method
	public void calculateSalary(double rate, double hours) {
		System.out.println("Salary "+ (rate*hours));
	}
	
	//abstract method example
	public abstract void printLineManager();
	
	
}
