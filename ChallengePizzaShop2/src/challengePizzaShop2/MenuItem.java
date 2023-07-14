package challengePizzaShop2;

public class MenuItem implements IDetail {

	// instance vars
	private String name;
	private double price;

	public MenuItem() {

	}

	/**
	 * @param name
	 * @param price
	 */
	public MenuItem(String name, double price) {
		super();
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
	 * @param name the name to set
	 */
	public void setName(String name) {
		if (name.startsWith(" ")) {
			throw new IllegalArgumentException("Name can't start with a space");
		}
		if (name.isEmpty()) {
			throw new IllegalArgumentException("Name can't be an empty string");
		}
		String validChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789 ";
		boolean valid = true;

		for (int i = 0; i < name.length(); i++) {
			String s = name.substring(i, i + 1);
			if (validChars.contains(s)) {
				valid = true;
			} else {
				throw new IllegalArgumentException("Name must contain letters and numbers only");
			}

		}
		if (valid) {
			this.name = name;
		}

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
		if (price < 0) {
			this.price = 0;
		} else {
			this.price = price;
		}
	}

	@Override
	public void printDetails() {
		System.out.printf("%-15s            £%.2f%n", name, price);

	}

}
