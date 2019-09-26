package fr.diginamic.operations;

/** Classe d'opérations
 * @author DIGINAMIC
 *
 */
public class Operations {

	/** Renvoie un calcul sur les 2 premiers paramètres (chiffres) en fonction du 3ème paramètre (opérateur)
	 * @param a premier chiffre
	 * @param b second chiffre
	 * @param op opérateur
	 * @return double
	 */
	public static double calcul(double a, double b, char op) {
		double resultat = 0;
		if (op == '-') {
			resultat = a - b;
		} else if (op == '+') {
			resultat = a + b;
		} else if (op == '*') {
			resultat = a * b;
		} else if (op == '/') {
			resultat = a / b;
		} 
		return resultat;
	}

}