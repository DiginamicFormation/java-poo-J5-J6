package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Utilisez la classe java.util.Calendar pour créer une instance de Date à la date du
		// 19 mai 2016 à 23h59 et 30 secondes et affichez la au format suivant :
		// jour/mois/année
		
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		Date date = cal.getTime();
		
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formateur.format(date));
		
		// TODO Utilisez la classe java.util.Calendar pour créer une instance de Date à la date du
		// jour.
		Calendar calJour = Calendar.getInstance();
		Date dateJour = calJour.getTime();
		
		// TODO Affichez l’instance ainsi créée au format suivant : année/mois/jour heure:minute:seconde
		SimpleDateFormat formateurComplet = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(formateurComplet.format(dateJour));
		
		// TODO Affichez la même instance avec le nom des jours et des mois en français, russe, 
		// chinois et allemand.
		SimpleDateFormat formateurToutesLettresFR = new SimpleDateFormat("EEEEE dd MMMMM yyyy à HH:mm:ss");
		SimpleDateFormat formateurToutesLettresCH = new SimpleDateFormat("EEEEE dd MMMMM yyyy à HH:mm:ss", Locale.CHINA);
		SimpleDateFormat formateurToutesLettresRU = new SimpleDateFormat("EEEEE dd MMMMM yyyy à HH:mm:ss", new Locale("ru", "RU"));
		SimpleDateFormat formateurToutesLettresAL = new SimpleDateFormat("EEEEE dd MMMMM yyyy à HH:mm:ss", Locale.GERMANY);
		
		System.out.println(formateurToutesLettresFR.format(dateJour));
		System.out.println(formateurToutesLettresCH.format(dateJour));
		System.out.println(formateurToutesLettresRU.format(dateJour));
		System.out.println(formateurToutesLettresAL.format(dateJour));

	}

}
