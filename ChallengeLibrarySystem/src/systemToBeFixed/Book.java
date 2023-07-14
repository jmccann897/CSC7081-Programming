package systemToBeFixed;

/**
 * Book class - represents a book in the system
 * 
 * @author amcgowan
 */
public class Book {

// instance vars
	/**
	 * The book's ISBN
	 */
	private String ISBN;

	/**
	 * The author of the book
	 */
	private String author;

	/**
	 * The title of the book
	 */
	private String title;

	/**
	 * The rating of the book
	 */
	private int rating;

	/**
	 * Default constructor
	 */
	public Book() {

	}

	/**
	 * Arg based constructor
	 * @param ISBN
	 * @param author
	 * @param title
	 * @param rating
	 */
	public Book(String ISBN, String author, String title, int rating) {
		this.setISBN(ISBN);
		this.setAuthor(author);
		this.setTitle(title);
		this.setRating(rating);
	}

	/**
	 * Gets the ISBN number
	 * 
	 * @return
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * Sets the ISBN number
	 * 
	 * @param iSBN 10 or 13 chars
	 * @throws Exception
	 */
	public void setISBN(String iSBN) throws IllegalArgumentException {
		if (iSBN.length() == 10 || iSBN.length() == 13) {
			this.ISBN = iSBN;
		} else {
			throw new IllegalArgumentException("Invalid ISBN entered");
		}
	}

	/**
	 * Get the book's author
	 * 
	 * @return
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the book's author author at least 1 character
	 * 
	 * @param author
	 * @throws Exception
	 */
	public void setAuthor(String author) throws IllegalArgumentException{
		if (author.length() >= 1) {
			this.author = author;
		} else {
			throw new IllegalArgumentException("Invalid author name entered");
		}
	}

	/**
	 * Gets the book's title
	 * 
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the books title 
	 * title at least 1 character
	 * @throws Exception
	 * @param title
	 */
	public void setTitle(String title) throws IllegalArgumentException {
		if(title.length() >= 1) {
			this.title = title;
		} else {
			throw new IllegalArgumentException("Invalid title entered");
		}
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 * rating should be 1 to 5
	 */
	public void setRating(int rating) throws IllegalArgumentException {
		if(rating>0 && rating <6) {
			this.rating = rating;
		}else {
			throw new IllegalArgumentException("Invalid rating entered");
		}
		
	}

}
