package fr.diginamic.salaire;

/** Représente un pigiste qui intervient à la journée au sein de la société
 * @author DIGINAMIC
 *
 */
public class Pigiste extends Intervenant {

	/** nbJours : nombre de jours travaillés dans la société */
	private int nbJours;
	
	/** montantRemuJours : montant quotidien versé au pigiste */
	private double montantRemuJours;
	
	/** Constructeur
	 * @param nom nom
	 * @param prenom prénom
	 * @param nbJours nombre de jours travaillés
	 * @param montantRemuJours montant quotidien versé au pigiste
	 */
	public Pigiste(String nom, String prenom, int nbJours, double montantRemuJours) {
		super(nom, prenom);
		this.nbJours = nbJours;
		this.montantRemuJours = montantRemuJours;
	}

	@Override
	public double getSalaire() {
		return nbJours*montantRemuJours;
	}
	

	@Override
	public String getStatut() {
		return "Pigiste";
	}
}