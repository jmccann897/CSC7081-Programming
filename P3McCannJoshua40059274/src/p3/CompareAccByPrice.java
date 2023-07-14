package p3;

import java.util.Comparator;

/**
* @author - McCannJoshua 40059274
*/
public class CompareAccByPrice implements Comparator<Accommodation> {

	@Override
	public int compare(Accommodation a1, Accommodation a2) {
		// TODO Auto-generated method stub
		return (int) (a1.getPrice() - a2.getPrice());
	}

}
