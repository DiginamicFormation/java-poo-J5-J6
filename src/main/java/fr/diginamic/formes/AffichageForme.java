package fr.diginamic.formes;

/** Classe qui affiche les caractéristiques d'une forme
 * @author DIGINAMIC
 *
 */
public class AffichageForme {

	/** Affiche les caractéristiques de la forme passée en paramètre
	 * @param form forme
	 */
	public void afficher(Forme form) {
		System.out.println("Périmètre de la forme: " + form.calculerPerimetre());
		System.out.println("Surface de la forme: " + form.calculerSurface());
	}
}
