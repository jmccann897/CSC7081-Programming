package lecture17_6Dec2022;

public class Lecturer extends Employee {
	
	private String school;

	/**
	 * Constructor
	 * @param firstName
	 * @param lastName
	 * @param school
	 */
	public Lecturer(String firstName, String lastName, String school) {
		super(firstName, lastName);
		this.setSchool(school);
	}

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}


	/**
	 * Overridden salary calc method
	 */
	public void calculateSalary(double rate, double hours) {
		System.out.println("Salary "+(rate*hours*3));
	}

	@Override
	public void printLineManager() {
		System.out.println("Head of School");
		
	}
	
	
	
}
