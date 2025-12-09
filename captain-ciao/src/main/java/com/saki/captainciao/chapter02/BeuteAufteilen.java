package com.saki.captainciao.chapter02; /**
 * Aufteilung der Beute.
 * 1. Abfrage wie viele Flaschen erbeutet wurden.
 * Captain CiaoCiao bekommt immer die Hälfte der Beute, also beute/2 als int,
 * schneidet das Ergebnis immer ab, so dass ungerade immer weniger als die Hälfte
 * 2. Ausgabe des Anteiles der Flaschen für Captain CiaoCiao
 * 3. Ausgabe der Flaschen für die Crew berechnen und ausgeben
 * 4. Abfrage, wie viele Crewmitglieder
 * 5. Berechnung ob Flaschen fair (zu glichen Teilen) aufgeteilt werden können.
 * */


import java.util.Scanner;

public class BeuteAufteilen {

	public static void main(String[] args) {
		// Variablen definieren
		int beuteMenge;
		int anteilCaptain;
		int anteilCrew;
		int mengeCrewMitglieder; // ohne Captain CiaoCiao
		int faireAnteilMenge;

		System.out.println("Number of bottles in total?");
		Scanner scan = new Scanner(System.in);
		beuteMenge = scan.nextInt();

		// prüfung ob BeuteAnzahl gerade
		if (beuteMenge % 2 == 0) {
			anteilCaptain = beuteMenge/2;
			anteilCrew = beuteMenge - anteilCaptain;
		}
		else {
			anteilCaptain = beuteMenge/2;
			anteilCrew = beuteMenge - anteilCaptain;
		}

		System.out.printf("Bottles for Captain: %d %n"
				+ "remaining bottles for Crew: %d %n", anteilCaptain, anteilCrew);

		System.out.println("\n**********************************\n"
				+ "Enter amount of Crewmembers without the Captain!");
		mengeCrewMitglieder = scan.nextInt();

		// Wenn Verteilung fair, dann Ausgabe, dass fair und
		// Menge die jedes Mitglied bekommt

		if ( mengeCrewMitglieder == 1) {
			System.out.printf("Ok, thats poor, the Captain has only one Member! the member %n"
					+ "gets: %d bottles, good for him or her!", anteilCrew);
		}
		else if ( mengeCrewMitglieder >1 && anteilCrew % mengeCrewMitglieder == 0) {
			faireAnteilMenge = anteilCrew/mengeCrewMitglieder;
			System.out.printf("Great! It´s fair! Every of the %d Crewmembers gets an equal %n"
					+ "amount of bottles, so everybody gets: %d bottles!",
					mengeCrewMitglieder, anteilCrew/mengeCrewMitglieder );
		}
		else {
			System.out.println("unfair, the devided amount will be unequal,"
					+ "\nthus the Captain gets all bottles!");
		}
		scan.close();
		// TODO

	}

}
