package fr.diginamic.banque.entites;

/** Représente un client
 * @author DIGINAMIC
 *
 */
public class Client {
	
	/** id : identifiant du client*/
	private int id;

	/** nom : String*/
	private String nom;
	
	/** prenom : String*/
	private String prenom;
	
	/** comptes : Compte[]*/
	private Compte[] comptes = new Compte[0];
	
	/** IDENTIFIANT : int*/
	private static int compteur=1;
	
	/** Constructeur
	 * @param nom nom 
	 * @param prenom prénom
	 */
	public Client(String nom, String prenom) {
		super();
		this.id=compteur++;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	/** Permet d'ajouter un compte
	 * @param compte compte
	 */
	public void ajouterCompte(Compte compte){
		
		// Création du nouveau tableau de taille+1 par rapport au précédent
		Compte[] newComptes = new Compte[comptes.length+1];
		
		// Copie de l'intégralité de l'ancien tableau dans le nouveau
		System.arraycopy(comptes, 0, newComptes, 0, comptes.length);
		
		// Dans la "dernière case" du nouveau tableau j'ajoute le compte passé en argument de la méthode
		newComptes[newComptes.length-1]=compte;
		
		// Enfin je valorise mon attribut d'instance comptes avec le nouveau tableau
		comptes=newComptes;
	}
	
	/** Retourne le solde global de tous les comptes du client
	 * @return double
	 */
	public double getSolde(){
		double solde=0;
		for (int i=0; i<comptes.length; i++){
			solde+=comptes[i].getSolde();
		}
		return solde;
	}
	
	@Override
	public String toString(){
		
		return "Identifiant:"+id+" - "+nom+" "+prenom+" - Nombre de comptes:"+comptes.length+" - Solde global:"+getSolde();
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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/** Setter
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/** Getter
	 * @return the comptes
	 */
	public Compte[] getComptes() {
		return comptes;
	}

	/** Setter
	 * @param comptes the comptes to set
	 */
	public void setComptes(Compte[] comptes) {
		this.comptes = comptes;
	}
}
