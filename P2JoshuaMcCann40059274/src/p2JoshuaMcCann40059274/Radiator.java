package p2JoshuaMcCann40059274;

/**
 * Radiator object class which inherits from Device object as a child of Device
 * 
 * @author Josh McCann 40059274
 *
 */

public class Radiator extends Device {

	// instance vars
	double tempNow;
	double tempTarget;

	// variables for business logic
	public static final double MIN_TEMP = -10;
	public static final double MAX_TEMP = 30;
	public static final double MIN_TARGET = 5;
	public static final double MAX_TARGET = 26;

	/**
	 * default constructor
	 */
	public Radiator() {

	}

	/**
	 * arg based constructor
	 * 
	 * @param name
	 * @param manufacturer
	 * @param room
	 * @param powerstate
	 */
	public Radiator(String name, String manufacturer, Room room, Powerstate powerstate, double tempNow,
			double tempTarget) {
		super(name, manufacturer, room, powerstate);
		this.setTempNow(tempNow);
		this.setTempTarget(tempTarget);

	}

	/**
	 * Getter for tempNow
	 * 
	 * @return the tempNow
	 */
	public double getTempNow() {
		return tempNow;
	}

	/**
	 * Setter for temp Now
	 * 
	 * @param tempNow
	 * @throws IllegalArgumentException if temperature entered is outside allowable
	 *                                  boundaries of MIN_TEMP = -10 degC and
	 *                                  MAX_TEMP = 30 degC When setting, helper
	 *                                  method check target should compare tempNow
	 *                                  to target and adjust powerstate accordingly
	 */
	public void setTempNow(double tempNow) throws IllegalArgumentException {
		if (tempNow < MIN_TEMP || tempNow > MAX_TEMP) {
			throw new IllegalArgumentException("Temperature outside valid boundary");
		} else {
			checkTarget(tempNow);
			this.tempNow = tempNow;
		}
	}

	/**
	 * Helper function to check tempNow against tempTarget and alter powerstate if
	 * required **Need to check the logic makes sense - works for testing but I
	 * thought it should be other way around As in If temp Now is less than the
	 * target temperature of the radiator it should turn powerstate ON or If temp
	 * Now is greater than the target temperature of the radiator, it should turn
	 * powerstate OFF But the conditions below work for test cases written. I would
	 * have this checked for more test cases to ensure the logic holds true
	 * 
	 * @param tempNow
	 */
	private void checkTarget(double tempNow) {
		if (tempNow > this.tempTarget) { //post exam - this should prob be getter for temp target
			this.powerstate = Powerstate.ON;
		}
		if (tempNow < this.tempTarget) {
			this.powerstate = Powerstate.OFF;
		}
	}

	/**
	 * Getter for temp target
	 * 
	 * @return the tempTarget
	 */
	public double getTempTarget() {
		return tempTarget;
	}

	/**
	 * Setter for temp target
	 * 
	 * @param tempTarget
	 * @throws IllegalArgumentException if temp target is set outside MIN_TARGET = 5
	 *                                  and MAX_TARGET = 26
	 */
	public void setTempTarget(double tempTarget) throws IllegalArgumentException {
		if (tempTarget < MIN_TARGET || tempTarget > MAX_TARGET) {
			throw new IllegalArgumentException("Target temperature outside valid boundary");
		} else {
			this.tempTarget = tempTarget;
		}
	}

	/**
	 * abstract inherited method Should return string of following
	 * format:SR-NAME-ROOM-NOW:X.X-TARGET:X.X-POWERSTATE Eg.
	 * SR-RADIATORSTAT-BEDROOM-NOW:18.7-TARGET:21.5-ON If I had more time I would
	 * break this down into helper functions to make it cleaner Need to format the
	 * doubles to 1 d.p - Probably need to use Math class or equivalent to round
	 * decimals
	 */
	@Override
	public String status() {
		String room = this.getRoom().toString().toUpperCase();
		String text = "SR-" + this.getClass().getSimpleName().toUpperCase() + "-" + room + "-NOW:" + this.getTempNow()
				+ "-TARGET:" + this.getTempTarget() + "-" + this.getPowerstate();
		System.out.println(text);
		return text;
	}

	/**
	 * showAll method prints to console the name, manufacturer, room and powerstate,
	 * temp now and temp target of radiator
	 */
	@Override
	public void showAll() {
		super.showAll();
		System.out.println("TEMP NOW     :" + this.getTempNow() + " Degrees");
		System.out.println("TEMP TARGET  :" + this.getTempTarget() + " Degrees");
	}

}
