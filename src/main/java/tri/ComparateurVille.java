package tri;

import java.util.Comparator;

public class ComparateurVille implements Comparator<Ville>{
	
	private int choix;
	
	public ComparateurVille(int choix) {
		this.choix = choix;
	}

	@Override
	public int compare(Ville o1, Ville o2) {
		if (choix==0) {
			if (o1.getNbHabitants()>o2.getNbHabitants()) {
				return 1;
			}
			else if (o1.getNbHabitants()<o2.getNbHabitants()) {
				return -1;
			}
		}
		else if (choix==1) {
			return o1.getNom().compareTo(o2.getNom());
		}
		return 0;
	}

}
