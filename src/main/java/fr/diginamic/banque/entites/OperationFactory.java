package fr.diginamic.banque.entites;

public class OperationFactory {

	public static Operation getInstance(int type, double montant, String date) {
		if (type==1) {
			return new Credit(montant, date);
		}
		else if (type==2) {
			return new Debit(montant, date);
		}
		return null;
	}
}
