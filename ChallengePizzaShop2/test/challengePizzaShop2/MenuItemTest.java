package challengePizzaShop2;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import challengePizzaShop2.MenuItem;

class MenuItemTest {
	//test data
	String nameValidLow, nameValidHigh, nameInvalidFormat, nameInvalid;
	double priceValidLow, priceValidHigh, priceInvalid;
	

	@BeforeEach
	void setUp() throws Exception {
		
		nameValidLow = "low";
		nameValidHigh = "a".repeat(20);
		nameInvalid = "";
		nameInvalidFormat = " spaceBeforeName";
		
		priceValidLow = 1.2;
		priceValidHigh = 350;
		priceInvalid = -20;
	
		
	}

	@Test
	void testMenuItemConstructor() {
		MenuItem m1 = new MenuItem(nameValidLow, priceValidLow);
		
		assertNotNull(m1);
		assertEquals(nameValidLow, m1.getName());
		assertEquals(priceValidLow, m1.getPrice());
		
		m1.setPrice(priceInvalid);
		assertEquals(0, m1.getPrice());
	}
	
	@Test
	void testMenuItemConstructorInvalid() {
		assertThrows(IllegalArgumentException.class, ()->{
			MenuItem m2 = new MenuItem(nameInvalid, priceValidLow);
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			MenuItem m2 = new MenuItem(nameInvalidFormat, priceValidLow);
		});
		
	}

}
