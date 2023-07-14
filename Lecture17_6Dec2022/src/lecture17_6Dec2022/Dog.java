/**
 * 
 */
package lecture17_6Dec2022;

/**
 * @author joshm
 *
 */
public class Dog extends Animal {

	private String licenseNumber;
	
	/**
	 * default dog constructor
	 */
	public Dog() {

	}

	/**
	 * Constructor for dog
	 * @param name
	 * @param licenseNumber
	 */
	public Dog(String name, String licenseNumber) {
		super(name);
		this.setLicenseNumber(licenseNumber);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Simple Named Dog constructor
	 * @param name
	 */
	public Dog (String name) {
		super(name);
		setLicenseNumber("UNSET");
	}


	/**
	 * Dog noise method
	 */
	public void makeNoise() {
		System.out.println(this.getName()+" barks. WOOF WOFF!!");
	}
	
	public void markTeritory() {
		System.out.println("Lift leg and Sprayyy!!!!");
	}

	/**
	 * @return the licenseNumber
	 */
	public String getLicenseNumber() {
		return licenseNumber;
	}

	/**
	 * @param licenseNumber the licenseNumber to set
	 */
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
}
