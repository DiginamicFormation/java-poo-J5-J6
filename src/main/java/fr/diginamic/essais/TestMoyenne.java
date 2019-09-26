package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

/** Test de la classe Operations
 * @author DIGINAMIC
 *
 */
public class TestMoyenne {
	
	/** Point d'entrée
	 * @param args arguments
	 */
	public static void main(String[] args) {
		CalculMoyenne calculateurMoyenne = new CalculMoyenne();
	
		calculateurMoyenne.ajout(17);
		calculateurMoyenne.ajout(15);
		calculateurMoyenne.ajout(16);

		double result = calculateurMoyenne.calcul();
		System.out.println("Voici la moyenne: " + result);

	}

}
