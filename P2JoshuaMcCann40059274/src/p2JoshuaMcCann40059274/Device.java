package p2JoshuaMcCann40059274;

/**
 * Device object class Abstract as I don't think there would be a need for
 * generic device objects
 * 
 * @author Josh McCann 40059274
 *
 */
public abstract class Device {

	// instance vars
	String name;
	String manufacturer;
	Room room;
	Powerstate powerstate;

	// variables for business logic
	public static final int nameMin = 3;
	public static final int nameMax = 20;
	public static final int manufacturerMin = 3;
	public static final int manufacturerMax = 20;

	/**
	 * Default constructor
	 */
	public Device() {

	}

	/**
	 * Arg based constructor
	 * 
	 * @param name         - must be >3 and <20 chars
	 * @param manufacturer - must be >3 and <20 chars
	 * @param room
	 * @param powerstate
	 */
	public Device(String name, String manufacturer, Room room, Powerstate powerstate) {
		this.setName(name);
		this.setManufacturer(manufacturer);
		this.room = room;
		this.powerstate = powerstate;

	}

	/**
	 * Getter for name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for name
	 * 
	 * @param name
	 * @throws IllegalArgumentException if length less than nameMin -3 and length
	 *                                  longer than nameMax -20
	 */
	public void setName(String name) throws IllegalArgumentException {
		if (name.length() < nameMin || name.length() > nameMax) {
			throw new IllegalArgumentException();
		} else {
			this.name = name;
		}
	}

	/**
	 * Getter for manufactuer
	 * 
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * Setter for manufacturer
	 * 
	 * @param manufacturer
	 * @throws IllegalArgumentException if length less than manufacturerMin - 3 and
	 *                                  length longer than manufactuerMax -20
	 */
	public void setManufacturer(String manufacturer) throws IllegalArgumentException {
		if (manufacturer.length() < manufacturerMin || manufacturer.length() > manufacturerMax) {
			throw new IllegalArgumentException();
		} else {
			this.manufacturer = manufacturer;
		}
	}

	/**
	 * Getter for Room enum
	 * 
	 * @return the room
	 */
	public Room getRoom() {
		return room;
	}

	/**
	 * Setter for Room enum
	 * 
	 * @param room the room to set
	 */
	public void setRoom(Room room) {
		this.room = room;
	}

	/**
	 * Getter for powerstate enum
	 * 
	 * @return the powerstate
	 */
	public Powerstate getPowerstate() {
		return powerstate;
	}

	/**
	 * Setter for powerstate enum
	 * 
	 * @param powerstate the powerstate to set
	 */
	public void setPowerstate(Powerstate powerstate) {
		this.powerstate = powerstate;
	}

	/**
	 * showAll method prints to console the name, manufacturer, room and powerstate
	 * of device
	 */
	public void showAll() {
		System.out.println("NAME         :" + this.getName());
		System.out.println("MANUFACTURER :" + this.getManufacturer());
		System.out.println("ROOM         :" + this.getRoom());
		System.out.println("POWERSTATE   :" + this.getPowerstate());

	}

	/**
	 * Abstract method with child specific implementation requirements
	 * 
	 * @return
	 */
	public abstract String status();

}
