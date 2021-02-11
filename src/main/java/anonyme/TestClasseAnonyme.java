package anonyme;

import java.util.List;

public class TestClasseAnonyme {

	public static void main(String[] args) {
		

		// Classe anonyme transformée en lambda
		Operation op = (a, b) -> a + b;
		
		// Utilisation des 2
		//System.out.println(op.exec(8.0, 5.0));
		
		// Classe anonyme de type prédicat qui 
		// ne sélectionne que les doubles > à -10.0
		Predicat p = d -> d > -10.0;
		
		List<Double> maListe = List.of(10.0, -28.0, 12.0, -2.5);
		for (Double a: maListe) {
			if (p.test(a)) {
				System.out.println(a);
			}
		}
	}

}
