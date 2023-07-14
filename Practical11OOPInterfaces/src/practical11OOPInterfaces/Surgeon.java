package practical11OOPInterfaces;

public class Surgeon extends Employee implements AdminsterDrugs {
	
	//instance vars
	private String specialistArea;
	private double consultationFee;

	public Surgeon(String firstName, String lastName, double baseRate, String specialistArea, double consultationFee) {
		super(firstName, lastName, baseRate);
		this.specialistArea = specialistArea;
		this.consultationFee = consultationFee;
	}

	public String getSpecialistArea() {
		return specialistArea;
	}
	public void setSpecialistArea(String specialistArea) {
		this.specialistArea = specialistArea;
	}

	public double getConsultationFee() {
		return consultationFee;
	}
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}
	
	@Override
	public double calculateWeeklySalary(double hours) {
		return super.calculateWeeklySalary(hours)+consultationFee;
	}

	@Override
	public void printAll() {
		System.out.println("Surgeon [firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() +
				", baseRate=" + this.getBaseRate() + "specialistArea=" + specialistArea + "consultationFee=" + consultationFee + "]");
	}

	@Override
	public boolean adminControlledDrug() {
		return false;
	}

	@Override
	public boolean adminNoncontrolledDrug() {
		return true;
	}

}
