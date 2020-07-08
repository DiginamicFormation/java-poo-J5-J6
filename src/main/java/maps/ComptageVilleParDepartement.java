package maps;

import java.util.HashMap;
import java.util.List;

public class ComptageVilleParDepartement {

	public static void main(String[] args) {
		
		List<Ville> liste = VilleUtils.getVilles();

		// Comptage du nombre de villes par département.
		
		// Etape 1: création d'une HashMap qui stocke:
		// - en clé: le département (type String)
		// - en valeur: le compteur (type Integer)
		HashMap<String, Integer> map = new HashMap<>();

		// Etape 2: parcours de la liste des villes
		for (Ville v : liste) {

			// Etape 3: on regarde s'il existe un compteur
			//          pour le département de la ville
			Integer compteur = map.get(v.getDepartement());

			// Etape 4: s'il n'existe pas on créé le compteur avec la valeur 1
			if (compteur==null) {
				map.put(v.getDepartement(), 1);
			}
			// Etape 5: s'il existe on l'incrémente et on le restocke dans la map
			//          avec sa nouvelle valeur
			else {
				compteur++;
				map.put(v.getDepartement(), compteur);
			}
		}

	}

}
