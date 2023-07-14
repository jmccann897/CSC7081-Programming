package practical11OOPInterfaces;

public class Porter extends Employee {

	
	//instance vars
	private String site;
	
	public Porter(String firstName, String lastName, double baseRate, String site) {
		super(firstName, lastName, baseRate);
		this.site = site;
	}
	
	public void setSite(String site) {
		this.site = site;
	}
	public String getSite() {
		return this.site;
	}

	@Override
	public void printAll() {
		super.printAll();
		System.out.println("Porter [firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + 
				", baseRate=" + this.getBaseRate() + "Porter [site=" + site + "]");
	}
	
}

