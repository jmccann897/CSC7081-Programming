package challengeTrain;

public class Passenger {

	//instance vars
	private String firstName;
	private String surname;
	private int ID;
	private PassengerClass passengerClass;
	
	public Passenger(String firstName, String surname, int ID, PassengerClass passengerClass) {
		this.firstName = firstName;
		this.surname = surname;
		this.ID = ID;
		this.passengerClass = passengerClass;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}


	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}


	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}


	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}


	/**
	 * @return the passengerClass
	 */
	public PassengerClass getPassengerClass() {
		return passengerClass;
	}


	/**
	 * @param passengerClass the passengerClass to set
	 */
	public void setPassengerClass(PassengerClass passengerClass) {
		this.passengerClass = passengerClass;
	}


	@Override
	public String toString() {
		return "Passenger [firstName=" + firstName + ", surname=" + surname + ", ID=" + ID + ", passengerClass="
				+ passengerClass + "]";
	}
	
}
