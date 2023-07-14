package challengePizzaShop2;

import java.util.ArrayList;

public class Pizza extends MenuItem {

	//instance vars
	private int size;
	private ArrayList<Topping> ExtraToppings;
	
	//constructor with Args
	public Pizza(int size) {
		this.setName("Pizza");
		//int checkedSize = (int) validateSize(size);
		
		this.setSize(size);
		
		//create empty extraTopping list to store potential toppings
		this.ExtraToppings = new ArrayList<Topping>();
		
		//alter price according to size
		double initialPrice = validateSize(size);
		this.setPrice(initialPrice);
		
		
	}

	
	private double validateSize(int size) {
		if(size>=8 && size<=16) {
			this.size = size;
		}
		if(size<8) {
			size=8;
		}
		if(size>16) {
			size=16;
		}
		return size;
	}


	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}


	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		if(size>=8 && size<=16) {
			this.size = size;
		}
		if(size<8) {
			size=8;
			setSize(size);
		}
		if(size>16) {
			size=16;
			setSize(size);
		}
	}


	/**
	 * @return the extraToppings
	 */
	public ArrayList<Topping> getExtraToppings() {
		return ExtraToppings;
	}


	/**
	 * @param extraToppings the extraToppings to set
	 */
	public void setExtraToppings(ArrayList<Topping> extraToppings) {
		ExtraToppings = extraToppings;
	}
	
	/**
	 * method to add topping to object arraylist of toppings
	 * @param topping
	 */
	public void addTopping(Topping topping) {
		if (checkIfDuplicate(topping, ExtraToppings)) {
			//if true skip
			System.out.println("Already added, skipping this item");
		}else {//add item
			this.ExtraToppings.add(topping);
			this.setPrice(this.getPrice()+0.5);//update price per item
		}
		
	}


	private boolean checkIfDuplicate(Topping topping, ArrayList<Topping> extraToppings) {
		// if already present, skip and print to screen it has been skipped
		if(extraToppings.contains(topping)) {
			return true;
		}else {
			return false;
		}
	}


	@Override
	public void printDetails() {
		pizzaDetail();
	}


	private void pizzaDetail() {
		//check if plain or custom
		if(ExtraToppings.isEmpty()) {
			printPlainPizza();
		}else {
			printCustomPizza();
		}
		
	}


	private void printCustomPizza() {
		System.out.printf("Custom Pizza         (%d) £%5.2f%n", this.getSize(), this.getPrice());
		
		System.out.printf("  With toppings: %n");
		for (Topping t: this.ExtraToppings ) {
			System.out.printf("* %s %n",t);
		}
		
	}


	private void printPlainPizza() {
		System.out.printf("Plain Pizza          (%d) £%5.2f%n", this.getSize(), this.getPrice());
	}
	
	public boolean isVeggie() {
		boolean veggie = true; //flag
		
		for(Topping t: this.ExtraToppings) {
			if (t.equals(Topping.BEEF) || t.equals(Topping.CHICKEN) || t.equals(Topping.HAM)
					|| t.equals(Topping.PEPPERONI)) {
				//Contains meat
				veggie = false;
			}
		}
		return veggie;
		
		
	}

}
