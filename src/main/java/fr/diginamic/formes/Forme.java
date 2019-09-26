package fr.diginamic.formes;

/** Représente une forme abstraite
 * @author DIGINAMIC
 *
 */
public abstract class Forme {

	/** Une forme doit être capable de calculer sa surface
	 * @return double
	 */
	public abstract double calculerSurface();

	/** Une forme doit être capable de calculer son périmètre
	 * @return double
	 */
	public abstract double calculerPerimetre();
}
