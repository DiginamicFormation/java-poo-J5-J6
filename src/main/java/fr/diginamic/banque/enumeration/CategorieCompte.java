package fr.diginamic.banque.enumeration;

/** Représente une catégorie de compte
 * @author DIGINAMIC
 *
 */
public enum CategorieCompte {

	/** NORMAL : Compte normal*/
	NORMAL("Normal"), 
	/** TAUX : Compte rémunéré*/
	TAUX("Rémunéré");
	
	/** libelle : String*/
	private String libelle;
	
	/** Constructeur
	 * @param libelle libellé
	 */
	private CategorieCompte(String libelle){
		this.libelle=libelle;
	}
	

	/** Getter
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/** Setter
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}
