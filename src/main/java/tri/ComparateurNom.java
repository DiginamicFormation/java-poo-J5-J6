package tri;

import java.util.Comparator;

public class ComparateurNom implements Comparator<Ville>{

	@Override
	public int compare(Ville o1, Ville o2) {
		return o1.getNom().compareTo(o2.getNom());
	}

}
