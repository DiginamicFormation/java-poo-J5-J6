package fr.diginamic.banque.services;

import java.util.Scanner;

import fr.diginamic.banque.daos.CompteDao;
import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;
import fr.diginamic.banque.enumeration.CategorieCompte;
import fr.diginamic.banque.exception.ExceptionFonctionnelle;

/** Traite le cas d'utilisation d'ajout d'un compte
 * @author DIGINAMIC
 *
 */
public class AjouterCompteService extends CompteMenuService {

	@Override
	public void traiter(Scanner scanner, CompteDao dao) throws ExceptionFonctionnelle {
		System.out.println("Ajout d’un nouveau compte");
		System.out.println("Veuillez saisir un numéro:");
		String numero= scanner.nextLine();
	
		System.out.println("Veuillez saisir un type de compte (1: NORMAL, 2: REMUNERE):");
		String type = scanner.nextLine();
		
		System.out.println("Veuillez saisir un solde initial:");
		String saisieSolde = scanner.nextLine();
		double soldeInitial = Double.parseDouble(saisieSolde);
		
		if (type.equals("1")){
			Compte nvCompte = new Compte(numero, soldeInitial, CategorieCompte.NORMAL);
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
			throw new ExceptionFonctionnelle("Le type de compte "+type+" n'existe pas.");
		}

	}

}
