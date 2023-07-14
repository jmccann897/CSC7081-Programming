package lecture28_16Mar2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MergeSortExample {

	public static void main(String[] args) {


		Integer[] numbers = new Integer[] {4,8,23,1,55,3,55,-34,100,3,22};
		
		List<Integer> toSort = new LinkedList<Integer>(Arrays.asList(numbers));
		
		System.out.println("Before");
		System.out.println(toSort);
		//How we would normally sort
		//Collections.sort(toSort);
		
		//creating method to practice recursion
		List<Integer> sorted = mergeSort(toSort);
		
		System.out.println("After");
		System.out.println(sorted);
		

	}

	private static List<Integer> mergeSort(List<Integer> toSort) {
		
		//base case
		if(toSort.size()<=1) {
			//already sorted
			return toSort;
		}
		
		//split the list in 2
		List<Integer> list1 = toSort.subList(0, toSort.size()/2); //first index to middle-1
		List<Integer> list2 = toSort.subList(toSort.size()/2, toSort.size()); //middle index to last
		
		//sort the 2 lists
		list1 = mergeSort(list1);
		list2 = mergeSort(list2);
		
		//merge the 2 sorted lists
		List<Integer> result = merge(list1, list2);
		
		return result;
	}

	/**
	 * Takes two sorted lists and combines them into a single sorted list
	 * @param list1
	 * @param list2
	 * @return combined sorted list
	 */
	private static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
		int capacity = list1.size() + list2.size();
		List<Integer> combined = new ArrayList<Integer>(capacity);
		
		Queue<Integer> q1 = new LinkedList<Integer>(list1);
		Queue<Integer> q2 = new LinkedList<Integer>(list2);
		
		while(q1.size()>0 && q2.size()>0) {
			//checking first value in each queue, smallest goes into combined
			if(q1.peek()<q2.peek()) {
				//q1 head is smaller
				combined.add(q1.poll());
			}else {
				combined.add(q2.poll());
			}
		}
		
		//at least one queue is empty but potentially still values in other queue
		combined.addAll(q1);
		combined.addAll(q2);
		
		return combined;
	}

}
