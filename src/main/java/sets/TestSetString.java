package sets;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 */
public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.addAll(Set.of("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));

		// Recherchez le pays dans cette liste qui a le plus grand nombre de lettres

		String paysMaxLettres = set.iterator().next(); // pays de référence

		for (String nom : set) {
			if (nom.length() > paysMaxLettres.length()) {
				paysMaxLettres = nom;
			}
		}
		System.out.println("Pays avec le max de lettres:" + paysMaxLettres);

		System.out.println("-------------------------------------------------");
		// Supprimez ce pays
		set.remove(paysMaxLettres);

		// Affichez enfin le contenu de la collection ainsi modifiée
		for (String nom : set) {
			System.out.println(nom);
		}
		
		List<String> list = List.of("Xebia", "love", "Java");
		
		// Peut aussi s'écrire
		var otherList = List.of("Xebia", "love", "Java");
	}

}
