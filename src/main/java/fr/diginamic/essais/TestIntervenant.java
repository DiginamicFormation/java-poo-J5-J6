package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

/** Test des classes Intervenant, Salarie et Pigiste
 * @author DIGINAMIC
 *
 */
public class TestIntervenant {

	/** Point d'entrée
	 * @param args arguments
	 */
	public static void main(String[] args) {

		Salarie salarie = new Salarie("Durand", "Paul", 2500);
		System.out.println("Salaire du salarié: "+salarie.getSalaire());
		
		Pigiste pigiste = new Pigiste("Untel", "Bob", 21, 250);
		System.out.println("Salaire du pigiste: "+pigiste.getSalaire());

		salarie.afficherDonnees();
		pigiste.afficherDonnees();
	}

}