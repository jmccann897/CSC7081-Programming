package lecture26_09Mar2023;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		String[] colours = new String[] { "red", "blue", "red", "green", "red", "green", "yellow" };

		List<String> theList = new LinkedList<String>(Arrays.asList(colours));

		System.out.println(theList);

		printNonDupe(theList);

	}

	private static void printNonDupe(List<String> inputList) {

		Set<String> mySet = new TreeSet<String>();

		for (String value : inputList) {
			mySet.add(value);
		}

		System.out.println(mySet);

	}
}
