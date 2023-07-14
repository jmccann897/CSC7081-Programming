package lecture17_6Dec2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {


		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Banana");
		myList.add("Apple");
		myList.add("Orange");
		myList.add("Banana");
		myList.add(2, "Lemon"); //adds in object and bumps up rest
		myList.set(1, "Peach"); //overwrites index with new object
		
		System.out.println(myList);
//		
//		//standard for loop
//		for(int i=0; i<myList.size(); i++) {
//			//do something
//			System.out.println(myList.get(i));
//		}
//		
//		//for each loop
//		for(String x:myList) {
//			System.out.println(x);
//		}
//		
//		//iterator + while
//		Iterator<String> it = myList.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		//.contains search method
		System.out.println(myList.contains("Pear"));
		System.out.println(myList.contains("Orange"));
		//.indexOf search method
		System.out.println(myList.indexOf("Orange"));
		System.out.println(myList.indexOf("Banana"));
		System.out.println(myList.indexOf("Pear"));
		System.out.println(myList.lastIndexOf("Banana"));
		
		
		//sorting methods - in built collection method works for String and wrappers 
		// ie (objects that can be sorted)
		Collections.sort(myList);
		System.out.println(myList);
		
	}

}
