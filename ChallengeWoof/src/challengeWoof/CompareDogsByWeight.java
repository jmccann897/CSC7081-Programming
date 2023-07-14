package challengeWoof;

import java.util.Comparator;

public class CompareDogsByWeight implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		// TODO Auto-generated method stub
		return (int) (o2.getWeightInKg() - o1.getWeightInKg());
	}

}
