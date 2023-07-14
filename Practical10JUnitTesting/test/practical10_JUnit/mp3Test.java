/**
 * 
 */
package practical10_JUnit;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author joshm
 *
 */
class mp3Test {

	// test data
	mp3 mp3;
	int refValid;
	int refInvalid;
	int refBoundary;
	String artistValid;
	String songNameValid;
	int ratingValid;
	int ratingInvalidLow;
	int ratingInvalidHigh;
	int songLengthValid;
	int songLengthInvalidLow;
	int songLengthInvalidHigh;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		refValid = 2;
		refInvalid = -100;
		refBoundary = 0;

		artistValid = "validArtist";

		songNameValid = "validSongName";

		ratingValid = 3;
		ratingInvalidHigh = 6;
		ratingInvalidLow = 0;

		songLengthValid = 180;
		songLengthInvalidHigh = 2501;
		songLengthInvalidLow = 0;

		mp3 = new mp3();
	}

	@Test
	void testMp3ConstructorWithValidArgs() {
		mp3 mp3WithValidArgs = new mp3(refValid, artistValid, songNameValid, ratingValid, songLengthValid);
		assertNotNull(mp3WithValidArgs);
		assertEquals(refValid, mp3WithValidArgs.getRef());
		assertEquals(artistValid, mp3WithValidArgs.getArtist());
		assertEquals(songNameValid, mp3WithValidArgs.getSongName());
		assertEquals(ratingValid, mp3WithValidArgs.getRating());
		assertEquals(songLengthValid, mp3WithValidArgs.getSongLength());
	}

	@Test
	void testMp3ConstructorWithInvalidArgs() {
		assertThrows(IllegalArgumentException.class, () -> {
			new mp3(refInvalid, artistValid, songNameValid, ratingValid, songLengthValid);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new mp3(refValid, artistValid, songNameValid, ratingInvalidLow, songLengthValid);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new mp3(refValid, artistValid, songNameValid, ratingInvalidHigh, songLengthValid);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new mp3(refValid, artistValid, songNameValid, ratingValid, songLengthInvalidLow);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new mp3(refValid, artistValid, songNameValid, ratingValid, songLengthInvalidHigh);
		});

	}

	@Test
	void testMp3GetSetSongLength() {
		mp3.setSongLength(songLengthValid);
		assertEquals(songLengthValid, mp3.getSongLength());

	}

	@Test
	void testMp3SetSongLengthInvalid() {
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			mp3.setSongLength(songLengthInvalidLow);
		});

		exp = assertThrows(IllegalArgumentException.class, () -> {
			mp3.setSongLength(songLengthInvalidHigh);
		});
	}

}
