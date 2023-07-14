package p3;

import java.util.Objects;

/**
 * @author - McCannJoshua 40059274
 */
public class Accommodation {

	// instance vars
	private String name;
	private Type type;
	private int stars;
	private String city;
	private double price;
	private int rooms;

	/**
	 * Constructor with Arguments
	 * @param name
	 * @param type
	 * @param stars
	 * @param city
	 * @param price
	 * @param rooms
	 */
	public Accommodation(String name, Type type, int stars, String city, double price, int rooms) {
		this.setName(name);
		this.setType(type);
		this.setStars(stars);
		this.setCity(city);
		this.setPrice(price);
		this.setRooms(rooms);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for name which must be Non empty String, at least 1 char
	 * @param name
	 * @throws IllegalArgumentException
	 */
	public void setName(String name) throws IllegalArgumentException {
		if (name.length() >= 1) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("Invalid name");
		}
	}

	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * Enum type which can be set to null but I didn't have time to validate it 
	 * against being set to null
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * @return the stars
	 */
	public int getStars() {
		return stars;
	}

	/**
	 * Setter for stars which must be Whole numbers 1 to 5 inclusive
	 * @param stars
	 * @throws IllegalArgumentException
	 */
	public void setStars(int stars) throws IllegalArgumentException {
		if (stars >= 1 && stars <= 5) {
			this.stars = stars;
		} else {
			throw new IllegalArgumentException("Invalid stars entered");
		}

	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Setter for city
	 * Must be Non empty String, at least 1 char
	 * @param city
	 * @throws IllegalArgumentException
	 */
	public void setCity(String city) throws IllegalArgumentException {
		if (city.length() >= 1) {
			this.city = city;
		} else {
			throw new IllegalArgumentException("Invalid city");
		}
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Setter for price - Must be Non negative number
	 * @param price
	 * @throws IllegalArgumentException
	 */
	public void setPrice(double price) throws IllegalArgumentException {
		if(price>=0) {
			this.price = price;
		}else {
			throw new IllegalArgumentException("Invalid price");
		}
		
	}

	/**
	 * @return the rooms
	 */
	public int getRooms() {
		return rooms;
	}

	/**
	 * Setter for rooms - Must be Non negative whole number
	 * @param rooms
	 * @throws IllegalArgumentException
	 */
	public void setRooms(int rooms) throws IllegalArgumentException{
		if(rooms>=0) {
			this.rooms = rooms;
		}else {
			throw new IllegalArgumentException("Invalid rooms");
		}
	}
	
	/**
	 * Print details method for accommodation objects
	 */
	public void printDetails() {
		System.out.printf("Name:      %s%n", this.getName());
		System.out.printf("City:      %s%n", this.getCity());
		System.out.printf("Type:      %s%n", this.getType());
		System.out.printf("Capacity:  %d Rooms @ £%.2f %n", this.getRooms(), this.getPrice());
		String starRep = "*".repeat(this.getStars());
		System.out.printf("Rating:    %s%n", starRep);
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(city, name, price, rooms, stars, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Accommodation other = (Accommodation) obj;
		return Objects.equals(city, other.city) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && rooms == other.rooms
				&& stars == other.stars && type == other.type;
	}

	
	
}
