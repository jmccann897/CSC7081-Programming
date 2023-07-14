/**
 * 
 */
package insuranceEx;

import java.util.Calendar;

/**
 * @author joshm
 *
 */
public class MotorPolicy extends GenPolicy {

	private MotorType motorType;
	private String motorPolicyID;

	/**
	 * @param surname
	 * @param age
	 */
	public MotorPolicy(String surname, int age, MotorType motorType) {
		super(surname, age);
		this.setMotorType(motorType);
		this.generatePolicyID();
	}

	/**
	 * Update motorPolicyID field based on current instance vars SUR-TIME-PARITY SUR
	 * - first 3 letters of surname TIME - from current timestamp PARITY - if time
	 * is odd or even
	 */
	private void generatePolicyID() {
		String sur = generateSur();
		int timeStamp = generateTimeStamp();
		String par = generatePar(timeStamp);
		this.motorPolicyID = sur + timeStamp + par;

	}

	/**
	 * @return the motorType
	 */
	public MotorType getMotorType() {
		return motorType;
	}

	/**
	 * @param motorType the motorType to set
	 */
	public void setMotorType(MotorType motorType) {
		this.motorType = motorType;
	}

	/**
	 * @return the motorPolicyID
	 */
	public String getMotorPolicyID() {
		return motorPolicyID;
	}

	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("MotorPolicyID:" + getMotorPolicyID());
		System.out.println("MotorType:    " + getMotorType());
	}

	/**
	 * This method generates the <SUR> string section for motorPolicy ID
	 * @return
	 */
	private String generateSur() throws IllegalArgumentException {
		String sur;
		if (this.getSurname() == null) {
			throw new IllegalArgumentException();
		} else {
			sur = this.getSurname().substring(0, 3);
		}
		return sur;
	}
	
	/**
	 * This method generates the <TIME> section of MotorPolicyID
	 * @return
	 */
	private int generateTimeStamp() {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
		// sum of the year and month
		int timeStamp = year + month;
		return timeStamp;
	}
	
	private String generatePar(int timeStamp) {
		return (timeStamp%2 ==0) ? "0" : "1"; //ternary
	}
}
