/**
 * 
 */
package lecture17_6Dec2022;

/**
 * @author joshm
 *
 */
public class Animal {

	private String name;
	
	/**
	 * default constructor
	 */
	public Animal() {
		
	}
	/**
	 * constructor that expects a name
	 * @param name
	 */
	public Animal(String name) {
		this.setName(name);
	}
	
	
	/**
	 * Generic make Noise method
	 */
	public void makeNoise() {
		System.out.println("This animal makes a noise");
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
