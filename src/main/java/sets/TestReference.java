package sets;

import maps.Ville;

public class TestReference {

	public static void main(String[] args) {
		Object object = new Ville("Nantes", 280000, "44");
		
		Ville other = (Ville)object;
		
	}

}
