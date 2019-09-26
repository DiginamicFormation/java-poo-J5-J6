package maps;

import java.util.HashMap;

/**
 * Exercice de manipulation d'une map
 * 
 * @author DIGINAMIC
 *
 */
public class CreationEtManipulationMap {
	/**
	 * Méthode exécutable
	 * 
	 * @param args arguments de la méthode
	 */
	public static void main(String args[]) {
		// Création d'une map qui permet de stocker les noms des préfectures en fonction du
		// numéro de département
		HashMap<Integer, String> mapVilles = new HashMap<Integer, String>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");

		//TODO 1. Ajouter les informations pour Lille, Lyon et Bordeaux
		//TODO 2. Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map
		//TODO 3. Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
		//TODO 4. Afficher la taille de la map
	}
}