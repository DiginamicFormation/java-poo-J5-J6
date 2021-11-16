package tri;

/**
 * @author RichardBONNAMY
 *
 */
public class Ville implements Comparable<Ville> {

	/** Nom */
	private String nom;
	
	/** Nombre d'habitants */
	private int nbHabitants;
	
	/** Constructeur
	 * @param nom nom
	 * @param nbHabitants nombre d'habitants
	 */
	public Ville(String nom, int nbHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}
	
	@Override
	public boolean equals(Object objet) {
		if (!(objet instanceof Ville)) {
			return false;
		}
		Ville autre = (Ville)objet;
		return ((this.nom==null && autre.getNom()==null) || this.nom.equals(autre.getNom())) && this.nbHabitants == autre.getNbHabitants();
	}
	
	@Override
	public int compareTo(Ville autre) {
		return this.nbHabitants - autre.getNbHabitants();
	}
	
	@Override
	public String toString() {
		return nom+" "+nbHabitants;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the nbHabitants
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}

	/** Setter
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
}
