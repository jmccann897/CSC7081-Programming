/**
 * 
 */
package insuranceEx;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author joshm
 *
 */
class PolicySearchTest {
	
	//test data
	//need policy objs
	MotorPolicy m1, m2, m3;
	String name1, name2, name3;
	int age1, age2, age3; //ages should be validated in motorPolicyTest.java
	int upperBoundAge, lowerBoundAge;
	MotorType bus, car, taxi;
	
	//need test array and results array
	ArrayList<MotorPolicy> list;
	ArrayList<MotorPolicy> results;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		list = new ArrayList<MotorPolicy>();
		results = new ArrayList<MotorPolicy>();
		
		name1 = "name1";
		name2 = "name2";
		name3 = "name3";
		
		age1 = 18;
		age2 = 36;
		age3 = 54;
		upperBoundAge = 60;
		lowerBoundAge = 20;
		
			
		bus = MotorType.BUS;
		car = MotorType.CAR;
		taxi = MotorType.TAXI;
		
		m1 = new MotorPolicy(name1, age1, car);
		m2 = new MotorPolicy(name2, age2, bus);
		m3 = new MotorPolicy(name3, age3, taxi);
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
	}

	/**
	 * Test for method SearchByAge in PolicySearch class
	 * Test method for {@link insuranceEx.PolicySearch#searchByAge(java.util.ArrayList, int, int)}.
	 */
	@Test
	void testSearchByAge() {
		results = PolicySearch.searchByAge(list, lowerBoundAge, upperBoundAge);
		assertNotNull(results);
		assertTrue(results.size() == 2); //or assertEquals(2, results.size());
		assertTrue(results.contains(m2) && results.contains(m3)); 
	}
	
	/**
	 * Test for invalid age inputs for searchByAge method in PolicySearch class
	 */
	@Test
	void testSearchByAgeInvalid() {
		assertThrows(IllegalArgumentException.class, ()-> {
			PolicySearch.searchByAge(list, -1, 80);
		});
		
		assertThrows(IllegalArgumentException.class, ()-> {
			PolicySearch.searchByAge(list, 20, 101);
		});
		
		assertThrows(IllegalArgumentException.class, ()-> {
			PolicySearch.searchByAge(list, 80, 70);
		});
	}

	/**
	 * Test for method SearchForAllByMotorPolicyType in policySearch class
	 * Test method for {@link insuranceEx.PolicySearch#searchForAllByMotorPolicyType(java.util.ArrayList, insuranceEx.MotorType)}.
	 */
	@Test
	void testSearchForAllByMotorPolicyType() {
		results  =PolicySearch.searchForAllByMotorPolicyType(list, taxi);
		assertNotNull(results);
		assertTrue(results.size() == 1);
		assertTrue(results.contains(m3));
	}

}
