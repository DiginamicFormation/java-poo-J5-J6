package sets;

import java.util.HashSet;

/**
 * @author antoinethebault testPays : classe executable, teste la classe Pays
 */
public class TestPays {

	public static void main(String[] args) {
		HashSet<Pays> set = new HashSet<Pays>();
		set.add(new Pays("Usa", 372_200_000, 59_495));
		set.add(new Pays("France", 66_990_000, 43_551));
		set.add(new Pays("Allemagne", 82_520_000, 50_206));
		set.add(new Pays("Uk", 66_040_000, 43_620));
		set.add(new Pays("Italie", 60_590_000, 37_970));
		set.add(new Pays("Japon", 126_800_000, 42_659));
		set.add(new Pays("Chine", 1_386_000_000, 16_624));
		set.add(new Pays("Russie", 144_500_000, 28_712));
		set.add(new Pays("Inde", 1_339_000_000, 5_174));

		// Recherchez le pays avec le PIB/habitant le plus important

		Pays paysReference = set.iterator().next(); // pays de référence

		for (Pays pays : set) {
			if (pays.getPibParHabitant() > paysReference.getPibParHabitant()) {
				paysReference = pays;
			}
		}
		System.out.println("Pays avec le PIB/Hab le plus élevé: " + paysReference);

		// Recherchez le pays avec le PIB total le plus important

		paysReference = set.iterator().next(); // pays de référence

		for (Pays pays : set) {

			if (pays.getPibTotal() > paysReference.getPibTotal()) {
				paysReference = pays;
			}
		}
		System.out.println("Pays avec le PIB total le plus élevé: " + paysReference);

		// Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB
		// total le plus petit

		paysReference = set.iterator().next(); // pays de référence

		for (Pays pays : set) {
			if (pays.getPibTotal() < paysReference.getPibTotal()) {
				paysReference = pays;
			}
		}
		String nomEnMajuscules = paysReference.getNom().toUpperCase();
		paysReference.setNom(nomEnMajuscules);

		System.out.println("-----------------------------------------");
		for (Pays pays : set) {

			System.out.println(pays);
		}

		// Supprimez le pays dont le PIB total est le plus petit
		set.remove(paysReference);

		// Affichez l’ensemble des pays ainsi modifiés avec leur nom, nombre d’habitants
		// et PIB total
		System.out.println("-----------------------------------------");
		for (Pays pays : set) {

			System.out.println(pays);
		}
	}

}
