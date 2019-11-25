package listes;
import java.util.*;

public class FusionListe {
	
	public static void main(String[] args) {
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		liste1.add("Blanc");
		liste1.add("Bleu");
		liste1.add("Orange");
		
		Iterator<String> iterator = liste1.iterator();
		while (iterator.hasNext()){
			String couleur = iterator.next();
			System.out.println(couleur);
			
		}
		
		for (String couleur: liste1){
			
		}
		
	}
}