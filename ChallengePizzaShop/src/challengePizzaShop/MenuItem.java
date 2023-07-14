package challengePizzaShop;

public class MenuItem implements IDetail {

	
	//instance vars
	private String name;
	private double price;
	
	//default constructor
	public MenuItem() {
	}
	
	//constructor with args
	public MenuItem(String name, double price) {
		this.setName(name);
		this.setPrice(price);
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 * @throws IllegalArgumentException
	 */
	public void setName (String name) throws IllegalArgumentException {
		if (name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be an empty string");
		}
		
		if(name.startsWith(" ")){
			throw new IllegalArgumentException("Name cannot start with a space");
		}
		//need some logic to test for only letters and 0-9
		String validChars = "abcdefghijklmnopqrstuvwxyz0123456789 ";
		String lower = name.toLowerCase();
		for (int i=0; i<name.length(); i++) {
			if (validChars.indexOf(lower.charAt(i)) == -1) {
				throw new IllegalArgumentException("Name contains invalid characters");
			}
		}
		
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		if (price>0.00) {
			this.price = price;
		} else {
			this.price = 0.00;
		}
		
	}

	public void printDetails() {
		 System.out.printf("Name: %s%n",this.getName());
		 System.out.printf("Price: £%.2f%n%n",this.getPrice());
		
	}
	
	
	
}
