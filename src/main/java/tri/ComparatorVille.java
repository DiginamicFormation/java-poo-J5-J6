package tri;

import java.util.Comparator;

/** Comparateur avec possibilité de choisir son critère de tri
 * @author RichardBONNAMY
 *
 */
public class ComparatorVille implements Comparator<Ville> {
	
	/** choix */
	private int choix;
	
	/** Constructeur
	 * @param choix choix du critère
	 */
	public ComparatorVille(int choix) {
		this.choix = choix;
	}

	@Override
	public int compare(Ville v1, Ville v2) {
		if (choix==0) {
			return v1.getNbHabitants() - v2.getNbHabitants();
		}
		else if (choix==1) {
			return v1.getNom().compareTo(v2.getNom());
		}
		return 0;
	}

}
