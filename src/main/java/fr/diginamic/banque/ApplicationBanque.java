/**
 * 
 */
package fr.diginamic.banque;

import fr.diginamic.banque.entites.Client;
import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

/**
 * @author DIGINAMIC
 *
 */
public class ApplicationBanque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Client client = new Client("Paul", "Durand");
		
		Compte compte1 = new Compte("123456", 125.5);
		client.ajouterCompte(compte1);
		
		Compte compte2 = new Compte("098765", 254.3);
		compte2.ajouterOperation(new Credit("01/09/2019", 145.0));
		compte2.ajouterOperation(new Credit("02/09/2019", 155.0));
		compte2.ajouterOperation(new Debit("03/09/2019", -25.0));
		compte2.ajouterOperation(new Debit("04/09/2019", -17.0));
		client.ajouterCompte(compte2);
		
		System.out.println(compte1);
		System.out.println(compte2);
		System.out.println(compte2.getSolde(Operation.TYPE_CREDIT));
		System.out.println(compte2.getSolde(Operation.TYPE_DEBIT));
		System.out.println(client);
		
	}

}
