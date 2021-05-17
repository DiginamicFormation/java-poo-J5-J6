package listes;

/** Représente une ville
 * @author RichardBONNAMY
 *
 */
public class Ville {

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
	public String toString() {
		return nom+" "+nbHabitants;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

}
