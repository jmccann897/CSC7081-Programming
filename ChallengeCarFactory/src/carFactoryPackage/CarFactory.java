package carFactoryPackage;

public class CarFactory {

	public static void main(String[] args) {
		
		FamilySaloon audi = new FamilySaloon("Audi", "A3", 130, true);
		audi.displayAll();
		
		F1 ferrari = new F1("Ferrari", "Maranello", 2330, 1.24);
		ferrari.displayAll();
		
		F1 mcLaren = new F1("McLaren", "MCL2016", 2320, 1.12);
		mcLaren.displayAll();
		
		
		FamilySaloon subaru2 = new FamilySaloon("Subaru", "Legacy", 123, false);
		subaru2.displayAll();
		
	}

}
