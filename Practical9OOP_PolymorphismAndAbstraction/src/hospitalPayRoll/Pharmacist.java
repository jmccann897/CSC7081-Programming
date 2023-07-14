package hospitalPayRoll;

public class Pharmacist extends Employee {

	public int grade;
	public double bonus;

	/**
	 * default constructor
	 */
	public Pharmacist() {

	}

	/**
	 * arg constructor
	 */
	public Pharmacist(String firstName, String lastName, double baseRate, int grade, double bonus) {
		super(firstName, lastName, baseRate);
		this.grade = grade;
		this.bonus = bonus;

	}

	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.printf("%-15s %-15s [%-15s] : %-5.2fhrs * £%-5.2f + £%-5.2f = £%-5.2f %n", 
				this.getFirstName(), this.getLastName(), this.getClass().getSimpleName(),
				hours, baseRate, bonus, (hours* this.getBaseRate()+bonus));
	}

	// getter baseRate

	// getter grade
	public int getGrade() {
		return grade;
	}

	// setter grade
	public void setGrade(int grade) {
		this.grade = grade;
	}

	// getter bonus
	public double getBonus() {
		return bonus;
	}

	// setter bonus
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public void printAll() {
		System.out.printf("[%-10s] %-20s %-20s %-20s %-20s %-20s %n",
				this.getClass().getSimpleName(), this.getFirstName(), this.getLastName(), 
				this.baseRate, "Grade:"+this.grade, "Bonus: "+this.bonus);
	}

}
