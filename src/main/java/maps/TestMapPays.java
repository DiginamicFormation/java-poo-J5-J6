package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import listes.Pays;

public class TestMapPays {

	public static void main(String[] args) {
		HashMap<String, Pays> mapPays = new HashMap<>();
		mapPays.put("France", new Pays("France", 65, "Europe"));
		mapPays.put("Allemagne", new Pays("Allemagne", 81, "Europe"));
		mapPays.put("USA", new Pays("USA", 340, "Amérique"));
		mapPays.put("Belgique", new Pays("Belgique", 10, "Europe"));
		mapPays.put("Espagne", new Pays("Espagne", 41, "Europe"));
		mapPays.put("Canada", new Pays("Canada", 37, "Amérique"));
		
		System.out.println("--- Affichage du pays dont la clé est Belgique");
		System.out.println(mapPays.get("Belgique"));

		System.out.println("--- Boucle pour afficher toutes les clés et leur valeur / en partant des clés");
		Set<String> listeCles = mapPays.keySet();
		for (String cle: listeCles){
			System.out.println("Clé : " + cle + " / Valeur :" + mapPays.get(cle));
		}
		
		System.out.println("--- Boucle pour afficher toutes les clés et leur valeur / en partant des valeurs");
	
		Collection<Pays> collPays = mapPays.values();
		for (Pays pays: collPays){
			System.out.println(pays);
			
		}
		
	}

}
