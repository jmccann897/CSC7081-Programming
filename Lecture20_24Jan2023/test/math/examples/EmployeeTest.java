package math.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	// test data
	Employee emp;
	String nameValidLow, nameValidMid, nameValidHigh;
	String nameInvalidLow, nameInvalidHigh, nameInvalidNull;
	int ageValidLow, ageValidMid, ageValidHigh;
	int ageInvalidLow, ageInvalidHigh;
	double validSalary1, validSalary2, invalidSalary;

	@BeforeEach
	void setUp() throws Exception {
		nameValidLow = "aa";
		nameValidMid = "aaaaaaaa";
		nameValidHigh = "a".repeat(20);
		nameInvalidLow = "x";
		nameInvalidHigh = "x".repeat(21);
		nameInvalidNull = null;

		ageValidLow = 0;
		ageValidMid = 34;
		ageValidHigh = 65;

		ageInvalidLow = -1;
		ageInvalidHigh = 66;

		validSalary1 = 0;
		validSalary2 = 2000;

		invalidSalary = -0.01;

		emp = new Employee();
	}

	@Test
	void testEmployeeConstructorWithArgsValidData() {
		Employee empArgs = new Employee (nameValidMid, ageValidHigh, validSalary1);
		assertNotNull(empArgs); 
		assertEquals(nameValidMid, empArgs.getName());
		assertEquals(ageValidHigh, empArgs.getAge());
		assertEquals(validSalary1, empArgs.getSalary());
	}
	
	@Test
	void testEmployeeConstructorWithArgsInvalidData() {
		assertThrows(IllegalArgumentException.class, ()->{
			new Employee(nameInvalidLow, ageValidMid, validSalary1);
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			new Employee(nameInvalidLow, ageInvalidLow, validSalary1);
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			new Employee(nameInvalidLow, ageValidMid, invalidSalary);
		});
	}

	@Test
	void testGetSetName() {
		emp.setName(nameValidLow);
		assertEquals(nameValidLow, emp.getName());

		emp.setName(nameValidMid);
		assertEquals(nameValidMid, emp.getName());

		emp.setName(nameValidHigh);
		assertEquals(nameValidHigh, emp.getName());
	}
	
	@Test
	void testSetNameInvalid() {
		Exception exp = assertThrows(IllegalArgumentException.class, ()->{
			emp.setName(nameInvalidLow);
		});
		
		exp = assertThrows(IllegalArgumentException.class, ()->{
			emp.setName(nameInvalidHigh);
		});
		
		assertEquals("Invalid name length", exp.getMessage());
		
		exp = assertThrows(IllegalArgumentException.class, ()->{
			emp.setName(null);
		});
		
		assertEquals("Name cant be null", exp.getMessage());
	}

	@Test
	void testGetSetAge() {
		emp.setAge(ageValidLow);
		assertEquals(ageValidLow, emp.getAge());

		emp.setAge(ageValidMid);
		assertEquals(ageValidMid, emp.getAge());

		emp.setAge(ageValidHigh);
		assertEquals(ageValidHigh, emp.getAge());
	}
	
	@Test
	void testAgeInvalid() {
		assertThrows(IllegalArgumentException.class, ()->{
			emp.setAge(ageInvalidHigh);
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			emp.setAge(ageInvalidLow);
		});
	}

}
