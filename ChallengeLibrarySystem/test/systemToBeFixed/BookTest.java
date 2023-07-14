/**
 * 
 */
package systemToBeFixed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author joshm
 *
 */
class BookTest {
	
	//test data
	String ISBNValid, ISBNInvalidLow, ISBNInvalidHigh,
	authorValid, authorInvalid, titleValid, titleInvalid;
	int ratingValid, ratingInvalid, ratingInvalidHigh;
	
	Book book;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		ISBNValid = ("a".repeat(10));
		ISBNInvalidLow = ("a".repeat(9));
		ISBNInvalidHigh = ("a".repeat(14));
		
		authorValid = "a";
		authorInvalid = "";
		
		titleValid = "a";
		titleInvalid = "";
		
		ratingValid = 1;
		ratingInvalid = -1;
		ratingInvalidHigh = 6;
		
		book = new Book();
	}

	@Test
	void testConstructorWithArgs() {
		book = new Book(ISBNValid, authorValid, titleValid, ratingValid);
		assertNotNull(book);
		
		assertEquals(ISBNValid, book.getISBN());
		assertEquals(authorValid, book.getAuthor());
		assertEquals(titleValid, book.getTitle());
		assertEquals(ratingValid, book.getRating());
	}
	
	@Test
	void testConstructorwithInvalidArgs() {
		assertThrows(IllegalArgumentException.class, ()->{
			new Book(ISBNInvalidLow, authorValid, titleValid, ratingValid );
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			new Book(ISBNInvalidHigh, authorValid, titleValid, ratingValid );
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			new Book(ISBNValid, authorInvalid, titleValid, ratingValid );
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			new Book(ISBNValid, authorValid, titleInvalid, ratingValid );
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			new Book(ISBNValid, authorValid, titleValid, ratingInvalid );
		});
		
		assertThrows(IllegalArgumentException.class, ()->{
			new Book(ISBNValid, authorValid, titleValid, ratingInvalidHigh );
		});
		
	}
	
	@Test
	void testGetSetISBN() {
		book.setISBN(ISBNValid);
		assertEquals(ISBNValid, book.getISBN());
	}
	
	@Test
	void testGetSetISBNInvalid() {
		Exception exp = assertThrows(IllegalArgumentException.class, ()->{
			book.setISBN(ISBNInvalidLow);
		});
		
		exp = assertThrows(IllegalArgumentException.class, ()->{
			book.setISBN(ISBNInvalidHigh);
		});
	}

}
