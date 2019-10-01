package fr.diginamic.banque.services;

import java.util.Scanner;

import fr.diginamic.banque.daos.CompteDao;
import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.exception.ExceptionFonctionnelle;

/** Traite le cas d'utilisation d'ajout d'une opération à un compte bancaire
 * @author DIGINAMIC
 *
 */
public class AjouterOperationService extends CompteMenuService {

	@Override
	public void traiter(Scanner scanner, CompteDao dao) throws ExceptionFonctionnelle {
		System.out.println("Liste des comptes");
		Compte[] comptes = dao.lister();
		for (int i=0; i<comptes.length; i++){
			System.out.println(comptes[i]);
		}
		System.out.println("Ajout d’une opération à un compte");
		System.out.println("Veuillez saisir le numéro de compte concerné:");
		String numero = scanner.nextLine();
		
		Compte compte = dao.getCompte(numero);
		if (compte!=null){
			
			System.out.println("Veuillez saisir le type d'opération (1: CREDIT, 2: DEBIT):");
			String type = scanner.nextLine();
			
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
				throw new ExceptionFonctionnelle("Le type d'opération "+type+" n'existe pas.");
			}
		}
		else {
			throw new ExceptionFonctionnelle("Le compte "+numero+" n'existe pas.");
		}

	}

}
