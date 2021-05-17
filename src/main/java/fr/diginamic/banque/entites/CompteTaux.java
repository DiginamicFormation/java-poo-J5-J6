package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private double tauxRemu;

	public CompteTaux(String numero, double solde, double tauxRemu) {
		super(numero, solde);
		this.tauxRemu = tauxRemu;
	}
	
	@Override
	public String toString() {
		String infosClasseMere = super.toString();
		return infosClasseMere + " - taux de rémunération : "+tauxRemu;
	}
	
	public double getTauxRemu() {
		return tauxRemu;
	}

	public void setTauxRemu(double tauxRemu) {
		this.tauxRemu = tauxRemu;
	}

	
}
