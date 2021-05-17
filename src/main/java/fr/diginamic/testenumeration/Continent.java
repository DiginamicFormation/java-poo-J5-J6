package fr.diginamic.testenumeration;

/**
 * Représente un des 5 continents
 * @author RichardBONNAMY
 *
 */
public enum Continent {
	
	AMERIQUE("Amérique"), ASIE("Asie"), EUROPE("Europe"), OCEANIE("Océanie"), AFRIQUE("Afrique");

	/** libelle */
	private String libelle;

	/** Constructeur
	 * @param libelle libellé
	 */
	private Continent(String libelle) {
		this.libelle = libelle;
	}

	/** Getter
	 * @return libelle
	 */
	public String getLibelle() {
		return libelle;
	}

}
