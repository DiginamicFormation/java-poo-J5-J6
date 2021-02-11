package variables;

public class AdressePostale {
	int numeroRue;
	String libelleRue;
	int codePostal;
	String ville;
	
	public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
		super();
		this.numeroRue = numeroRue; // affectation
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}
}
