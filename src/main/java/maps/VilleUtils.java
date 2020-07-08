package maps;

import java.util.ArrayList;
import java.util.List;

public class VilleUtils {

	public static List<Ville> getVilles(){
		
		List<Ville> liste = new ArrayList<>();
		liste.add(new Ville("Nice", 343_000, "06"));
		liste.add(new Ville("Carcassonne", 47_800, "66"));
		liste.add(new Ville("Narbonne", 53_400, "66"));
		liste.add(new Ville("Lyon", 484_000, "69"));
		liste.add(new Ville("Foix", 9_700, "09"));
		liste.add(new Ville("Pau", 77_200, "64"));
		liste.add(new Ville("Marseille", 850_700, "13"));
		liste.add(new Ville("Tarbes", 40_600, "64"));
		
		return liste;
	}
}
