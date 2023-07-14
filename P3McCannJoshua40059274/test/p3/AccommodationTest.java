package p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
* @author - McCannJoshua 40059274
*/
class AccommodationTest {
	
	//test data
	String validLow, validHigh, invalidString;
	int validNumLow, validNumHigh, validNumMid, invalidNumLow, invalidNumHigh, invalidRoomLow;
	double validDouble, invalidDouble;
	
	Accommodation a1;

	@BeforeEach
	void setUp() throws Exception {
		
		//initialise
		validLow = "a";
		validHigh = "a".repeat(20);		
		invalidString = "";
		
		validNumLow = 1; 
		validNumHigh = 5; 
		validNumMid = 3; 
		invalidNumLow = 0;
		invalidNumHigh = 6;
		invalidRoomLow = -1;
		
		 validDouble = 0.01;
		 invalidDouble = -0.01;
		 
		 
	}

	@Test
	void testAccommodationConstructorWithArgs() {
		Accommodation a1 = new Accommodation(validHigh, Type.BNB, validNumHigh, validHigh, validDouble, validNumHigh);
		
		assertNotNull(a1);
		assertEquals(validHigh, a1.getName());
		assertEquals(Type.BNB, a1.getType());
		assertEquals(validNumHigh, a1.getStars());
		assertEquals(validHigh, a1.getCity());
		assertEquals(validDouble, a1.getPrice(), 0.00001); //delta to allow for diff in truncation
		assertEquals(validNumHigh, a1.getRooms());
		
		
	}
	
	@Test
	void testAccommodationInvalidConstructorWithArgs() {
		
		Exception e = assertThrows(IllegalArgumentException.class, ()->{
			Accommodation a1 = new Accommodation(invalidString, Type.BNB, validNumHigh, validHigh, validDouble, validNumHigh);
		});
		assertEquals("Invalid name", e.getMessage());
		
		e = assertThrows(IllegalArgumentException.class, ()->{
			 a1 = new Accommodation(validHigh, Type.BNB, invalidNumLow, validHigh, validDouble, validNumHigh);
		});
		assertEquals("Invalid stars entered", e.getMessage());
		
		e = assertThrows(IllegalArgumentException.class, ()->{
			 a1 = new Accommodation(validHigh, Type.BNB, invalidNumHigh, validHigh, validDouble, validNumHigh);
		});
		assertEquals("Invalid stars entered", e.getMessage());
		
		e = assertThrows(IllegalArgumentException.class, ()->{
			 a1 = new Accommodation(validHigh, Type.BNB, validNumHigh, invalidString, validDouble, validNumHigh);
		});
		assertEquals("Invalid city", e.getMessage());
		
		e = assertThrows(IllegalArgumentException.class, ()->{
			 a1 = new Accommodation(validHigh, Type.BNB, validNumHigh, validHigh, invalidDouble, validNumHigh);
		});
		assertEquals("Invalid price", e.getMessage());
		
		
		e = assertThrows(IllegalArgumentException.class, ()->{
			Accommodation a1 = new Accommodation(validHigh, Type.BNB, validNumHigh, validHigh, validDouble, invalidRoomLow);
		});
		assertEquals("Invalid rooms", e.getMessage());
		
	}
	

	@Test
	void testGetSetStars() {
		//set to inital star amount
		Accommodation a = new Accommodation(validHigh, Type.HOTEL, validNumHigh, validHigh, validDouble, validNumHigh);
		
		//try to change star amount via setter
		a.setStars(validNumLow);
		//check using the getter
		assertEquals(validNumLow, a.getStars());
		
	}


}
