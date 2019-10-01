package fr.diginamic.banque.services;

import java.util.Scanner;

import fr.diginamic.banque.daos.CompteDao;
import fr.diginamic.banque.exception.ExceptionFonctionnelle;

/** Représente la classe abstraite de tous les services bancaires
 * @author DIGINAMIC
 *
 */
public abstract class CompteMenuService {

	/** Traite le cas d'utilisation avec les ressources indispensables à sa bonne exécution
	 * @param scanner scanner pour interagir avec l'utilisateur
	 * @param dao pour stocker les comptes
	 * @throws ExceptionFonctionnelle en cas d'erreur de saisie de l'utilisateur
	 */
	public abstract void traiter(Scanner scanner, CompteDao dao) throws ExceptionFonctionnelle;
}
