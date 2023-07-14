package comeOnArsenal2;

import java.util.Comparator;

public class CompareByName implements Comparator<Team>{

	@Override
	public int compare(Team t1, Team t2) {
		// TODO Auto-generated method stub
		return t1.getName().compareTo(t2.getName());
	}

}
