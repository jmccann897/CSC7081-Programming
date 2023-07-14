package practical11OOPInterfaces;

public class Pharmacist extends Employee implements AdminsterDrugs {
	
	//instance vars
	private int grade;
	private double bonus;

	public Pharmacist(String firstName, String lastName, double baseRate, int grade, double bonus) {
		super(firstName, lastName, baseRate);
		this.grade = grade;
		this.bonus = bonus;
	}

	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double calculateWeeklySalary(double hours) {
		return super.calculateWeeklySalary(hours)+bonus;
	}

	@Override
	public void printAll() {
		System.out.println("Pharmacist [firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() +
				", baseRate=" + this.getBaseRate() + "grade=" + grade + "bonus=" + bonus + "]");
	}

	@Override
	public boolean adminControlledDrug() {
		return true;
	}

	@Override
	public boolean adminNoncontrolledDrug() {
		return true;
	}


	
	
}
