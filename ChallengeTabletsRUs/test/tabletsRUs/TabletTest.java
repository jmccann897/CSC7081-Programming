package tabletsRUs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TabletTest {

	// test data
	String modelValid, notesValid, notesInvalidHigh;
	double priceValid, priceInvalid, sizeValid, sizeInvalidLow, sizeInvalidHigh;
	boolean isAndroidValid;
	Manufacturer apple, samsung, google, vankyo;
	Tablet t;

	@BeforeEach
	void setUp() throws Exception {
		t = new Tablet();
		
		modelValid = "modelValid";
		notesValid = "a".repeat(250);
		notesInvalidHigh = "a".repeat(251);
		priceValid = 299.99;
		priceInvalid = -1.01;
		sizeValid = 12.00;
		sizeInvalidLow = 5.99;
		sizeInvalidHigh = 21.00;
		isAndroidValid = true;
		apple = Manufacturer.APPLE;
		samsung = Manufacturer.SAMSUNG;
		google = Manufacturer.GOOGLE;
		vankyo = Manufacturer.VANKYO;
		

	}

	@Test
	void testTabletArgConstructor() {
		Tablet tab = new Tablet(apple, modelValid, priceValid, isAndroidValid, sizeValid, notesValid);
		// testing object has been created
		assertNotNull(tab);
		// testing each passed in arg matches with getter for parameter
		assertEquals(apple, tab.getManufacturer());
		assertEquals(modelValid, tab.getModel());
		assertEquals(priceValid, tab.getPrice());
		assertEquals(isAndroidValid, tab.isAndroid());
		assertEquals(sizeValid, tab.getSize());
		assertEquals(notesValid, tab.getNotes());
	}
	
	@Test
	void testGetSetManufacturer() {
		t.setManufacturer(apple);
		assertEquals(apple, t.getManufacturer());
		
		t.setManufacturer(samsung);
		assertEquals(samsung, t.getManufacturer());
		
		t.setManufacturer(google);
		assertEquals(google, t.getManufacturer());
		
		t.setManufacturer(vankyo);
		assertEquals(vankyo, t.getManufacturer());
		
	}

	@Test
	void testGetSetModel() {
		t.setModel(modelValid);
		assertEquals(modelValid, t.getModel());
	}

	@Test
	void testGetSetPrice() {
		t.setPrice(priceValid);
		assertEquals(priceValid, t.getPrice());
	}

	@Test
	void testGetSetPriceInvalid() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> {
			t.setPrice(priceInvalid);
		});

		assertEquals("Price can't be negative", e.getMessage());

	}

	@Test
	void testIsAndroid() {
		t.setAndroid(isAndroidValid);
		assertEquals(isAndroidValid, t.isAndroid());
	}

	@Test
	void testGetSetNotes() {
		t.setNotes(notesValid);
		;
		assertEquals(notesValid, t.getNotes());
		assertTrue(t.getNotes().length() <= 250);

		t.setNotes(notesInvalidHigh);
		;
		assertTrue(t.getNotes().length() <= 250);
	}
	
	@Test
	void testGetSetSize() {
		t.setSize(sizeValid);
		assertEquals(sizeValid, t.getSize());
	}
	
	@Test
	void testGetSetSizeInvalid() {
		t.setSize(sizeInvalidLow);
		//-1 is the defaulted error value for size
		assertEquals(-1, t.getSize());
	}
 
}
