package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestPays {

	public static void main(String[] args) {
		List<Pays> listePays = new ArrayList<>();
		listePays.add(new Pays("France", 65, "Europe"));
		listePays.add(new Pays("Allemagne", 81, "Europe"));
		listePays.add(new Pays("USA", 340, "Amérique"));
		listePays.add(new Pays("Belgique", 10, "Europe"));
		listePays.add(new Pays("Espagne", 41, "Europe"));
		listePays.add(new Pays("Canada", 37, "Amérique"));
		
		// Première méthode
		// Pour que ça fonctionne, il faut que Pays implemente Comparable. Le critère de tri
        // est fourni par une méthode compareTo de la classe Pays.
		Collections.sort(listePays); 
		
		for (Pays pays: listePays){
			System.out.println(pays);
		}

		System.out.println("---------------2nde méthode -------------------");
		
		// Seconde méthode
		Collections.sort(listePays, new ComparatorPop(ComparatorPop.ASC, ComparatorPop.CRITERE_POPULATION));
		
		for (Pays pays: listePays){
			System.out.println(pays);
		}
		
		System.out.println("---------------2nde méthode avec autre critère -------------------");
		
		// Seconde méthode
		Collections.sort(listePays, new ComparatorPop(ComparatorPop.DESC, ComparatorPop.CRITERE_NOM));
		
		for (Pays pays: listePays){
			System.out.println(pays);
		}
		
		System.out.println("---------------Aggrégation -------------------");
		
		// Dans une agrégation, le critère d'agrégation est toujours la clé et la valeur
		// d'agrégation est toujours la valeur.
		
		// Map avec le continent en clé et la population agrégée en valeur
		Map<String, Integer> mapContinents = new HashMap<>();
		for (Pays pays : listePays){
			String continent = pays.getContinent();
			Integer population = mapContinents.get(continent);
			if (population==null){
				mapContinents.put(continent, 0);
				population = mapContinents.get(continent);
			}
			population += pays.getPop();
			mapContinents.put(continent, population);
		}
		Set<String> listeContinents = mapContinents.keySet();
		for (String continent: listeContinents){
			System.out.println("Continent : " + continent + " / Population :" + mapContinents.get(continent));
		}
	}

}
