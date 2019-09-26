package fr.diginamic.essais;

/** Tests autour de la manipulation d'une chaine de caractères
 * @author DIGINAMIC
 *
 */
public class ManipulationChaine {

	/** Point d'entrée
	 * @param args arguments
	 */
	public static void main(String[] args) {
		String chaine = "Durand;Marcel;012543;23.5";

		// Dans une chaine de caractères, chaque caractères à un index, comme
		// dans un tableau.
		// Le premier caractères est à l'index 0
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		
		System.out.println("Longueur de la chaine: " + chaine.length());
		
		System.out.println("Index du premier caractère ; :"+ chaine.indexOf(';'));

		// retrouver le nom de famille de la personne avec indexOf et substring
		int indexPointVirgule = chaine.indexOf(';');
		String nomDeFamille = chaine.substring(0, indexPointVirgule);
		System.out.println("Le nom de famille est:" + nomDeFamille);

		// La méthode toUpperCase() permet de mettre une chaine de caractères en
		// majuscules
		// Exemple:
		System.out.println("Affichage du nom en MAJUSCULES: " + nomDeFamille.toUpperCase());

		// La méthode toLowerCase() permet de mettre une chaine de caractères en
		// minuscules
		// Exemple:
		System.out.println("Affichage du nom en minuscules: " + nomDeFamille.toLowerCase());

		// La méthode split permet de découper une chaine de caractères en
		// morceaux sur la base
		// d'un séparateur

		String[] morceaux = chaine.split(";");
		for (int i = 0; i < morceaux.length; i++) {
			System.out.println("Morceaux n°" + i + " : " + morceaux[i]);
		}
	}

}
