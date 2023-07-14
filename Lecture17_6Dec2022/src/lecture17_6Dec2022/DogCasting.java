package lecture17_6Dec2022;

public class DogCasting {

	public static void main(String[] args) {


		Dog dogPointer = new Dog("Spot", "12345a");
		
		dogPointer.getLicenseNumber();//able to access dog methods
		
		Animal animalPointer = dogPointer; // object d can be upcasted without issue
		
		//Lion l = dogPointer; //can't cast laterally to another sub class
		
		Dog differentDogPointer = (Dog)animalPointer; //casting Animal object to Dog object 
		//example of downcasting
		
		System.out.println(differentDogPointer.getLicenseNumber());
		
		//downcasting has risk of trying to cast to a lateral subclass
		// this can be avoided by using instanceof keyword to check with if statement
		
		Animal lion = new Lion();
		

	}

}
