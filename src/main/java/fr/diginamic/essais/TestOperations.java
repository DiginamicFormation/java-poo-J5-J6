package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

/** Test de la classe Operations
 * @author DIGINAMIC
 *
 */
public class TestOperations {

	/** Point d'entrée
	 * @param args arguments
	 */
	public static void main(String[] args) {

		System.out.println(Operations.calcul(10, 2, '+'));
		System.out.println(Operations.calcul(10, 2, '-'));
		System.out.println(Operations.calcul(10, 2, '*'));
		System.out.println(Operations.calcul(10, 2, '/'));
		System.out.println(Operations.calcul(10, 2, '$'));

	}

}
