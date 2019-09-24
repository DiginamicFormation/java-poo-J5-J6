package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		// Une variable d'instance a une valeur pour une instance donnée: 
		// ci-dessous numeroRue ne vaut 1 que pour la variable adr
		AdressePostale adr = new AdressePostale();
		adr.numeroRue = 1;
		
		// La variable nbDepartements est statique, elle a une valeur identique 
		// pour toutes les adresses postales. En revanche on peut la modifier:
		AdressePostale.nbDepartements = 102;
		
		// La variable NB_REGIONS est constante, elle a une valeur identique 
		// pour toutes les adresses postales. Mais elle n'est pas modifiable:
		System.out.println(AdressePostale.NB_REGIONS);

	}

}
