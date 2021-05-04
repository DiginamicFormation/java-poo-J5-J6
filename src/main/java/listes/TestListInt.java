package listes;

import java.util.ArrayList;

/**
 * Dans cette classe instanciez une ArrayList d’entiers et placez y les éléments suivants :
 *  -1, 5, 7, 3, -2, 4, 8, 5
 * - Affichez tous les éléments de la liste
 * - Affichez la taille de la liste
 * - Recherchez et affichez le plus grand élément de la liste
 * - Supprimez le plus petit élément de la liste et affichez le résultat
 * - Recherchez tous les éléments négatifs et modifiez les de manière à ce qu’ils deviennent positifs.
 * - Affichez enfin la liste résultante
 *
 */
public class TestListInt {

    public static void main(String[] args) {
    	ArrayList<Integer> listeEntiers = new ArrayList<>();
    	listeEntiers.add(-1);
    	listeEntiers.add(5);
    	listeEntiers.add(7);
    	listeEntiers.add(3);
    	listeEntiers.add(-2);
    	listeEntiers.add(4);
    	listeEntiers.add(8);
    	listeEntiers.add(5);
    	
    	System.out.println("Affichage de tous les éléments de la liste :");
    	for (int i=0; i<listeEntiers.size(); i++) {
    		System.out.println(listeEntiers.get(i));
    	}
    	
    	System.out.println("--------------------------------------------");
    	
    	System.out.println("La taille de la liste est :"+listeEntiers.size());
    	
    	System.out.println("--------------------------------------------");
    	int max = listeEntiers.get(0);
    	for (int i=1; i<listeEntiers.size(); i++) {
    		int nb = listeEntiers.get(i);
    		if (nb > max) {
    			max = nb;
    		}
    	}
    	System.out.println("Le maximum dans la liste est :"+max);
    	
    	System.out.println("--------------------------------------------");
    	int min = listeEntiers.get(0);
    	int indexMin = 0;
    	for (int i=1; i<listeEntiers.size(); i++) {
    		int nb = listeEntiers.get(i);
    		if (nb < min) {
    			min = nb;
    			indexMin = i;
    		}
    	}
    	System.out.println("L'élément le plus petit de la liste est "+min+". Cet élémént va être supprimé.");
    	
    	listeEntiers.remove(indexMin);
    	
    	System.out.println("Affichage de tous les éléments restants de la liste :");
    	for (int i=0; i<listeEntiers.size(); i++) {
    		System.out.println(listeEntiers.get(i));
    	}
    	
    	System.out.println("--------------------------------------------");
    	System.out.println("Traitement pour rendre tous les éléments de la liste positifs.");
    	for (int i=0; i<listeEntiers.size(); i++) {
    		int nb = listeEntiers.get(i);
    		if (nb < 0) {
    			listeEntiers.set(i, -nb);
    		}
    	}
    	
    	System.out.println("Affichage de tous les éléments de la liste après traitement :");
    	for (int i=0; i<listeEntiers.size(); i++) {
    		System.out.println(listeEntiers.get(i));
    	}
    }
}