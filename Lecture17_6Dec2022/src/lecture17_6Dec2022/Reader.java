package lecture17_6Dec2022;

public class Reader extends Employee{

	private String research;
	
	public Reader(String firstName, String lastName, String research) {
		super(firstName, lastName);
		this.setResearch(research);
	}
	
	public String getResearch () {
		return research;
	}
	
	public void setResearch(String research) {
		this.research = research;
	}

	@Override
	public void printLineManager() {
		System.out.println("Principle Investigator");
		
	}
}
