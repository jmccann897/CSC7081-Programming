/**
 * 
 */
package hospitalPayRoll;

/**
 * @author joshm
 *
 */
public class Porter extends Employee {

	public String site;

	/**
	 * default constructor
	 */
	public Porter() {

	}

	/**
	 * arg constructor
	 * 
	 * @param site
	 */
	public Porter(String firstName, String lastName, double baseRate, String site) {
		super(firstName, lastName, baseRate);
		this.site = site;
	}

	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.printf("%-15s %-15s [%-15s] : %-5.2fhrs * £%-5.2f = £%-5.2f %n", 
				this.getFirstName(), this.getLastName(), this.getClass().getSimpleName(),
				hours, baseRate, (hours* this.getBaseRate()));
	}

	// getter
	public String getSite() {
		return site;
	}

	// setter
	public void setSite(String site) {
		this.site = site;
	}
	@Override
	public void printAll() {
		System.out.printf("[%-10s] %-20s %-20s %-20s %-20s %n",
				this.getClass().getSimpleName(), this.getFirstName(), this.getLastName(), this.baseRate, this.site);
	}

}
