package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		// Créez une instance de la classe java.util.Date à la date du jour en utilisant un de ses constructeurs
		Date dateJour = new Date(120, 6, 8);
		
		// Affichez l’instance ainsi créée au format suivant : jour/mois/année
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		String resultat = formateur.format(dateJour);
		System.out.println(resultat);
		
		// Créez une instance de la classe Date à la date du 19 mai 2016 à 23h59 et 30 secondes
		
		Date date19Mai = new Date(116, 4, 19, 23, 59, 30);
		
		// Affichez l’instance ainsi créée au format suivant : année/mois/jour heure:minute:seconde
		SimpleDateFormat formateurComplet = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(formateurComplet.format(date19Mai));
		
		// Créez une instance de Date contenant la date/heure système et affichez-la au même format que ci-dessus
		Date dateSys = new Date();
		System.out.println(formateurComplet.format(dateSys));
	}

}
