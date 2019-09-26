/**
 * 
 */
package fr.diginamic.banque;

import java.util.Scanner;

import fr.diginamic.banque.daos.ClientDao;
import fr.diginamic.banque.daos.ClientDaoMem;
import fr.diginamic.banque.entites.Client;
import fr.diginamic.banque.entites.Compte;

/**
 * @author DIGINAMIC
 *
 */
public class ApplicationBanque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ClientDao dao = new ClientDaoMem();
		
		int choix = 0;
		do {

			// Affichage du menu
			afficherMenu();

			// Poser une question à l'utilisateur
			String choixMenu = scanner.next();
			
			// Conversion du choix utilisateur en int
			choix = Integer.parseInt(choixMenu);
			
			// On exécute l'option correspondant au choix de l'utilisateur
			switch (choix){
			case 1:
				Client[] clients = dao.lister();
				for (int i=0; i<clients.length; i++){
					System.out.println(clients[i]);
				}
				break;
			case 2:
				System.out.println("Veuillez saisir un nom:");
				String nom = scanner.next();
			
				System.out.println("Veuillez saisir un prénom:");
				String prenom = scanner.next();
				
				System.out.println("Veuillez saisir un numéro de compte:");
				String numero = scanner.next();
				
				System.out.println("Veuillez saisir un solde initial:");
				String saisieSolde = scanner.next();
				double soldeInitial = Double.parseDouble(saisieSolde);
				
				Compte compte = new Compte(numero, soldeInitial);
				
				Client client = new Client(nom, prenom);
				client.ajouterCompte(compte);

				dao.sauvegarder(client);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			}
		} while (choix!=99);
		
		scanner.close();
		
	}
	
	/**
	 * Affichage du menu
	 */
	private static void afficherMenu() {
		System.out.println("***** Administration bancaire *****");
		System.out.println("1. Lister les clients");
		System.out.println("2. Ajouter un nouveau client ");
		System.out.println("3. Mettre à jour un client");
		System.out.println("4. Supprimer un client");
		System.out.println("99. Sortir");
	}

}
