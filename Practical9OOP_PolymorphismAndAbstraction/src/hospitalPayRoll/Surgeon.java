package hospitalPayRoll;

public class Surgeon extends Employee {
	public String specialistArea;
	public double consultationFee;

	/**
	 * default constructor
	 */
	public Surgeon() {
	}
	/**
	 * arg constructor
	 */
	public Surgeon(String firstName, String lastName, double baseRate, String specialistArea, double consultationFee) {
		super(firstName, lastName, baseRate);
		this.specialistArea = specialistArea;
		this.consultationFee = consultationFee;
	}

	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.printf("%-15s %-15s [%-15s] : %-5.2fhrs * £%-5.2f + £%-5.2f = £%-5.2f %n", 
				this.getFirstName(), this.getLastName(), this.getClass().getSimpleName(),
				hours, baseRate, consultationFee, (hours* this.getBaseRate()+consultationFee));
	}
	
	//getter for specArea
	public String getSpecialistArea() {
		return specialistArea;
	}
	//setter for specArea
	public void setSpecialistArea(String specialistArea) {
		this.specialistArea = specialistArea;
	}
	
	//getter for consultFee
	public double getConsultationFee() {
		return consultationFee;
	}
	//setter for consultFee
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}
	
	@Override
	public void printAll() {
		System.out.printf("[%-10s] %-20s %-20s %-20s %-20s %-20s %n",
				this.getClass().getSimpleName(), this.getFirstName(), this.getLastName(), 
				this.baseRate, "Area: "+this.specialistArea, "Fee: "+this.consultationFee);
	}

}
