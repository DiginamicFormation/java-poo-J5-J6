package maps;

/**
 * @author RichardBONNAMY
 *
 */
public class Ville implements Comparable<Ville> {

	/** nom */
	private String nom;
	
	/** nbHabitants */
	private int nbHabitants;
	
	/** departement */
	private String departement;

	/** Constructeur
	 * @param nom
	 * @param nbHabitants
	 */
	public Ville(String nom, int nbHabitants, String departement) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.departement = departement;
	}
	
	public int compareTo(Ville autre) {
		if (this.nbHabitants > autre.getNbHabitants()) {
			return 1;
		}
		else if (this.nbHabitants <autre.getNbHabitants()) {
			return -1;
		}
		return 0;
	}
	
	
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitants=" + nbHabitants + "]";
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

	/** Getter
	 * @return the departement
	 */
	public String getDepartement() {
		return departement;
	}

	/** Setter
	 * @param departement the departement to set
	 */
	public void setDepartement(String departement) {
		this.departement = departement;
	}

}
