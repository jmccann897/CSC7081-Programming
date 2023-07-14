package challengePizzaShop;

import java.util.ArrayList;

public class Pizza extends MenuItem {

	// instance vars
	private int size;
	private ArrayList<Topping> extraToppings;

	// default constructor
	public Pizza() {
	}

	/**
	 * @param size
	 */
	public Pizza(int size) {
		super.setName("Pizza");
		this.setSize(size);
		this.extraToppings = new ArrayList<Topping>();
	}

	public int getSize() {
		return size;
	}

	/**
	 * 
	 * @param size
	 */
	public void setSize(int size) {
		// maybe do a switch statement here?
		if (size < 8) {
			size = 8;
		}
		if (size > 16) {
			size = 16;
		}
		this.size = size;
		
		//updating price to match size + toppings
		if(this.extraToppings == null) {
			this.setPrice(size);
		}
	}
	
	public ArrayList<Topping> getTopping() {
		return extraToppings;
	}

	public void setTopping(ArrayList<Topping> topping) {
		// how to check if each item is unique?
		if (topping.isEmpty()) {

		}
		this.extraToppings = topping;
	}

	public void addTopping(Topping toAdd) {
		if (this.extraToppings.contains(toAdd)) {
			System.out.println("Topping already on pizza, skipping");
		} else {
			this.extraToppings.add(toAdd);
			this.setPrice(size + (0.50*this.extraToppings.size()));
		}
	}

	private void pizzaDetail() {
		// checking if topping list is 0 ie plain
		if (this.extraToppings.size() == 0) {
			System.out.println("Plain pizza");
		} else {
			System.out.printf("Custom Pizza		(%d) £%.2f %n",this.getSize() , this.getPrice());
			System.out.println("with toppings:");
			printToppings();
		}
	}

	private void printToppings() {
		for (Topping t : this.extraToppings) {
			System.out.println("* " + t.toString());
		}

	}

	public void printDetails() {
		super.printDetails();
		pizzaDetail();
		System.out.println();

	}

	public boolean isVegetarian(ArrayList<Topping> toppings) {
		boolean flagForVeg = true; // should be false if meat topping found
		for (Topping t : toppings) {
			if (t.equals(Topping.BEEF) || t.equals(Topping.CHICKEN) || t.equals(Topping.HAM)
					|| t.equals(Topping.PEPPERONI)) {
				flagForVeg = false;
			}
		}
		return flagForVeg;

	}

}
