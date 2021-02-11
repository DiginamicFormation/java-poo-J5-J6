package dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestSaisieDate {

	public static void main(String[] args) {
		System.out.println("Veuillez saisir une date au format année/mois/jour svp:");
		Scanner scanner = new Scanner(System.in);
		
		String saisie = scanner.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd"); // Format NON ISO
		LocalDate date = LocalDate.parse(saisie, formatter);
		
		System.out.println("Affichage de la date à différents formats:");
		System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(date.format(DateTimeFormatter.ISO_DATE));
		System.out.println(date.format(DateTimeFormatter.ofPattern("'Le' eeee MM--yyyy")));
	}

}
