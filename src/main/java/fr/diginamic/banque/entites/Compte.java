package fr.diginamic.banque.entites;

/** Représente un compte bancaire
 * @author RichardBONNAMY
 *
 */
public class Compte {

	/** Numéro du compte  */
	private String numero;
	
	/** Solde du compte  */
	private double solde;
	
	/** Constructeur
	 * @param numero numéro
	 * @param solde solde
	 */
	public Compte(String numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}

	@Override
	public String toString() {
		String chaine = "Mon compte a le numéro " + numero + " et un solde de " + solde + " €.";
		return chaine;
	}
	
	/** Getter
	 * @return numero
	 */
	public String getNumero() {
		return numero;
	}
	
	/** Setter
	 * @param numero numero
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	/** Getter
	 * @return solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde solde
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
}
