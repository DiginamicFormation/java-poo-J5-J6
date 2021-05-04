package maps;

import java.util.HashMap;
import java.util.Iterator;

public class MapVilles {

	public static void main(String[] args) {
		
		HashMap<String, Ville> mapVilles = new HashMap<>();
		mapVilles.put("Nice", new Ville("Nice", 343_000, "06"));
		mapVilles.put("Carcassonne",new Ville("Carcassonne", 47_800, "66"));
		mapVilles.put("Narbonne", new Ville("Narbonne", 53_400, "66"));
		mapVilles.put("Lyon", new Ville("Lyon", 484_000, "69"));
		mapVilles.put("Foix", new Ville("Foix", 9_700, "09"));
		mapVilles.put("Pau", new Ville("Pau", 77_200, "64"));
		mapVilles.put("Marseille", new Ville("Marseille", 850_700, "13"));
		mapVilles.put("Tarbes", new Ville("Tarbes", 40_600, "64"));
		
		Iterator<Ville> iterVilles = mapVilles.values().iterator();
		int nbHabMin = Integer.MAX_VALUE;
		Ville selected = null;
		while (iterVilles.hasNext()) {
			Ville ville = iterVilles.next();
			if (ville.getNbHabitants() < nbHabMin) {
				nbHabMin = ville.getNbHabitants();
				selected = ville;
			}
		}
		System.out.println("Ville qui a le moins d'habitants est "+selected);
		
		// Suppression à partir de la clé de stockage
		mapVilles.remove(selected.getNom());
		
		// Affichage des villes restantes
		for (Ville ville : mapVilles.values()) {
			System.out.println(ville);
		}

	}

}
