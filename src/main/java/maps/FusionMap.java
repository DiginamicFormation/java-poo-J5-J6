package maps;

import java.util.HashMap;

/**
 * Exercice de fusion de 2 maps
 * 
 * @author DIGINAMIC
 *
 */
public class FusionMap {
	/**
	 * Méthode exécutable
	 * 
	 * @param args arguments de la méthode
	 */
	public static void main(String args[]) {
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");

		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");

		// TODO Créer une map appelée map3 et qui contient les données des 2
		// maps précédentes avec les mêmes clés et les mêmes valeurs

	}
}