package fr.diginamic.formes;

/** Forme concrète de type Rectangle 
 * @author DIGINAMIC
 *
 */
public class Rectangle extends Forme {
	/** longueur */
	private double longueur;
	
	/** largeur */
	private double largeur;

	/** Constructeur
	 * @param longueur longueur
	 * @param largeur largeur
	 */
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {

		double surfaceRect = (this.longueur + this.largeur) * 2;
		return surfaceRect;
	}

	@Override
	public double calculerPerimetre() {

		double perimetreRect = this.longueur * this.largeur;
		return perimetreRect;
	}

}
