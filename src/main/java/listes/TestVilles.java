package listes;

import java.util.ArrayList;

public class TestVilles {

	public static void main(String[] args) {
		ArrayList<Ville> villes = new ArrayList<>(); // <- position iterateur
		villes.add(new Ville("Nice", 343_000));
		villes.add(new Ville("Carcassonne", 47_800));
		villes.add(new Ville("Narbonne", 53_400));
		villes.add(new Ville("Lyon", 484_000));
		villes.add(new Ville("Foix", 9_700));
		villes.add(new Ville("Pau", 77_200));
		villes.add(new Ville("Marseille", 850_700));
		villes.add(new Ville("Tarbes", 40_600));

		// Recherche de la ville la plus peuplée
		// On prend pour référence la première ville de la liste
		Ville selection = villes.get(0);
		for (int i = 0; i < villes.size(); i++) {
			Ville ville = villes.get(i);
			
			// Si on trouve une ville dont la population est supérieure à la selection
			// alors la selection prend la valeur de cette ville
			if (ville.getNbHabitants() > selection.getNbHabitants()) {
				selection = ville; 
			}
		}
		System.out.printf("La ville la plus peuplée est %s%n", selection);
		System.out.println("-----------------------------------------------------");

		// Supprimez la ville la moins peuplée
		selection = villes.get(0);
		for (int i = 0; i < villes.size(); i++) {
			Ville ville = villes.get(i);
			if (ville.getNbHabitants() < selection.getNbHabitants()) {
				selection = ville;
			}
		}
		System.out.printf("La ville la moins peuplée est %s et va être supprimée%n", selection);
		villes.remove(selection);

		System.out.println("Affichage des villes restantes:");
		for (Ville v: villes) {
			System.out.println(v);
		}

		// Modifiez les villes de plus de 100 000 habitants en mettant leur nom en
		// majuscules
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < villes.size(); i++) {
			Ville ville = villes.get(i);
			if (ville.getNbHabitants() >= 100_000) {
				String nomVilleMaj = ville.getNom().toUpperCase();
				ville.setNom(nomVilleMaj);
			}
		}
		System.out.println("Affichage en majuscules des villes de plus de 100000 habitants:");
		for (Ville v: villes) {
			System.out.println(v);
		}
	}

}
