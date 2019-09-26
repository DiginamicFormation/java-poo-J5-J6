package fr.diginamic.openfoodfacts;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class TraitementFichier {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/temp/openFoodFacts.csv");
		List<String> lignes = FileUtils.readLines(file);
		for (int i=0; i<lignes.size(); i++){
			System.out.println(lignes.get(i));
		}

	}

}
