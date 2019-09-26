package fr.diginamic.formes;

/** Forme concrète de type Cercle
 * @author DIGINAMIC
 *
 */
public class Cercle extends Forme {
	/** rayon */
	private double rayon = 0;

	/** Constructeur
	 * @param ray rayon
	 */
	public Cercle(int ray) {
		this.rayon = ray;
	}

	@Override
	public double calculerSurface() {

		double surfaceCercle = Math.PI * Math.pow(this.rayon, 2);
		return surfaceCercle;
	}

	@Override
	public double calculerPerimetre() {

		double perimetreCercle = (2 * Math.PI * rayon);
		return perimetreCercle;
	}

}
