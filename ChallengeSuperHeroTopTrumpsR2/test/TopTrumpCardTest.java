import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import challengeSuperHeroTopTrumps.Category;
import challengeSuperHeroTopTrumps.TopTrumpCard;

class TopTrumpCardTest {
	//test data
	String validNameLow, validNameMid, validNameHigh, 
	invalidNameLow, invalidNameHigh;
	int validStatLow, validStatMid, validStatHigh,
	invalidStatLow, invalidStatHigh;
	String bioValid, bioInvalid;
	String imgFileNameInvalidForm, imgFileNameInvalidLow;
	


	@BeforeEach
	void setUp() throws Exception {
		//load vars
		validNameLow = "a".repeat(1);
		validNameMid = "a".repeat(11)+".jpg";
		validNameHigh = "a".repeat(30);
		invalidNameLow = "";
		invalidNameHigh = "a".repeat(31);
		
		bioValid = "";
		bioInvalid = null;
		
		imgFileNameInvalidLow = ".jpg";
		imgFileNameInvalidForm = "a".repeat(5);
		
		validStatLow = 0;
		validStatMid = 15;
		validStatHigh = 100;
		invalidStatLow = -1;
		invalidStatHigh = 101;
	
		
	}

	@Test
	void testTopTrumpCard() {
		TopTrumpCard card = new TopTrumpCard(validNameLow, validNameLow, validNameMid, Category.HERO, validStatLow, validStatLow, validStatLow, validStatLow, bioValid);
		
	
		assertNotNull(card);
		assertEquals(validNameLow, card.getName());
		assertEquals(validNameLow, card.getRealName());
		assertEquals(validNameMid, card.getImageFilename());
		assertEquals(Category.HERO, card.getCategory());
		assertEquals(validStatLow, card.getSpeed());
		assertEquals(validStatLow, card.getStrength());
		assertEquals(validStatLow, card.getAgility());
		assertEquals(validStatLow, card.getIntelligence());
		assertNotNull(card.getBio());
	}
	
	@Test
	void testTopTrumpCardInvalid() {
	
		assertThrows(IllegalArgumentException.class, ()->{
			TopTrumpCard card = new TopTrumpCard(invalidNameLow, validNameLow, validNameMid, Category.HERO, validStatLow, validStatLow, validStatLow, validStatLow, bioValid);
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			TopTrumpCard card = new TopTrumpCard(invalidNameHigh, validNameLow, validNameMid, Category.HERO, validStatLow, validStatLow, validStatLow, validStatLow, bioValid);
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			TopTrumpCard card = new TopTrumpCard(validNameLow, invalidNameLow, validNameMid, Category.HERO, validStatLow, validStatLow, validStatLow, validStatLow, bioValid);
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			TopTrumpCard card = new TopTrumpCard(validNameLow, invalidNameHigh, validNameMid, Category.HERO, validStatLow, validStatLow, validStatLow, validStatLow, bioValid);
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			TopTrumpCard card = new TopTrumpCard(validNameLow, validNameLow, imgFileNameInvalidLow, Category.HERO, validStatLow, validStatLow, validStatLow, validStatLow, bioValid);
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			TopTrumpCard card = new TopTrumpCard(validNameLow, validNameLow, imgFileNameInvalidForm, Category.HERO, validStatLow, validStatLow, validStatLow, validStatLow, bioValid);
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			TopTrumpCard card = new TopTrumpCard(validNameLow, validNameLow, validNameMid, Category.HERO, invalidStatLow, validStatLow, validStatLow, validStatLow, bioValid);
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			TopTrumpCard card = new TopTrumpCard(validNameLow, validNameLow, validNameMid, Category.HERO, validStatLow, invalidStatHigh, validStatLow, validStatLow, bioValid);
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			TopTrumpCard card = new TopTrumpCard(validNameLow, validNameLow, validNameMid, Category.HERO, validStatLow, validStatLow, invalidStatLow, validStatLow, bioValid);
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			TopTrumpCard card = new TopTrumpCard(validNameLow, validNameLow, validNameMid, Category.HERO, validStatLow, validStatLow, validStatLow, invalidStatHigh, bioValid);
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			TopTrumpCard card = new TopTrumpCard(validNameLow, validNameLow, validNameMid, Category.HERO, validStatLow, validStatLow, validStatLow, validStatLow, bioInvalid);
		});
		
	}

	@Test
	void testGetSetName() {
		TopTrumpCard card = new TopTrumpCard(validNameLow, validNameLow, validNameMid, Category.HERO, validStatLow, validStatLow, validStatLow, validStatLow, bioValid);
		
		card.setName(validNameHigh);
		assertEquals(validNameHigh, card.getName());
	}

	@Test
	void testGetSetImageFilename() {
TopTrumpCard card = new TopTrumpCard(validNameLow, validNameLow, validNameMid, Category.HERO, validStatLow, validStatLow, validStatLow, validStatLow, bioValid);
		
		card.setName("alternative.jpg");
		assertEquals("alternative.jpg", card.getName());
	}

	@Test
	void testGetSetSpeed() {
TopTrumpCard card = new TopTrumpCard(validNameLow, validNameLow, validNameMid, Category.HERO, validStatLow, validStatLow, validStatLow, validStatLow, bioValid);
		
		card.setSpeed(validStatHigh);
		assertEquals(validStatHigh, card.getSpeed());
	}

	@Test
	void testGetMaxStatID() {
		TopTrumpCard card = new TopTrumpCard(validNameLow, validNameLow, validNameMid, Category.HERO, 90, 2, 92, 1, bioValid);
		assertEquals(2, card.getMaxStatID());
		
		card.setSpeed(99); 
		
		assertEquals(0, card.getMaxStatID());
		
	}

	@Test
	void testGetStatScore() {
		TopTrumpCard card = new TopTrumpCard(validNameLow, validNameLow, validNameMid, Category.HERO, 10, 20, 75, 100, bioValid);
		
		assertEquals(10, card.getStatScore(0));
		assertEquals(20, card.getStatScore(1));
		assertEquals(75, card.getStatScore(2));
		assertEquals(100, card.getStatScore(3));
		
	}

}
