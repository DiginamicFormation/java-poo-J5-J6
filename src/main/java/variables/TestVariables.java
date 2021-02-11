package variables;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestVariables {

	public static void main(String[] args) throws IOException {
		
		// Ce bloc de variables va permettre de stocker les infos de mon adresse postale
		Path path = Paths.get("C:/temp/recensement.csv");
		List<String> lignes = Files.readAllLines(path);
		lignes.remove(0);
		
		List<Ville> villes = new ArrayList<>();
		
		for (String l: lignes) {
			// Chaque ligne a une structure comme ci-contre: 04;La Réunion;974;2;98;416;Saint-Pierre;84 169;890;85 059;
			
			// Code rÃ©gion	Nom de la rÃ©gion	Code dÃ©partement	Code arrondissement	Code canton	Code commune	Nom de la commune	Population municipale	Population comptée à part	Population totale

			
			String[] mx = l.split(";");
			int population = Integer.parseInt(mx[9].replaceAll(" ", ""));
			Ville v = new Ville(mx[0], mx[1], mx[2], mx[5], mx[6], population);
			
			// alimentation de la liste des villes
			villes.add(v);
		}
		
		// Comment afficher les 10 plus grandes villes du département 34
		// Etape 1: "récupérer" toutes les villes du département 34
		
		ArrayList<Ville> selection = new ArrayList<>();
		
		// On parcourt les 35800 villes
		for (Ville v: villes) {
			
			// On ne conserve que les villes du département 34
			if (v.getCodeDepartement().equals("34")) {

				// Qu'est ce que je fais de v ?
				selection.add(v);
			}
		}
		
		// A ce niveau ma liste appelée selection détient toutes les villes.
		// On va trier cette liste par ordre par ordre de population décroissante.
		Collections.sort(selection);
		
		for (int i=0; i<10; i++) {
			System.out.println(selection.get(i));
		}
		
	}

}
