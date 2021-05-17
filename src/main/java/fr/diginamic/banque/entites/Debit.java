package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(double montant, String date) {
		super(montant, date);
	}

	@Override
	public String getType() {
		return "DEBIT";
	}

}
