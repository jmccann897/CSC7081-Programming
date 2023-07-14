/**
 * 
 */
package systemToBeFixed;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author joshm
 *
 */
class LibrarySearchTest {

	// test data
	Book b1, b2, b3;
	String authorB1, authorB2, authorB3;
	String ISBNB1, ISBNB2, ISBNB3;
	String titleB1, titleB2, titleB3;
	int ratingB1, ratingB2, ratingB3;

	ArrayList<Book> arrayList;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		authorB1 = "B1Author";
		authorB2 = "B2Author";
		authorB3 = "B3Author";

		titleB1 = "B1Title";
		titleB2 = "B2Title";
		titleB3 = "B3Title";

		ISBNB1 = "ISBNB1AAAA";
		ISBNB2 = "ISBNB2AAAA";
		ISBNB3 = "ISBNB3AAAA";

		ratingB1 = 1;
		ratingB2 = 2;
		ratingB3 = 3;

		b1 = new Book(ISBNB1, authorB1, titleB1, ratingB1);
		b2 = new Book(ISBNB2, authorB2, titleB2, ratingB2);
		b3 = new Book(ISBNB3, authorB3, titleB3, ratingB3);

		arrayList = new ArrayList<Book>();
		arrayList.add(b1);
		arrayList.add(b2);
		arrayList.add(b3);

	}

	/**
	 * Test method for
	 * {@link systemToBeFixed.LibrarySearch#searchByTitle(java.util.ArrayList, java.lang.String)}.
	 */
	@Test
	void testSearchByTitle() {

		ArrayList<Book> results = LibrarySearch.searchByTitle(arrayList, titleB1);
		if (results.contains(b1)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

	/**
	 * Test method for
	 * {@link systemToBeFixed.LibrarySearch#searchByAuthor(java.util.ArrayList, java.lang.String)}.
	 */
	@Test
	void testSearchByAuthor() {
		ArrayList<Book> results = LibrarySearch.searchByAuthor(arrayList, authorB1);
		if (results.contains(b1)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

	/**
	 * Test method for
	 * {@link systemToBeFixed.LibrarySearch#searchByISBN(java.util.ArrayList, java.lang.String)}.
	 */
	@Test
	void testSearchByISBN() {
		ArrayList<Book> results = LibrarySearch.searchByISBN(arrayList, ISBNB2);
		if (results.contains(b2)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

	/**
	 * Test method for
	 * {@link systemToBeFixed.LibrarySearch#searchByRating(java.util.ArrayList, int)}.
	 */
	@Test
	void testSearchByRating() {
		ArrayList<Book> results = LibrarySearch.searchByRating(arrayList, ratingB3);
		if (results.contains(b3)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

}
