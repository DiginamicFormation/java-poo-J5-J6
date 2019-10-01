package fr.diginamic.banque.entites;

/** Représente un compte rémunéré avec un taux. 
 * Par héritage la classe CompteTaux possède également les attributs et méthodes de la classe Compte.
 * @author DIGINAMIC
 *
 */
public class CompteTaux extends Compte {

	/** taux : double*/
	private double taux;
	
	/** Constructeur
	 * @param numero numéro de compte
	 * @param solde solde
	 * @param taux taux de rémunération
	 */
	public CompteTaux(String numero, double solde, double taux) {
		
		// Appel du constructeur de la classe mère
		super(numero, solde);
		
		// Valorisation du taux
		this.taux = taux;
		
	}
	
	@Override
	public String toString(){
		return super.toString()+" - Taux:"+taux+" %";
	}

	/** Getter
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/** Setter
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

}
