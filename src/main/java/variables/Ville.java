package variables;

/**
 * @author RichardBONNAMY
 *
 */
public class Ville implements Comparable<Ville> {

	private String codeRegion;
	private String nomRegion;
	private String codeDepartement;
	private String codeCommune;
	private String nomCommune;
	private int populationTotale;
	
	/** Constructeur
	 * @param codeRegion
	 * @param nomRegion
	 * @param codeDepartement
	 * @param codeCommune
	 * @param nomCommune
	 * @param populationTotale
	 */
	public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune,
			int populationTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationTotale = populationTotale;
	}
	
	@Override
	public int compareTo(Ville autre) {
		if (this.populationTotale > autre.getPopulationTotale()) {
			return -1;
		}
		else if (this.populationTotale < autre.getPopulationTotale()){
			return 1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "nomCommune=" + nomCommune + " - populationTotale=" + populationTotale;
	}
	

	/** Getter
	 * @return the codeRegion
	 */
	public String getCodeRegion() {
		return codeRegion;
	}

	/** Setter
	 * @param codeRegion the codeRegion to set
	 */
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	/** Getter
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/** Setter
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	/** Getter
	 * @return the codeDepartement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}

	/** Setter
	 * @param codeDepartement the codeDepartement to set
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	/** Getter
	 * @return the codeCommune
	 */
	public String getCodeCommune() {
		return codeCommune;
	}

	/** Setter
	 * @param codeCommune the codeCommune to set
	 */
	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	/** Getter
	 * @return the nomCommune
	 */
	public String getNomCommune() {
		return nomCommune;
	}

	/** Setter
	 * @param nomCommune the nomCommune to set
	 */
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	/** Getter
	 * @return the populationTotale
	 */
	public int getPopulationTotale() {
		return populationTotale;
	}

	/** Setter
	 * @param populationTotale the populationTotale to set
	 */
	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}

}
