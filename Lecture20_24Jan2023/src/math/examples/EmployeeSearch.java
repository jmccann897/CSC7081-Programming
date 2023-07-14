package math.examples;

import java.util.ArrayList;

public class EmployeeSearch {

		/**
		 * Search input List for all employees at or below age
		 * @param inputList
		 * @param age
		 * @return list of matching values
		 * @throws IllegalArgumentException for null inputList and negative search age
		 */
		public static ArrayList<Employee> searchByAge(ArrayList<Employee> inputList, int age) throws IllegalArgumentException{
			//input checks
			if(age<0) {
				throw new IllegalArgumentException("Search age can't be negative");
			}
			
			if(inputList == null) {
				throw new IllegalArgumentException("Input List can't be null");
			}
			//create results holder
			ArrayList<Employee> results = new ArrayList<Employee>();
			//search method
			for (Employee emp: inputList) {
				if(emp.getAge()<=age) {
					results.add(emp);
				}
			}
			
			return  results;
		}
	

}
