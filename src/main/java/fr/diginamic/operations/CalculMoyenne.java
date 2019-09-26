package fr.diginamic.operations;

/** Classe permettant de calculer une moyenne
 * @author DIGINAMIC
 *
 */
public class CalculMoyenne {
	/** tab : non initialisé*/
	private double[] tab;

	/**
	 * Constructeur
	 */
	public CalculMoyenne() {
		
		// Dans le constructeur, on construit le tableau avec 
		// une longueur à 0
		this.tab = new double[0];
	}

	/** Ajoute un nombre au calculateur de moyenne
	 * @param aAjouter nombre à ajouter
	 */
	public void ajout(double aAjouter) {
		
		// On est obligé d'agrandir le tableau initial de 1 à chaque ajout
		// d'un nouveau nombre
		
		// On commence donc par créer un tableau temporaire appelé newTab
		// qui a la taille de tab+1
		double[] newTab = new double[tab.length+1];
		
		// On déverse toutes les valeurs de tab dans newTab
		for (int i=0; i<tab.length; i++){
			newTab[i]=tab[i];
		}
		
		// On place en dernière position dans le nouveau tableau le nouveau
		// nombre
		newTab[newTab.length-1]=aAjouter;
		
		// Enfin on affecte newTab à tab
		this.tab=newTab;
	}

	/** Calcule la moyenne
	 * @return double
	 */
	public double calcul() {
		double somme = 0;

		for (int i = 0; i < this.tab.length; i++) {
			somme = somme + this.tab[i];
		}

		return (somme / this.tab.length);
	}

}
