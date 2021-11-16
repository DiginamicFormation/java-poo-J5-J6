package files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/** L'objectif est de traiter un fichier CSV contenant le recensement de population de 2016 (source INSEE):
 * On extrait la liste des villes de plus de 25000 habitants et on les stocke dans un fichier CSV de
 * destination.
 * Le fichier source de l'INSEE contient 10 informations pour chaque ville. 
 * Dans le fichier de destination on ne souhaite pas avoir toutes ces informations mais uniquement les 
 * informations suivantes: Code département, Nom de la commune et Population totale.
 *
 */
public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		
		// Critère de filtrage des villes
		int populationMin = 25000;
		
		// Lecture du fichier de recensement
		Path fichier = Paths.get("C:/Temp/recensement.csv");
		List<String> lines = Files.readAllLines(fichier, StandardCharsets.UTF_8);
		
		// Cette liste va accueillir les villes de plus de 25000 habitants avec
		// uniquement les informations suivantes: Code département, Nom de la commune et Population totale.
		List<String> linesOut = new ArrayList<>();
		
		// Ajout de la ligne d'entête
		linesOut.add("Code département;Nom de la commune;Population totale;");
		
		// On commence la lecture à partir de la ligne 1 afin de ne pas traiter
		// la ligne d'entête.
		for (int i=1; i<lines.size(); i++) {
			
			String line = lines.get(i);
			
			// Découpage de la ligne sur le base du caractère séparateur ";"
			String[] tokens = line.split(";");
			
			// On récupère le morceau n°9 qui contient l'information de population.
			// Seul problème: l'information de population contient des caractères espace
			// qu'il faut supprimer
			String popStr = tokens[9].trim().replace(" ", "");
			
			// Ensuite il faut convertir en entier cette information actuellement au format String
			int population = Integer.parseInt(popStr);
			
			if (population >= populationMin) {
				
				// Dans ce cas, on souhaite stocker la ville qui nous intéresse avec seulement 3 informations:
				// le nom de la ville, le code département et la population totale.
				String lineOut = tokens[6]+";"+tokens[2]+";"+population+";";
				
				linesOut.add(lineOut);
			}
		}
		
		Files.write(Paths.get("C:/Temp/villes_"+populationMin+".csv"), linesOut);
	}
}
