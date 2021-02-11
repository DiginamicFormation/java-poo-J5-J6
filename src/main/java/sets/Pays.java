package sets;

import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 * Pays : classe contenant un nom, un nb d'habitants et un PIB/habitant
 */
public class Pays {
	/** nom */
	private String nom;
	
	/** nbHabitants */
	private long nbHabitants;
	
	/** pibParHabitant */
	private long pibParHabitant;

	/**
	 * Constructor
	 * 
	 * @param continent      continent
	 * @param nom            nom
	 * @param nbHabitants
	 * @param pibParHabitant
	 */
	public Pays(String nom, int nbHabitants, int pibParHabitant) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibParHabitant = pibParHabitant;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (nbHabitants ^ (nbHabitants >>> 32));
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + (int) (pibParHabitant ^ (pibParHabitant >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Pays)) {
			return false;
		}
		
		Pays other = (Pays) obj; //downcasting
		
		// Utilisation de EqualsBuilder.
		EqualsBuilder builder = new EqualsBuilder();
		boolean resultat = builder.append(this.nom, other.getNom())
					      .append(this.nbHabitants, other.getNbHabitants())
					      .append(this.pibParHabitant, other.getPibParHabitant())
					      .isEquals();
		return resultat;
	}

	/**
	 * Fournit le calcul du PIB total
	 * 
	 * @return double
	 */
	public long getPibTotal() {
		return pibParHabitant * nbHabitants;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Getter
	 * 
	 * @return the nbHabitants
	 */
	public long getNbHabitants() {
		return nbHabitants;
	}

	/**
	 * Getter
	 * 
	 * @return the pibParHabitant
	 */
	public long getPibParHabitant() {
		return pibParHabitant;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Setter
	 * 
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(long nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	/**
	 * Setter
	 * 
	 * @param pibParHabitant the pibParHabitant to set
	 */
	public void setPibParHabitant(long pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}

	@Override
	public String toString() {
		return this.nom + " - PIB : " + this.pibParHabitant + "USD - Population : " + this.nbHabitants;
	}

}
