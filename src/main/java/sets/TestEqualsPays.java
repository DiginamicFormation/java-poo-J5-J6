package sets;

public class TestEqualsPays {

	public static void main(String[] args) {
		Pays pays1 = new Pays("", 66_000_000, 43000); // adresse mémoire 1
		Pays pays2 = new Pays("", 66_000_000, 43000); // adresse mémoire 2
		
		System.out.println(pays1.equals(pays2));
	}

}
