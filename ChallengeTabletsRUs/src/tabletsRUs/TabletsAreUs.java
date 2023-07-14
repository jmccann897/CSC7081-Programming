package tabletsRUs;

import java.util.ArrayList;

public class TabletsAreUs {

	public static void main(String[] args) {
 
		// simulating a few tablets
		Tablet t1 = new Tablet(Manufacturer.APPLE, "iPad", 338.94, false, 10.2,
				"10.2 inch Retina display A10 Fusion chip Up to 10 hours of battery life");
		Tablet t2 = new Tablet(Manufacturer.APPLE, "iPad Air", 449.00, false, 10.5,
				"10.5 inch 10.5-inch Retina display with ProMotion, True Tone and wide colour, Up to 20 hours of battery life ");
		Tablet t3 = new Tablet(Manufacturer.GOOGLE, "Fire", 79.99, true, 8, "8 inch display 10 hours of battery life");
		Tablet t4 = new Tablet(Manufacturer.SAMSUNG, "Galazy Tab", 180.00, true, 10.1,
				"10.1 inch  Entertainment for All: Designed with the whole family in mind, the Galaxy Tab A has what it takes to keep everyone happy. 5 hours battery.  ");
		Tablet t5 = new Tablet(Manufacturer.VANKYO, "MatrixPad", 69.99, true, 7,
				"7-inch display Full-Featured Android Tablet with Eye Care for Kids Up to 4 hours of battery life");

		// adding to an arraylist
		ArrayList<Tablet> listOfTablets = new ArrayList<Tablet>();
		listOfTablets.add(t1);
		listOfTablets.add(t2);
		listOfTablets.add(t3);
		listOfTablets.add(t4);
		listOfTablets.add(t5);
					
		// show all in stock
		TabletSearchMethods.showStock(listOfTablets);

		// exercising a few searches

		// 1. all screen sizes > 10 inches in size
		TabletSearchMethods.screenAbove10(listOfTablets);

		// 2. all Apple products (over priced!)
		TabletSearchMethods.searchByApple(listOfTablets);
		
		// 3. all Android tablets
		TabletSearchMethods.searchByAndroid(listOfTablets);
		
		// 4. note search .. e.g. by key word search (note this is case sensitive)
		TabletSearchMethods.searchByKeyword(listOfTablets, "Eye");
	}
}
