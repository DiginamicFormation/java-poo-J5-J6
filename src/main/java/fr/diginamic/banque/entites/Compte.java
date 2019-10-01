package fr.diginamic.banque.entites;

import fr.diginamic.banque.enumeration.CategorieCompte;

/**
 * Représente un compte bancaire
 * 
 * @author DIGINAMIC
 *
 */
public class Compte {

	/** numero : String */
	private String numero;
	
	/** client : Client */
	private double soldeInitial;
	
	/** operations : Operation[]*/
	private Operation[] operations=new Operation[0];
	
	/** categorie : CategorieCompte*/
	private CategorieCompte categorie;

	/**
	 * Constructeur
	 * 
	 * @param numero
	 *            numéro de compte
	 * @param solde
	 *            solde
	 * @param categorie categorie
	 */
	public Compte(String numero, double solde, CategorieCompte categorie) {
		super();
		this.numero = numero;
		this.soldeInitial = solde;
		this.categorie = categorie;
	}
	

	/** Permet d'ajouter une opération au compte
	 * @param compte compte
	 */
	public void ajouterOperation(Operation operation){
		
		// Création du nouveau tableau de taille+1 par rapport au précédent
		Operation[] newOperations = new Operation[operations.length+1];
		
		// Copie de l'intégralité de l'ancien tableau dans le nouveau
		System.arraycopy(operations, 0, newOperations, 0, operations.length);
		
		// Dans la "dernière case" du nouveau tableau j'ajoute l'opération passée en argument de la méthode
		newOperations[newOperations.length-1]=operation;
		
		// Enfin je valorise mon attribut d'instance operations avec le nouveau tableau newOperations
		operations=newOperations;
	}
	
	/** Retourne le solde global de tous les comptes du client
	 * @return double
	 */
	public double getSolde(){
		double solde=soldeInitial;
		for (int i=0; i<operations.length; i++){
			if (operations[i].getType().equals(Operation.TYPE_CREDIT)){
				solde+=operations[i].getMontant();
			}
			else {
				solde-=operations[i].getMontant();
			}
		}
		return solde;
	}
	
	/** Retourne le solde global de toutes les opérations dont le type est passé en paramètre
	 * @param type type des opérations recherchées
	 * @return double
	 */
	public double getSolde(String type){
		double solde=0;
		for (int i=0; i<operations.length; i++){
			if (type!=null && operations[i].getType().equals(type)){
				solde+=operations[i].getMontant();
			}
		}
		return solde;
	}
	
	@Override
	public String toString(){
		return "Numéro : "+numero+" - Type :"+categorie.getLibelle()+" - Nb opérations:"+operations.length+ " - Solde:"+getSolde();
	}

	/** Getter
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/** Setter
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/** Getter
	 * @return the soldeInitial
	 */
	public double getSoldeInitial() {
		return soldeInitial;
	}

	/** Setter
	 * @param soldeInitial the soldeInitial to set
	 */
	public void setSoldeInitial(double soldeInitial) {
		this.soldeInitial = soldeInitial;
	}


	/** Getter
	 * @return the categorie
	 */
	public CategorieCompte getCategorie() {
		return categorie;
	}


	/** Setter
	 * @param categorie the categorie to set
	 */
	public void setCategorie(CategorieCompte categorie) {
		this.categorie = categorie;
	}


}
