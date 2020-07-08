package sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * 
 */
public class TestSetDouble {

	public static void main(String[] args) {
		HashSet<Double> set = new HashSet<>();
		set.addAll(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));

		// Affichez tous les éléments de la collection
		for (Double valeur : set) {
			System.out.print(valeur + " ");
		}
		System.out.println();
		System.out.println("--------------------------------------------------");

		// Recherchez le plus grand élément de la collection
		double max = Collections.max(set); // plus petite valeur des Double
		double min = Collections.min(set); // plus grande valeur des Double

		System.out.println("Mon maximum est : " + max);
		System.out.println("Mon minimum est : " + min);

		// Supprimez le plus petit élément de la collection
		set.remove(min);

		System.out.println("--------------------------------------------------");
		// Affichez enfin le contenu de la collection ainsi modifiée
		for (Double valeur : set) {
			System.out.print(valeur + " ");
		}
	}

}
