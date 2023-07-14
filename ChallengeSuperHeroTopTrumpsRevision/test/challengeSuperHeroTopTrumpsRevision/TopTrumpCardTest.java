package challengeSuperHeroTopTrumpsRevision;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import challengeSuperHeroTopTrumpsRevision.Category;
import challengeSuperHeroTopTrumpsRevision.TopTrumpCard;

class TopTrumpCardTest {

	String validLowerName = "a".repeat(1);
	String validHigherName = "a".repeat(30);
	String invalidLowerName = "";
	String invalidHigherName = "a".repeat(31);
	
	String validLowImageName = "a".repeat(5)+".jpg";
	String validHighImageName = "a".repeat(26)+".jpg";
	String invalidLowImageName = ".jpg";
	String invalidHighImageName = "a".repeat(27) + ".jpg";
	String invalidImageName = "a".repeat(20); //no .jpg
	
	int validLowStat = 0;
	int validHighStat = 100;
	int invalidLowStat = -1;
	int invalidHighStat = 101;
	
	Category hero = Category.HERO;
	Category villain = Category.VILLAIN;
	
	String validBio = "a";
	String invalidBio = null;
	
	 TopTrumpCard c1;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testValidConstructor() {
		//valid path
		TopTrumpCard c1 = new TopTrumpCard(validLowerName, validLowerName, validLowImageName, hero, validLowStat, validLowStat, validLowStat, validLowStat, validBio);
		
		assertEquals(validLowerName, c1.getName());
		assertEquals(validLowImageName, c1.getImageFileName());
		assertEquals(validBio, c1.getBio());
	}
	
	@Test
	void testInvalidConstructor() {
		//unhappy path
		assertThrows(IllegalArgumentException.class, ()-> {
			TopTrumpCard c1 = new TopTrumpCard(invalidLowerName, validLowerName, validLowImageName, hero, validLowStat, validLowStat, validLowStat, validLowStat, validBio);
		});
		
		assertThrows(IllegalArgumentException.class, ()-> {
			c1 = new TopTrumpCard(invalidHigherName, validLowerName, validLowImageName, hero, validLowStat, validLowStat, validLowStat, validLowStat, validBio);
		});
		assertThrows(IllegalArgumentException.class, ()-> {
			c1 = new TopTrumpCard(validLowerName, invalidLowerName, validLowImageName, hero, validLowStat, validLowStat, validLowStat, validLowStat, validBio);
		});
		assertThrows(IllegalArgumentException.class, ()-> {
			c1 = new TopTrumpCard(validLowerName, invalidHigherName, validLowImageName, hero, validLowStat, validLowStat, validLowStat, validLowStat, validBio);
		});
		assertThrows(IllegalArgumentException.class, ()-> {
			c1 = new TopTrumpCard(validLowerName, validLowerName, invalidImageName, hero, validLowStat, validLowStat, validLowStat, validLowStat, validBio);
		});
		assertThrows(IllegalArgumentException.class, ()-> {
			 c1 = new TopTrumpCard(validLowerName, validLowerName, invalidLowImageName, hero, validLowStat, validLowStat, validLowStat, validLowStat, validBio);
		});
		assertThrows(IllegalArgumentException.class, ()-> {
			 c1 = new TopTrumpCard(validLowerName, validLowerName, invalidHighImageName, hero, validLowStat, validLowStat, validLowStat, validLowStat, validBio);
		});
		assertThrows(IllegalArgumentException.class, ()-> {
			 c1 = new TopTrumpCard(validLowerName, validLowerName, validLowImageName, hero, invalidHighStat, validLowStat, validLowStat, validLowStat, validBio);
		});
		assertThrows(IllegalArgumentException.class, ()-> {
			 c1 = new TopTrumpCard(validLowerName, validLowerName, validLowImageName, hero, invalidLowStat, validLowStat, validLowStat, validLowStat, validBio);
		});
		assertThrows(IllegalArgumentException.class, ()-> {
			 c1 = new TopTrumpCard(validLowerName, validLowerName, validLowImageName, hero, validLowStat, invalidHighStat, validLowStat, validLowStat, validBio);
		});
		assertThrows(IllegalArgumentException.class, ()-> {
			 c1 = new TopTrumpCard(validLowerName, validLowerName, validLowImageName, hero, validLowStat, invalidLowStat, validLowStat, validLowStat, validBio);
		});
		assertThrows(IllegalArgumentException.class, ()-> {
			 c1 = new TopTrumpCard(validLowerName, validLowerName, validLowImageName, hero, validLowStat, validLowStat, invalidHighStat, validLowStat, validBio);
		});
		assertThrows(IllegalArgumentException.class, ()-> {
			 c1 = new TopTrumpCard(validLowerName, validLowerName, validLowImageName, hero, validLowStat, validLowStat, invalidLowStat, validLowStat, validBio);
		});
		assertThrows(IllegalArgumentException.class, ()-> {
			 c1 = new TopTrumpCard(validLowerName, validLowerName, validLowImageName, hero, validLowStat, validLowStat, validLowStat, invalidHighStat, validBio);
		});
		assertThrows(IllegalArgumentException.class, ()-> {
			 c1 = new TopTrumpCard(validLowerName, validLowerName, validLowImageName, hero, validLowStat, validLowStat, validLowStat, invalidLowStat, validBio);
		});
		assertThrows(IllegalArgumentException.class, ()-> {
			 c1 = new TopTrumpCard(validLowerName, validLowerName, validLowImageName, hero, validLowStat, validLowStat, validLowStat, invalidLowStat, invalidBio);
		});
	
	}
	
	@Test
	void TestGetStatScore() {
		TopTrumpCard c1 = new TopTrumpCard(validLowerName, validLowerName, validLowImageName, hero, 97, 10, 13, 76, validBio);
		assertEquals(10, c1.getStatScore(1));
		
	}
	
	@Test
	void TestgetMaxStatID() {
		TopTrumpCard c1 = new TopTrumpCard(validLowerName, validLowerName, validLowImageName, hero, 97, 10, 13, 76, validBio);
		assertEquals(0, c1.getMaxStatID());
	}

}
