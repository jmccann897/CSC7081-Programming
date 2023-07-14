package tabletsRUs;

public class Tablet {

	//instance vars
	private Manufacturer manufacturer; 
	private String model;
	private double price; //should not allow <£0
	private boolean android; //could also be enum?
	private double size;
	private String notes;
	
	/**
	 * default constructor
	 */
	public Tablet() {
		// TODO Auto-generated constructor stub
	}
	
	/** 
	 * Arg based constructor
	 * @param manufacturer
	 * @param model
	 * @param price
	 * @param android
	 * @param size
	 * @param notes
	 */
	public Tablet(Manufacturer manufacturer, String model, double price, boolean android, double size, String notes) {
		this.manufacturer = manufacturer;
		this.model= model;
		this.setPrice(price);
		this.android = android;
		this.setSize(size);
		this.setNotes(notes);
		
	}
	//getters&setters
	/**
	 * 
	 * @return
	 */
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	/**
	 * 
	 * @param manufacturer
	 */
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	/**
	 * 
	 * @return
	 */
	public String getModel() {
		return model;
	}
	/**
	 * 
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * 
	 * @return
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * 
	 * @param price
	 */
	public void setPrice(double price) throws IllegalArgumentException {
		if(price>=0) {
			this.price=price;
		}else {
			throw new IllegalArgumentException("Price can't be negative");
		}
	}
	/**
	 * 
	 * @return
	 */
	public boolean isAndroid() {
		return android;
	}
	/**
	 * 
	 * @param isAndroid
	 */
	public void setAndroid(boolean isAndroid) {
		this.android = isAndroid;
	}
	/**
	 * 
	 * @return
	 */
	public double getSize() {
		return size;
	}
	/**
	 * 
	 * @param size
	 */
	public void setSize(double size) {
		if (size>6 && size<21) {
			this.size = size;
		}else {
			this.size = -1;
			System.err.println("Error setting size for "+this.manufacturer+" "+this.model);
		}
		
	}
	/**
	 * 
	 * @return
	 */
	public String getNotes() {
		return notes;
	}
	/**
	 * 
	 * @param notes
	 */
	public void setNotes(String notes) {
		if(notes.length()>250) {
			System.out.println("The entered notes have been truncated to 250 characters");
			this.notes = notes.substring(0, 250);
		}else {
			this.notes = notes;
		}
		
	}
	
	//methods
	public void allDetails(){
		System.out.println("Tablet details_____________");
		System.out.println("Manufacturer : "+this.getManufacturer());
		System.out.println("Model : "+this.getModel());
		System.out.println("Price : "+this.getPrice());
		System.out.println("Is this an Android : "+this.isAndroid());
		System.out.println("Size : "+this.getSize());
		System.out.println("Notes : "+this.getNotes());
		System.out.println();
	}
	

}
