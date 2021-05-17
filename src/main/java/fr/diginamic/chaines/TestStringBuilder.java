package fr.diginamic.chaines;

/**
 * Classe qui compare les performances d'une concaténation avec le caractère +
 * et une concaténation avec StringBuilder
 * 
 * @author RichardBONNAMY
 *
 */
public class TestStringBuilder {
	
	/** Point d'entrée
	 * @param args arguments
	 */
	public static void main(String[] args) {

		System.out.println("Utilisation du StringBuilder :");
		long milestone0 = System.currentTimeMillis();
		
		StringBuilder builder = new StringBuilder();
		for (int i=0; i<100000; i++) {
			builder.append(i);
		}
		String resultat = builder.toString();
		long milestone1 = System.currentTimeMillis();
		System.out.println("temps d'exécution: "+ (milestone1-milestone0)+" ms");
		
		System.out.println("Utilisation de l'opérateur + :");
		long milestone2 = System.currentTimeMillis();
		
		resultat = "";
		for (int i=0; i<100000; i++) {
			resultat+=i;
		}
		
		long milestone3 = System.currentTimeMillis();
		System.out.println("temps d'exécution: "+ (milestone3-milestone2)+" ms");
	}
}
