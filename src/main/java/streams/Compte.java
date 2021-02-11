package streams;

public class Compte {

	private Personne personne;
	private double solde;
	
	public Compte(Personne personne, double solde) {
		super();
		this.personne = personne;
		this.solde = solde;
	}
	/** Getter
	 * @return the personne
	 */
	public Personne getPersonne() {
		return personne;
	}
	/** Setter
	 * @param personne the personne to set
	 */
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	/** Getter
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
}
