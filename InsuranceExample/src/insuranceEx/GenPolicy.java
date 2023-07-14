/**
 * 
 */
package insuranceEx;

/**
 * @author joshm
 *
 */
public abstract class GenPolicy {

	// instance vars
	private String surname;
	private int age;
	
	private static final int MIN_AGE = 0;
	private static final int MAX_AGE = 100;

	/**
	 * @param surname
	 * @param age
	 */
	public GenPolicy(String surname, int age) {
		this.setSurname(surname);
		this.setAge(age);
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Method to set Surname 
	 * Must be 3-20 characters
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) throws IllegalArgumentException {
		if (surname.length() > 2 && surname.length() < 21) {
			this.surname = surname;
		} else {
			throw new IllegalArgumentException("Invalid Surname");
		}
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) throws IllegalArgumentException {
		if (age > MIN_AGE && age < MAX_AGE) {
			this.age = age;
		} else {
			throw new IllegalArgumentException("Invalid age entered");
		}
	}

	/**
	 * write details to console
	 */
	public void displayAll() {
		System.out.println("Surname:      " + getSurname());
		System.out.println("Age:          " + getAge());
	}

}
