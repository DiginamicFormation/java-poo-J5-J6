package fr.diginamic.banque.exception;

/** Représente une erreur dans l'application bancaire
 * @author DIGINAMIC
 */
public class ExceptionFonctionnelle extends Exception {

	/** serialVersionUID : long*/
	private static final long serialVersionUID = -5737653337079630639L;

	/** Constructeur
	 * @param message message d'erreur
	 */
	public ExceptionFonctionnelle(String message){
		super(message);
	}
}
