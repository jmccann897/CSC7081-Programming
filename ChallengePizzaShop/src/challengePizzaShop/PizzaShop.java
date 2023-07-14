package challengePizzaShop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PizzaShop {

	public static void main(String[] args) {

//		ArrayList<Topping> t2 = new ArrayList<Topping>();
//		ArrayList<Topping> t3 = new ArrayList<Topping>();
//
//		t2.add(Topping.BEEF);
//
//		t3.add(Topping.EXTRACHEESE);
//		t3.add(Topping.ONIONS);
//		t3.add(Topping.PEPPERS);
//
//		Pizza p1 = new Pizza(9);
//		Pizza p2 = new Pizza(12);
//
//		for (Topping t : t2) {
//			p2.addTopping(t);
//		}
//
//		Pizza p3 = new Pizza(17);
//
//		for (Topping t : t3) {
//			p3.addTopping(t);
//		}

//		p1.printDetails();
//		p2.printDetails();
//		p3.printDetails();

//		ArrayList<MenuItem> items = new ArrayList<MenuItem>();
//		items.add(p1);
//		items.add(p2);
//		items.add(p3);

		// printReceipt(items);
		// findVeggies(items);

		ArrayList<MenuItem> orderList1 = new ArrayList<MenuItem>();

		orderList1 = readCSVOrder("OrderList-3-Full.csv");
		printReceipt(orderList1);
		
		
		}
	

	public static void printReceipt(ArrayList<MenuItem> items) {
		System.out.println("--------------");
		System.out.println("ORDER DETAILS");
		System.out.println("--------------");
		System.out.println();

		double totalCost = 0;

		for (MenuItem i : items) {
			totalCost += i.getPrice();
			i.printDetails();
		}

		System.out.println("--------------");
		System.out.printf("Total Cost = £ %.2f %n", totalCost);
		System.out.println("--------------");
		System.out.println();

	}

	public static void findVeggies(ArrayList<MenuItem> items) {
		ArrayList<Pizza> pizzasInOrder = new ArrayList<Pizza>();
		int vegPizzaCount = 0;
		for (MenuItem m : items) {
			if (m.getClass() == (Pizza.class)) {
				pizzasInOrder.add((Pizza) m);
			}
		}
		for (Pizza p : pizzasInOrder) {
			if (p.isVegetarian(p.getTopping())) {
				vegPizzaCount += 1;
				p.printDetails();
			}
		}
		System.out.printf("There are %d vegetarian pizzas in the order %n", vegPizzaCount);

	}

	/**
	 * 34mins into vid 2
	 * @param fileName
	 * @return
	 */
	public static ArrayList<MenuItem> readCSVOrder(String fileName) {

		ArrayList<MenuItem> toReturn = new ArrayList<MenuItem>();

		// line to read
		String line;

		// read file

		try {
			// create File object
			File file = new File(fileName);
			// create filereader
			FileReader fr;
			fr = new FileReader(file);
			// create buffered reader
			BufferedReader br = new BufferedReader(fr);

			// read contents
			line = br.readLine(); // dump first line as headers
			line = br.readLine();

			while (line != null) {
				// System.out.println(line);
				// split on ","
				String[] extract = line.split(",");

				// identify item on first string[0] with .equals
				String name = extract[0];
				// identify item price with String[1] and convert to double
				double price = Double.parseDouble(extract[1]);

				// creating menu item - allowing for pizzas if name=Pizza
				if (name.equalsIgnoreCase("pizza")) {
					MenuItem item = new Pizza((int) price);
					if (item instanceof Pizza) {
						Pizza p = ((Pizza) item);
						//check for extra toppings
						ArrayList<Topping> ToppingsToAdd = extraToppingCheck(extract);
						for (Topping t: ToppingsToAdd) {
							p.addTopping(t);
						}
						
					}	
					// adding to list to return
					toReturn.add(item);
				} else {
					MenuItem item = new MenuItem(name, price);
					// adding to list to return
					toReturn.add(item);
				}

				// move to next line
				line = br.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return toReturn;

	}

	private static ArrayList<Topping> extraToppingCheck(String[] extract) {
		// checking for extra toppings
		// create topping to return
		ArrayList<Topping> ListToAdd = new ArrayList<Topping>();
		if (extract.length > 1) {
			for (int i = 2; i < extract.length; i++) {
				
				// check if not empty and do something
				if (!extract[i].equals("")) {
					String toCheck = extract[i];
					// add the topping if an approved enum topping
					Topping toAdd = (checkAgainstToppings(toCheck));
					ListToAdd.add(toAdd);
				}else {
					break;
				}
				
			}
			
		}
		return ListToAdd;
		
	}


	private static Topping checkAgainstToppings(String toCheck) {
		return Enum.valueOf(Topping.class, toCheck);

	}

}
