package fr.diginamic.salaire;

/** Représente un salarié de la société
 * @author DIGINAMIC
 *
 */
public class Salarie extends Intervenant {

	/** salaire : salaire mensuel du salarié*/
	private double salaire;
	
	/** Constructeur
	 * @param nom nom
	 * @param prenom prénom
	 * @param salaire salaire mensuel
	 */
	public Salarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}

	@Override
	public double getSalaire() {
		return this.salaire;
	}

	@Override
	public String getStatut() {
		return "Salarié";
	}
}