package tri;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<>();
		liste.add("Nice");
		liste.add("Carcassonne");
		liste.add("Narbonne");
		liste.add("Lyon");
		liste.add("Foix");
		liste.add("Pau");
		liste.add("Marseille");
		liste.add("Tarbes");

		// Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
		String ref = liste.get(0);

		for (int i = 0; i < liste.size(); i++) {
			String ville = liste.get(i);
			if (ville.length() > ref.length()) {
				ref = ville;
			}
		}
		System.out.println(ref);

		for (int i = 0; i < liste.size(); i++) {
			liste.set(i, liste.get(i).toUpperCase());
		}
		System.out.println(liste);
		
		Iterator<String> iterator = liste.iterator();
		while (iterator.hasNext()) {
			String ville = iterator.next();
			if (ville.charAt(0)=='N') {
				iterator.remove();
			}
		}
		
		System.out.println(liste);

	}

}
