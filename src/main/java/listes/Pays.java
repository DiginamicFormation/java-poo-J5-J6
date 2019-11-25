package listes;

public class Pays implements Comparable<Pays> {

	// Paramètre fonctionnel: ont un sens conceptuel
	private String nom;
	private int pop;
	private String continent;
	
	public Pays(String nom, int pop, String continent){
		this.nom = nom;
		this.pop = pop;
		this.continent = continent;
	}
	
	@Override
	public int compareTo(Pays o) {
		
		if (this.pop > o.getPop()){
			return -1;
		}
		else if (this.pop < o.getPop()){
			return 1;
		}
		return 0;
	}
	
	public String toString(){
		return nom + " " + pop +" millions d'habitants.";
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

	/** Getter
	 * @return the pop
	 */
	public int getPop() {
		return pop;
	}

	/** Setter
	 * @param pop the pop to set
	 */
	public void setPop(int pop) {
		this.pop = pop;
	}

	/** Getter
	 * @return the continent
	 */
	public String getContinent() {
		return continent;
	}

	/** Setter
	 * @param continent the continent to set
	 */
	public void setContinent(String continent) {
		this.continent = continent;
	}

	
}
