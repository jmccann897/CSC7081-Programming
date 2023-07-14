package hospitalPayRoll;

public abstract class Employee {

	// instance vars
	private String firstName;
	private String lastName;
	public double baseRate;
	
	//default constructor
	public Employee() {
		
	}
	
	//Arg based constructor
	public Employee(String firstName, String lastName, double baseRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.baseRate = baseRate;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the baseRate
	 */
	public double getBaseRate() {
		return baseRate;
	}

	/**
	 * @param baseRate the baseRate to set
	 */
	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}

	// calculate
	/**
	 * 
	 * @param hours
	 */
	public abstract void calculateWeeklySalary(double hours);
	

	// printAll

	/**
	 * 
	 * @param e1
	 */
	public void printAll() {
		System.out.printf("[%-10s] %-20s %-20s %-20s %n",
				this.getClass().getSimpleName(), this.getFirstName(), this.getLastName(), this.baseRate);
	}

}
