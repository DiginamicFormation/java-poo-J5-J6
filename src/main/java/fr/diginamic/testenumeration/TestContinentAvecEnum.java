package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.Collections;

import tri.ComparatorNom;
import tri.Ville;

public class TestContinentAvecEnum {

	public static void main(String[] args) {

		ArrayList<Ville> villes = new ArrayList<>(); // <- position iterateur
		villes.add(new Ville("Nice", 343_000, Continent.EUROPE));
		villes.add(new Ville("Carcassonne", 47_800, Continent.EUROPE));
		villes.add(new Ville("Narbonne", 53_400, Continent.EUROPE));
		villes.add(new Ville("Lyon", 484_000, Continent.EUROPE));
		villes.add(new Ville("Foix", 9_700, Continent.EUROPE));
		villes.add(new Ville("Pau", 77_200, Continent.EUROPE));
		villes.add(new Ville("Marseille", 850_700, Continent.EUROPE));
		villes.add(new Ville("Tarbes", 40_600, Continent.EUROPE));

		Collections.sort(villes, new ComparatorNom());

		for (Ville ville : villes) {
			System.out.println(ville);
		}

	}

}
