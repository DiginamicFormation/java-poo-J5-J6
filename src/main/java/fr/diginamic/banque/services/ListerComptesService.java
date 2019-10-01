package fr.diginamic.banque.services;

import java.util.Scanner;

import fr.diginamic.banque.daos.CompteDao;
import fr.diginamic.banque.entites.Compte;

/** Traite le cas d'utilisation d'affichage de tous les comptes
 * @author DIGINAMIC
 *
 */
public class ListerComptesService extends CompteMenuService {

	@Override
	public void traiter(Scanner scanner, CompteDao dao) {
		System.out.println("Liste des comptes");
		Compte[] comptes = dao.lister();
		for (int i=0; i<comptes.length; i++){
			System.out.println(comptes[i]);
		}
		
	}

}
