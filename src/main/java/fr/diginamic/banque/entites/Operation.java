package fr.diginamic.banque.entites;

/** Représente une opération sur un compte
 * @author DIGINAMIC
 *
 */
public abstract class Operation {
	
	/** TYPE_CREDIT : String*/
	public static final String TYPE_CREDIT="CREDIT";
	
	/** TYPE_DEBIT : String*/
	public static final String TYPE_DEBIT="DEBIT";
	
	/** date : String*/
	private String date;
	
	/** montant : double*/
	private double montant;

	/** Constructeur
	 * @param date date de l'opération
	 * @param montant montant de l'opération
	 */
	public Operation(String date, double montant) {
		super();
		this.date = date;
		this.montant = montant;
	}
	
	/** Retourne le type de l'opération
	 * @return String
	 */
	public abstract String getType();

	/** Getter
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/** Setter
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/** Getter
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}

	/** Setter
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}


}
