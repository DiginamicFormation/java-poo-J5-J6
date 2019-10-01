package fr.diginamic.banque.services;

import java.util.Scanner;

import fr.diginamic.banque.daos.CompteDao;
import fr.diginamic.banque.exception.ExceptionFonctionnelle;

/** Traite le cas d'utilisation de suppression d'un compte
 * @author DIGINAMIC
 *
 */
public class SupprimerCompteService extends CompteMenuService {

	@Override
	public void traiter(Scanner scanner, CompteDao dao) throws ExceptionFonctionnelle {
		System.out.println("Suppression d’un compte");
		System.out.println("Veuillez saisir le numéro du compte à supprimer:");
		String numero = scanner.nextLine();
		boolean result = dao.supprimer(numero);
		if (!result){
			throw new ExceptionFonctionnelle("Le compte "+numero+" n'existe pas");
		}

	}

}
