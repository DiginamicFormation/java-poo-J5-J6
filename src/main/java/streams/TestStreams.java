package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TestStreams {

	public static void main(String[] args) {
		
		List<Compte> comptes = new ArrayList<>();
		comptes.add(new Compte(new Personne("Riner", "Teddy"), 1520.0));
		comptes.add(new Compte(new Personne("Karabatic", "Nicolas"), -75.0));
		comptes.add(new Compte(new Personne("Mayer", "Kévin"), 318.2));
		comptes.add(new Compte(new Personne("Wolsey", "Tessa"), -30.0));
		comptes.add(new Compte(new Personne("Essarokh", "Latifa"), 498.0));
		comptes.add(new Compte(new Personne("Lavillenie", "Renaud"), 290.0));
		
		// je veux calculer le solde de tous les comptes
		double somme = comptes.stream().filter(c-> c.getSolde()>0).map(c -> c.getSolde()).reduce( (s1, s2)->s1+s2).get();
		System.out.println(somme);
		
		String value = comptes.stream().filter(c -> c.getSolde()>0).map(c -> c.getPersonne().getNom()).collect(Collectors.joining(" / "));
		System.out.println(value);
		
	}
}
