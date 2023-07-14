package lecture24_02Mar2023;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExcercise {

	public static void main(String[] args) {
		ArrayList<Integer> arList = new ArrayList<Integer>();
		arList.add(5);
		arList.add(52);
		arList.add(65);
		arList.add(21);
		arList.add(99);
		arList.add(5);
		arList.add(5);
		arList.add(65);
		arList.add(99);

		LinkedList<Integer> linkList = new LinkedList<Integer>();
		linkList.add(21);
		linkList.add(99);
		linkList.add(5);
		linkList.add(80);

		//System.out.println("Pre-modification " + arList);
		//System.out.println("To remove " + linkList);
		//removeMatches(arList, linkList);
		//System.out.println("Post-modification using removeMatches " + arList);
		//removeMatchesImproved(arList, linkList);
		//System.out.println("Post-modification using removeMatchesImproved " + arList);
		
		System.out.println("Pre-modification			 " + arList);
		removeDuplicates(arList);
		System.out.println("Post-modification using removeDuplicates " + arList);
		
		System.out.println("end");
	}

	/**
	 * Remove elements in toRemove list from toModify list toModify list will be
	 * changed as a result of calling this method
	 * 
	 * @param toModify
	 * @param toRemove
	 */
	public static void removeMatches(List<Integer> toModify, List<Integer> toRemove) {
		for (Integer value : toRemove) {
			// System.out.println("Removing "+value);
			boolean success = toModify.remove(value);
			// System.out.println("Successful? "+success);
		}
	}

	/**
	 * Improving on previous method to handle multiple occurrences of same value
	 * 
	 * @param toModify
	 * @param toRemove
	 */
	public static void removeMatchesImproved(List<Integer> toModify, List<Integer> toRemove) {
		toModify.removeAll(toRemove);
	}
	
	/**
	 * modifies inputList to remove any elements which occur more than once
	 * @param inputList
	 */
	public static void removeDuplicates(List<Integer> inputList) {
		List<Integer> unique = new ArrayList<Integer>();
		for (Integer val:inputList) {
			if(!unique.contains(val)) {
				unique.add(val);
			}
		}
		//need to modify original inputList
		inputList.clear();
		inputList.addAll(unique);

		//have a list of all unique elements in inputList
	}
}
