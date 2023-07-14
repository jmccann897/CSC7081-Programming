package lecture24_02Mar2023;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemo1 {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Matthew");
		arrList.add("Alyssa");
		arrList.add("Rory");
		arrList.add("Gerard");

		System.out.println(arrList);

		// showing in-built methods for collection
		if (arrList.contains("Gerard")) {
			System.out.println("Yep there");
		} else {
			System.out.println("Not there");
		}

		// creating second list with first list
		ArrayList<String> myList2 = new ArrayList<>();
		myList2.add("Alyssa");
		myList2.add("Rory");

		System.out.println(myList2);

		// checking use of retainAll Method
		arrList.retainAll(myList2);

		System.out.println(arrList);

		// generating string array from list of string objects
		String[] namesArr = arrList.toArray(new String[0]);

		// creating third list for linked list example
		LinkedList<String> linkList = new LinkedList<>();
		linkList.add("William");
		linkList.add("Jarlath");

		//can use method that expects a list for both list types
		showAll(arrList);
		showAll(linkList);

	}

	/**
	 * Display each element in inputList on a separate line
	 * 
	 * @param inputList
	 */
	public static void showAll(List<String> inputList) {
		for (String value : inputList) {
			System.out.println(value);
		}
	}
}
