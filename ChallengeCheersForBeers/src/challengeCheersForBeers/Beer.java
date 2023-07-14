
package challengeCheersForBeers;

public class Beer {

	//instance vars
	private String name;
	private String style;
	private String country;
	private double alcoholContent;
	
	
	
	public Beer (String name, String style, String country, double alcoholContent) {
		this.name = name;
		this.style = style;
		this.country = country;
		this.alcoholContent = alcoholContent;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the style
	 */
	public String getStyle() {
		return style;
	}



	/**
	 * @param style the style to set
	 */
	public void setStyle(String style) {
		this.style = style;
	}



	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}



	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}



	/**
	 * @return the alcoholContent
	 */
	public double getAlcoholContent() {
		return alcoholContent;
	}



	/**
	 * @param alcoholContent the alcoholContent to set
	 */
	public void setAlcoholContent(double alcoholContent) {
		this.alcoholContent = alcoholContent;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s ="Name: "+ this.getName()+", Style: "+this.getStyle()+", Country: "+this.getCountry()+", Alc%: "+this.getAlcoholContent(); 
		return s;
	}
	
	
	
	
}
