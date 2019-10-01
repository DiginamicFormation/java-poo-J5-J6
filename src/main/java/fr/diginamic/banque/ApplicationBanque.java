/**
 * 
 */
package fr.diginamic.banque;

import java.util.Scanner;

import fr.diginamic.banque.daos.CompteDaoMem;
import fr.diginamic.banque.daos.CompteDao;
import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;

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
				System.out.println("Liste des comptes");
				Compte[] comptes = dao.lister();
				for (int i=0; i<comptes.length; i++){
					System.out.println(comptes[i]);
				}
				break;
			case 2:
				System.out.println("Ajout d’un nouveau compte");
				System.out.println("Veuillez saisir un numéro:");
				String numero= scanner.nextLine();
			
				System.out.println("Veuillez saisir un type de compte (1: NORMAL, 2: REMUNERE):");
				String type = scanner.nextLine();
				
				System.out.println("Veuillez saisir un solde initial:");
				String saisieSolde = scanner.nextLine();
				double soldeInitial = Double.parseDouble(saisieSolde);
				
				if (type.equals("1")){
					Compte nvCompte = new Compte(numero, soldeInitial);
					dao.sauvegarder(nvCompte);
				}
				else if (type.equals("2")){
					System.out.println("Veuillez saisir un taux:");
					String saisieTaux = scanner.nextLine();
					
					double taux = Double.parseDouble(saisieTaux);
					
					CompteTaux nvCompte = new CompteTaux(numero, soldeInitial, taux);
					dao.sauvegarder(nvCompte);
				}
				else {
					System.out.println("Le type de compte "+type+" n'existe pas.");
				}
				break;
			case 3:
				System.out.println("Ajout d’une opération à un compte");
				System.out.println("Veuillez saisir le numéro de compte concerné:");
				numero = scanner.nextLine();
				
				Compte compte = dao.getCompte(numero);
				if (compte!=null){
					
					System.out.println("Veuillez saisir le type d'opération (1: CREDIT, 2: DEBIT):");
					type = scanner.nextLine();
					
					System.out.println("Veuillez saisir la date:");
					String date = scanner.nextLine();
					
					System.out.println("Veuillez saisir le montant:");
					String saisieMontant = scanner.nextLine();
					double montant = Double.parseDouble(saisieMontant);
					
					if (type.equals("1")){
						Credit credit = new Credit(date, montant);
						compte.ajouterOperation(credit);
					}
					else if (type.equals("2")){
						Debit debit = new Debit(date, montant);
						compte.ajouterOperation(debit);
					}
					else {
						System.out.println("Le type d'opération "+type+" n'existe pas.");
					}
				}
				else {
					System.out.println("Le compte "+numero+" n'existe pas.");
				}
				break;
			case 4:
				System.out.println("Suppression d’un compte");
				System.out.println("Veuillez saisir le numéro du compte concerné:");
				numero = scanner.nextLine();
				boolean result = dao.supprimer(numero);
				if (!result){
					System.out.println("Le compte "+numero+" n'existe pas");
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
	}

}
