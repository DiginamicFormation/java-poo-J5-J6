package fr.diginamic.salaire;

/** Représente un intervenant abstrait
 * @author DIGINAMIC
 *
 */
public abstract class Intervenant {

	/** nom : String*/
	protected String nom;
	/** prenom : String*/
	protected String prenom;

	/** Constructeur
	 * @param nom nom
	 * @param prenom prénom
	 */
	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	/** Retourne le salaire d'un intevenant
	 * @return double
	 */
	public abstract double getSalaire();
	
	/** Retourne le statut de l'intervenant
	 * @return String
	 */
	public abstract String getStatut();

	/**
	 * Affiche les données de l'intervenant
	 * @return String
	 */
	public final void afficherDonnees() {
		System.out.println(nom + " " + prenom + " " + this.getSalaire()+ " Statut: "+ this.getStatut());
	}

}