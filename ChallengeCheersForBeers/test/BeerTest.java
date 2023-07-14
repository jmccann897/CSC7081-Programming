import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import challengeCheersForBeers.Beer;

class BeerTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testValidConstructor() {
		Beer b1 = new Beer("Beer Name", "style", "Ireland", 2.7);
		
		assertEquals("Beer Name", b1.getName());
		assertEquals("style", b1.getStyle());
		assertEquals("Ireland", b1.getCountry());
		assertEquals(2.7, b1.getAlcoholContent());
		
		
	}

}
