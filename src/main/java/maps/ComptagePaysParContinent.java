package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

import listes.Pays;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		HashMap<String, Pays> mapPays = new HashMap<>();
		mapPays.put("France", new Pays("France", 65, "Europe"));
		mapPays.put("Allemagne", new Pays("Allemagne", 80, "Europe"));
		mapPays.put("USA", new Pays("USA", 340, "Amérique"));
		mapPays.put("Indonésie", new Pays("Indonésie", 220, "Océanie"));
		mapPays.put("Belgique", new Pays("Belgique", 10, "Europe"));
		mapPays.put("Espagne", new Pays("Espagne", 41, "Europe"));
		mapPays.put("Canada", new Pays("Canada", 37, "Amérique"));
		mapPays.put("Russie", new Pays("Russie", 150, "Asie"));
		mapPays.put("Chine", new Pays("Chine", 1300, "Asie"));
		mapPays.put("Australie", new Pays("Australie", 220, "Océanie"));
		
		// La HashMap appelée comptage va stocker les compteurs (Integer) par continent (String)
		HashMap<String, Integer> comptage = new HashMap<>();
		
		Iterator<Pays> iterPays = mapPays.values().iterator();
		while (iterPays.hasNext()) {
			Pays pays = iterPays.next(); 
			
			String continent = pays.getContinent(); 
			Integer compteur = comptage.get(continent); 
			
			if (compteur==null) {
				comptage.put(continent, 1);
			}
			else {
				compteur++;
				comptage.put(continent, compteur);
			}
		}
		
		System.out.println(comptage);
		
		System.out.println(comptage.get("Mars"));
	}

}
