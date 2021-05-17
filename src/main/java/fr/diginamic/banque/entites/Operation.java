package fr.diginamic.banque.entites;

public abstract class Operation {

	private double montant;
	private String date;
	
	public Operation(double montant, String date) {
		super();
		this.montant = montant;
		this.date = date;
	}
	
	public abstract String getType();
	
	@Override
	public String toString() {
		return getType()+" - Date: "+date+" : "+montant;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
