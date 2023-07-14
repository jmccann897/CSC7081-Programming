package tabletsRUs;

import java.util.ArrayList;

public class TabletSearchMethods {

	public static ArrayList<Tablet> searchByKeyword(ArrayList<Tablet> list, String keyword) {
		ArrayList<Tablet> results = new ArrayList<Tablet>();
		for(Tablet t: list) {
			if(t.getNotes().contains(keyword)) {
				t.allDetails();
				results.add(t);
			}
		}
		return results;
		
	}

	public static void searchByAndroid(ArrayList<Tablet> listOfTablets) {
		for (Tablet t : listOfTablets) {
			if (t.isAndroid()) {
				t.allDetails();
			}
		}
	}

	public static void searchByApple(ArrayList<Tablet> list) {
		for (Tablet t : list) {
			if (t.getManufacturer() == Manufacturer.APPLE) {
				t.allDetails();
			}
		}

	}

	public static void screenAbove10(ArrayList<Tablet> list) {
		for (Tablet t : list) {
			if (t.getSize() > 10) {
				t.allDetails();
			}
		}
	}

	public static void showStock(ArrayList<Tablet> listOfTablets) {
		for (Tablet t : listOfTablets) {
			t.allDetails();
		}
	}

}
