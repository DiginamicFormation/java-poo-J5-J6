package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		Saison[] saisons = Saison.values();
		for (Saison saison: saisons) {
			System.out.println(saison.getLibelle()+" "+saison.getNumero());
		}
		
		System.out.println("Recherche par nom :");
		
		String nom = "ETE";
		Saison saison = Saison.valueOf(nom);
		System.out.println(saison.getLibelle()+" "+saison.getNumero());
		
		System.out.println("Recherche par libellé :");
		String libelle = "Hiver";
		Saison saison2 = Saison.getSaison(libelle);
		System.out.println(saison2.getLibelle()+" "+saison2.getNumero());

	}

}
