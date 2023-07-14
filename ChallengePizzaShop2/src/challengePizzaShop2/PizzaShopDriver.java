package challengePizzaShop2;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PizzaShopDriver {

	public static void main(String[] args) {
//		MenuItem m1 = new MenuItem("Burger", 4.20);
//		MenuItem m2 = new MenuItem("Chips", 2.20);
//		MenuItem m3 = new MenuItem("Coke", 1.10);
//		MenuItem m4 = new MenuItem("HotDog", 2.50);
//		MenuItem m5 = new Pizza(9);
//		Pizza p5 = (Pizza) m5;
//		MenuItem m6 = new Pizza(18);
//		Pizza p6 = (Pizza) m6;
//		MenuItem m7 = new Pizza(6);
//		Pizza p7 = (Pizza) m7;
//		Pizza p8 = new Pizza(10);
//
//		p5.addTopping(Topping.MUSHROOMS);
//		p5.addTopping(Topping.EXTRACHEESE);
//
//		p8.addTopping(Topping.CHICKEN);
//		p8.addTopping(Topping.BEEF);
//		p8.addTopping(Topping.HAM);
//
//		ArrayList<MenuItem> list = new ArrayList<MenuItem>();
//		list.add(m1);
//		list.add(m5);
//		list.add(m6);
//		list.add(m7);
//		list.add(p8);

		// printReceipt(list);
		//findVeggies(list);
		
		ArrayList<MenuItem> order = readOrder("OrderList-3-Full (1).csv");
		printReceipt(order);
		
		ArrayList<MenuItem> order2 = readOrder("OrderList-2-PizzasOnly (1).csv");
		printReceipt(order2);
		
		ArrayList<MenuItem> order3 = readOrder("OrderList-1-BasicOnly (1).csv");
		printReceipt(order3);

	}

	public static void printReceipt(List<MenuItem> list) {
		System.out.println("---------------");
		System.out.println("ORDER DETAILS");
		System.out.println("---------------");
		double total = 0;
		for (MenuItem m : list) {
			m.printDetails();
			total += m.getPrice();
		}
		System.out.println("---------------");
		System.out.printf("TOTAL COSTS: %.2f%n", total);
		System.out.println("---------------");
	}

	public static void findVeggies(ArrayList<MenuItem> list) {
		// count veggies
		int veggieCount = 0;

		for (MenuItem m : list) {
			// check if pizza object
			if (m.getClass() == Pizza.class) {
				// cast to Pizza
				Pizza p = (Pizza) m;
				// if veggie do something
				if (p.isVeggie()) {
					veggieCount += 1;
					System.out.printf("Veg count: %d%n", veggieCount);
					p.printDetails();
					System.out.println();
				}
			}
		}
	}

	public static ArrayList<MenuItem> readOrder(String filename) {
		// store objects read in
		ArrayList<MenuItem> toReturn = new ArrayList<MenuItem>();

		// read in file
		String line = "";
		File f = new File(filename);

		try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr);) {

			// dump header
			line = br.readLine();
			line = br.readLine();

			while (line != null) {
				String[] extract = line.split(",");

				String name = extract[0];
				double price = Double.parseDouble(extract[1]);

				// check if MenuItem or Pizza to determine Constructor
				if (name.equalsIgnoreCase("pizza")) {
					// create Pizza
					int size = (int) price;
					MenuItem m = new Pizza(size);
					// cast to Pizza to use Pizza methods
					Pizza p = (Pizza) m;

					ArrayList<Topping> toAdd = checkForToppings(extract);
					addToppings(toAdd, p);

					toReturn.add(p);
				} else {
					// create MenuItem
					MenuItem m = new MenuItem(name, price);
					toReturn.add(m);
				}

				line = br.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return toReturn;

	}

	private static void addToppings(ArrayList<Topping> toAdd, Pizza p) {
		for (Topping t: toAdd) {
			p.addTopping(t);
		}
		
	}

	private static ArrayList<Topping> checkForToppings(String[] extract) {
		ArrayList<Topping> topList = new ArrayList<Topping>();
		for (int i = 2; i < extract.length; i++) {
			// check match to enum list
			String toCheck = extract[i].toUpperCase();
			for (Topping t : Topping.values()) {
				if (t.toString().equalsIgnoreCase(toCheck)) {
					topList.add(t);
				}
			}
		}
		return topList;
	}

}
