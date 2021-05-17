package fr.diginamic.banque;

import fr.diginamic.banque.entites.Operation;
import fr.diginamic.banque.entites.OperationFactory;

public class TestOperation {

	public static void main(String[] args) {
		Operation[] operations = new Operation[4];
		operations[0] = OperationFactory.getInstance(1, 800.0, "01/01/2021");
		operations[1] = OperationFactory.getInstance(2, 100.0, "02/01/2021");
		operations[2] = OperationFactory.getInstance(1, 1500.0, "03/01/2021");
		operations[3] = OperationFactory.getInstance(2, 750.0, "04/01/2021");

		double somme = 0.0;
		for (int i=0; i<operations.length; i++) {
			System.out.println(operations[i]);
			
			if (operations[i].getType().equals("CREDIT")) {
				somme += operations[i].getMontant();
			}
			else {
				somme -= operations[i].getMontant();
			}
		}
		System.out.println("Le montant global est de "+somme+" €");
	}

}
