package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
	
	public static void main(String[] args) {
		
		Compte cptCourant = new Compte("FR000256211A54654", 15500.0);
		CompteTaux cptTaux = new CompteTaux("ABCDEF", 12300.0, 0.15);
		
		Compte[] comptes = {cptCourant, cptTaux};

		for (int i=0; i<comptes.length; i++) {
			System.out.println(comptes[i]);
		}

	}

}
