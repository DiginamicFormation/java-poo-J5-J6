package listes;
import java.util.*;

/**
 * Créez en utilisant des boucles une liste appelée liste3 et qui contient l’ensemble des
 * données des 2 listes précédentes.
 *
 */
public class FusionListe {
	
	public static void main(String[] args) {
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		List<String> liste3 = new ArrayList<String>();
		
		for (int i=0; i<liste1.size(); i++) {
			liste3.add(liste1.get(i));
		}
		
		for (int i=0; i<liste2.size(); i++) {
			liste3.add(liste2.get(i));
		}
		
		System.out.println("Affichage de la liste contenant tous les éléments:");
		for (int i=0; i<liste3.size(); i++) {
			System.out.println(liste3.get(i));
		}
	}
}