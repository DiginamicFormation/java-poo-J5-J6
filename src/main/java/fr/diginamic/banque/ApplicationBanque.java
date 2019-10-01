/**
 * 
 */
package fr.diginamic.banque;

import java.util.Scanner;

import fr.diginamic.banque.daos.CompteDao;
import fr.diginamic.banque.daos.CompteDaoMem;
import fr.diginamic.banque.exception.ExceptionFonctionnelle;
import fr.diginamic.banque.services.AjouterCompteService;
import fr.diginamic.banque.services.AjouterOperationService;
import fr.diginamic.banque.services.ListerComptesService;
import fr.diginamic.banque.services.SupprimerCompteService;

/** Point d'entrée de l'application de gestion des comptes
 * @author DIGINAMIC
 *
 */
public class ApplicationBanque {

	/** Point d'entrée
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CompteDao dao = new CompteDaoMem();
		
		int choix = 0;
		do {

			// Affichage du menu
			afficherMenu();

			// Poser une question à l'utilisateur
			String choixMenu = scanner.nextLine();
			
			// Conversion du choix utilisateur en int
			choix = Integer.parseInt(choixMenu);
			
			// On exécute l'option correspondant au choix de l'utilisateur
			switch (choix){
			case 1:
				ListerComptesService lister = new ListerComptesService();
				lister.traiter(scanner, dao);
				break;
			case 2:
				try {
					AjouterCompteService ajouter = new AjouterCompteService();
					ajouter.traiter(scanner, dao);
				} catch (ExceptionFonctionnelle e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					AjouterOperationService ajouterOpe = new AjouterOperationService();
					ajouterOpe.traiter(scanner, dao);
				} catch (ExceptionFonctionnelle e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				try {
					SupprimerCompteService supprimer = new SupprimerCompteService();
					supprimer.traiter(scanner, dao);
				} catch (ExceptionFonctionnelle e) {
					System.out.println(e.getMessage());
				}
				break;
			case 99:
				System.out.println("Au revoir \u2639");
				break;
			}
		} while (choix!=99);
		
		scanner.close();
		
	}
	
	/**
	 * Affichage du menu
	 */
	private static void afficherMenu() {
		System.out.println("***** Administration des comptes *****");
		System.out.println("1. Lister les comptes");
		System.out.println("2. Ajouter un nouveau compte ");
		System.out.println("3. Ajouter une opération à un compte");
		System.out.println("4. Supprimer un compte");
		System.out.println("99. Sortir");
		System.out.println("Veuillez effectuer un choix:");
	}

}
