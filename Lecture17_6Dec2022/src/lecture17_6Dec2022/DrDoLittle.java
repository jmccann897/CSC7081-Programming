/**
 * 
 */
package lecture17_6Dec2022;

/**
 * @author joshm
 *
 */
public class DrDoLittle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Animal animal1 = new Animal();
		Animal animal2 = new Dog("Rover");
		Lion animal3 = new Lion();
		Animal animal4 = new Dog("Fido");
		Dog animal5 = new Dog();
		
		Animal[] zoo = new Animal[5];
		zoo[0] = animal1;
		zoo[1] = animal2;
		zoo[2] = animal3;
		zoo[3] = animal4;
		zoo[4] = animal5;
		
		for (Animal a:zoo) {
			talkToAnimal(a);
		}
//		animal1.makeNoise();
//		animal2.makeNoise();
//		animal3.makeNoise();
//		animal4.makeNoise();
//		animal5.makeNoise();
//		animal5.markTeritory();
		
		
//		talkToAnimal(animal4);
		
	}

//	private static void talkToAnimal (Dog creature) {
//		System.out.println("In dog talking method");
//		creature.makeNoise();
//	}
//	
	private static void talkToAnimal(Animal creature) {
		// TODO Auto-generated method stub
		System.out.println("In generic talking method");
		creature.makeNoise();
	}

}
