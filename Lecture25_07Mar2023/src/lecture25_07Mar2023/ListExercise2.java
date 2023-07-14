package lecture25_07Mar2023;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExercise2 {

	public static void main(String[] args) {
		List<String> words = new LinkedList<String>();
		words.add("I");
		words.add("dream");
		words.add("have");
		words.add("a");
		
		//System.out.println(words);
		
		//using public method
		//swap(words, 1, 2);
		//swap(words, 2, 3);
		
		//showing Collections works on other list of different types
		List<Integer> nums = new LinkedList<Integer>();
		nums.add(5);
		nums.add(15);
		nums.add(25);
		nums.add(35);
	
		//System.out.println(nums);
		
		//using Collections in-built method
		Collections.swap(words, 1, 2);
		Collections.swap(words, 2, 3);
		
		Collections.swap(nums, 1, 2);
		Collections.swap(nums, 2, 3);
				
		//showing the add all collections method
		String[] addition = new String[] {"more", "words", "at", "the", "end"};
		Collections.addAll(words, addition);
		
		//can do same as Collections.addall through list method but Collections is preferred
		//words.addAll(Arrays.asList(addition));
		
		//after swap
		System.out.println(words);
		//System.out.println(nums);
		
		//System.out.println(Collections.min(words));
		//System.out.println(Collections.max(nums));
		
		//combining list and Collections methods in one statement
		//System.out.println(nums.indexOf(Collections.min(nums)));
		
		
	}

	public static void swap(List<String> list, int pos1, int pos2) {
		//validation
		//check that list is not null and size >1
		//check pos1 and pos2 are not out of bounds
		//check pos1!=pos2
		if (pos1==pos2) {
			return; //using return to exit void method early
		}
		
		String temp  =list.get(pos1);
		list.set(pos1, list.get(pos2));
		list.set(pos2, temp);
	}
}
