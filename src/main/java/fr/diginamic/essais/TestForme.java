package fr.diginamic.essais;

import fr.diginamic.formes.AffichageForme;
import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

/** Test de la classe AffichageForme avec 3 formes différentes
 * @author DIGINAMIC
 *
 */
public class TestForme {

	/** Point d'entrée
	 * @param args arguments
	 */
	public static void main(String[] args) {
		Cercle cer = new Cercle(10);
		Rectangle rect = new Rectangle(4, 5);
		Carre car = new Carre(5);
		
		AffichageForme aff = new AffichageForme();
		aff.afficher(cer);
		aff.afficher(rect);
		aff.afficher(car);

	}

}
