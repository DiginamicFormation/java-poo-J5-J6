package listes;

import java.util.ArrayList;

/**
 * Dans la méthode main, créez une ArrayList d’entiers et stockez-y tous les nombres de 1
 * à 100. 
 * Affichez la taille de la liste en utilisant la méthode de la classe ArrayList fournissant cette
 * information.
 *
 */
public class CreationListe {

	public static void main(String[] args) {
		ArrayList<Integer> listeEntiers = new ArrayList<>();
		
		for (int i=1; i<=100; i++) {
			listeEntiers.add(i);
		}

		System.out.println("Taille de la liste : "+listeEntiers.size());
	}

}
