package challengeWoof;

import java.util.Comparator;

public class CompareDogsByHeight implements Comparator<Dog>{

	@Override
	public int compare(Dog o1, Dog o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getHeightInCm()-o2.getHeightInCm());
	}

}
