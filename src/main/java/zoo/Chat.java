package zoo;

public class Chat extends Mammifere implements ChasseurNocturne, AnimalFamilier {
	
	private String nom;
	
	
	public String toString(){
		return nom;
	}

	public void miauler(){
		System.out.println("Je sais miauler");
	}

	@Override
	public void seNourrir() {
		System.out.println("Je chasse les petits rongeurs, les oiseaux.");
		
	}

	@Override
	public void chasser() {
		System.out.println("Le chat dispose d'une vision nocturne,...");
		
	}

	@Override
	public void comportementHumain() {
		System.out.println("Bla bla");
		
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
