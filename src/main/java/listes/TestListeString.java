package listes;

import java.util.ArrayList;

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
		
		int max=0;
		String selection = null;
		for (int i=0; i<liste.size(); i++) {
			String nomVille = liste.get(i);
			if (nomVille.length() > max) {
				max = nomVille.length();
				selection = nomVille;
			}
		}
		System.out.println("Ville ayant le plus grand nb de lettres :"+selection);
		
		for (int i=0; i<liste.size(); i++) {
			String nomVille = liste.get(i);
			liste.set(i, nomVille.toUpperCase());
		}
		System.out.println(liste);
	}
}
