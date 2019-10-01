package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;
import fr.diginamic.banque.enumeration.CategorieCompte;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte[] comptes = new Compte[2];
		
		Compte compte = new Compte("1", 256.5, CategorieCompte.NORMAL);
		comptes[0]=compte;
		
		compte.ajouterOperation(new Debit("12/09/2019", 100));
		compte.ajouterOperation(new Credit("13/09/2019", 150));
		compte.ajouterOperation(new Credit("13/09/2019", 125));
		
		System.out.println("Solde des opérations débitrices sur le compte "+compte.getNumero()+" : "+compte.getSolde(Operation.TYPE_DEBIT));
		System.out.println("Solde des opérations créditrices sur le compte "+compte.getNumero()+" : "+compte.getSolde(Operation.TYPE_CREDIT));
		
		CompteTaux compteTaux = new CompteTaux("2", 1545, 0.75);
		comptes[1]=compteTaux;
		
		double solde = 0.0;
		for (int i=0; i<comptes.length; i++){
			System.out.println(comptes[i]);
			solde+=comptes[i].getSolde();
		}
		System.out.println(solde);
		
		

	}

}
