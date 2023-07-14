package math.examples;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeSearchTest {
	
	//test data
	ArrayList<Employee> inputList;
	Employee e1, e2, e3, e4, e5;
	
	@BeforeEach
	void setUp() throws Exception {
		//creating valid arrayList
		inputList = new ArrayList<Employee>();
		//creating 5 valid employee objects
		e1 = new Employee("validname1", 20, 100);
		e2 = new Employee("validname2", 30, 100);
		e3 = new Employee("validname3", 23, 100);
		e4 = new Employee("validname4", 27, 100);
		e5 = new Employee("validname5", 8, 100);
		//adding valid employee objects to inputList
		inputList.add(e1);
		inputList.add(e2);
		inputList.add(e3);
		inputList.add(e4);
		inputList.add(e5);
		
	}

	@Test
	void testSearchByAge() {
		ArrayList<Employee> results = EmployeeSearch.searchByAge(inputList, 23);
		//check size of returned list is aligned to expected
		assertTrue(results.size()==3);
		//check specific pass objects
		assertTrue(results.contains(e1));
		assertTrue(results.contains(e3));
		assertTrue(results.contains(e5));
		
		//2nd check with search age below any actual
		results = EmployeeSearch.searchByAge(inputList, 7);
		
		assertTrue(results.size()==0);
	}
	
	
	@Test
	void testSearchByAgeInvalid() {
		assertThrows(IllegalArgumentException.class, ()->{
			EmployeeSearch.searchByAge(inputList, -1);
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			EmployeeSearch.searchByAge(null, 10);
		});
		
		assertDoesNotThrow(()->{
			EmployeeSearch.searchByAge(inputList, 0);
		});
	}

}
