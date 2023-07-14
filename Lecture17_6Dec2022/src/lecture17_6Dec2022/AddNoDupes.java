package lecture17_6Dec2022;

import java.util.ArrayList;

public class AddNoDupes {

	public static void main(String[] args) {
		ArrayList<String> listA = new ArrayList<>();
		listA.add("one");
		listA.add("two");
		listA.add("seven");

		ArrayList<String> listB = new ArrayList<>();
		listB.add("nine");
		listB.add("two");
		listB.add("eight");
		listB.add("seven");

		System.out.println("A before " + listA);

		for (String x : listB) {
			if (!listA.contains(x)) {
				listA.add(x);
			}
		}
		System.out.println("A after " + listA);
		
		printOnSepLines(listA);
	}
	//passing in ArrayList as parameter and Arguments
	public static void printOnSepLines (ArrayList<String> list) {
		for (String x: list) {
			System.out.println(x);
		}
	}
	
}


