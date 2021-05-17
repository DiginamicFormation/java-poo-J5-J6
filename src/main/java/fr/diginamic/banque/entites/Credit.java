package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(double montant, String date) {
		super(montant, date);
	}

	@Override
	public String getType() {
		return "CREDIT";
	}
}
