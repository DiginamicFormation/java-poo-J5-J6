package listes;

import java.util.Comparator;

public class ComparatorPopDesc implements Comparator<Pays> {
 
	// Y a rien
	
	@Override
	public int compare(Pays o1, Pays o2) {
		if (o1.getPop() > o2.getPop()){
			return -1;
		}
		else if (o1.getPop() < o2.getPop()){
			return 1;
		}
		return 0;
	}

}
