package files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

/**
 * Classe qui fait la démonstration de la manière de récupérer un ensemble de
 * ressources dans un répertoire
 * 
 * @author RichardBONNAMY
 *
 */
public class LectureContenuRepertoire {

	public static void main(String[] args) throws IOException {

		// Affichage de quelques propriétés associés à un path
		Path directory = Paths.get("C:/temp");
		System.out.println(directory.getRoot());
		System.out.println(directory.getParent());
		System.out.println(directory.getFileName());

		// Récupération de l'ensemble des "Path" contenu dans un répertoire.
		DirectoryStream<Path> ensemblePaths = Files.newDirectoryStream(directory);

		// DirectoryStream est un itérable et peut donc être parcouru via un itérator
		// de la même manière que si on avait eu une List<Path>
		Iterator<Path> iterPath = ensemblePaths.iterator();
		while (iterPath.hasNext()) {
			Path path = iterPath.next();
			if (Files.isDirectory(path)) {
				System.out.println(path+" est un répertoire.");
			}
			else {
				System.out.println(path+" est un fichier.");
			}
		}
		
		// DirectoryStream implémente l'interface Closeable. Il est donc fortement
		// conseillé d'invoquer la méthode close() après usage. 
		ensemblePaths.close();

		// Un itérable peut également être parcouru via une boucle objet
		// Attention, à la différence d'une List, DirectoryStream ne peut être parcouru qu'une seule fois.
		// Une fois parcouru, il est considéré comme consommé.
		// Il faut donc à nouveau récupérer le contenu du répertoire.
		
		ensemblePaths = Files.newDirectoryStream(directory);
		for (Path path : ensemblePaths) {
			System.out.println(path);
		}
		
		// DirectoryStream implémente l'interface Closeable. Il est donc fortement
		// conseillé d'invoquer la méthode close() après usage. 
		ensemblePaths.close();
	}

}
