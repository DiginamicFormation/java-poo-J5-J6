package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.diginamic.testenumeration.Continent;

public class TestVilles {

	public static void main(String[] args) {
		List<Ville> liste = new ArrayList<>();
		liste.add(new Ville("Nice", 343_000, Continent.EUROPE));
		liste.add(new Ville("Carcassonne", 47_800, Continent.EUROPE));
		liste.add(new Ville("Narbonne", 53_400, Continent.EUROPE));
		liste.add(new Ville("Lyon", 484_000, Continent.EUROPE));
		liste.add(new Ville("Foix", 9_700, Continent.EUROPE));
		liste.add(new Ville("Pau", 77_200, Continent.EUROPE));
		liste.add(new Ville("Marseille", 850_700, Continent.EUROPE));
		liste.add(new Ville("Tarbes", 40_600, Continent.EUROPE));

		System.out.println("Tri sur le critère de tri contenu dans la classe Ville :");
		Collections.sort(liste);
		
		for (Ville v: liste) {
			System.out.println(v);
		}
		
		System.out.println("Tri sur le nom de la ville trié par ordre alphabétique :");
		Collections.sort(liste, new ComparatorNom());
		
		for (Ville v: liste) {
			System.out.println(v);
		}
		
		System.out.println("Tri sur le nombre d'habitants :");
		Collections.sort(liste, new ComparatorHabitant());
		
		for (Ville v: liste) {
			System.out.println(v);
		}

	}

}
