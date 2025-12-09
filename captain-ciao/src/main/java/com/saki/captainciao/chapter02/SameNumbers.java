/**
 * Programm prüft, ob eine Zwei Zahlen zwischen 0-99 gleiche Ziffern haben,
 * Beispiel: 12 und 41 haben die 1 gemeinsam.
 * Einstellige Zahlen bekommen ein 0 vorgesetzt: Beispiel: 4 ergibt 04
 * Zahlen mit mehr als 2 Stellen werden vom Ende her nur die beiden letzten Ziffern
 * betrachtet, Beispiel: 4311 ergibt 11
 * */

package com.saki.captainciao.chapter02;

import java.util.Scanner;

public class SameNumbers {
	public static void main(String[] args) {
		int firstNumber;
		int fiNuOnesPosition = 77;
		int fiNuTensPosition = 77;
		int secondNumber;
		int seNuOnesPosition = 77;
		int seNuTensPosition = 77;

		System.out.println("Pleas enter a digit between 0 and 99:");
		Scanner scan = new Scanner(System.in);
		// mit Modolo 100 werden alle Zahlen die 3 Stellig oder größer sind
		// abgeschnitten und lediglich Ihr ganzzahliger 2-stelliger Restwert bnutzt
		firstNumber = scan.nextInt()%100;

		System.out.println("Pleas enter a second digit between 0 and 99:");
		secondNumber = scan.nextInt()%100;

		// firstNumber wird hier geprüft
		// Zahlen zwischen 0 und 9
		if (firstNumber >=0 && firstNumber < 10) {
			fiNuTensPosition = 0;
			fiNuOnesPosition = firstNumber;
		}
		// Zahlen zwischen 10 und 99
		else if (firstNumber >=10 && firstNumber < 100) {
			fiNuOnesPosition = firstNumber % 10;
			fiNuTensPosition = firstNumber/10; // viel kürzer !!!
//			Ursprünglicher Lösg: fiNuTensPosition = (firstNumber - fiNuOnesPosition)/10;
		}
		else if (firstNumber >=100 ){
			System.out.println("Wrong Number!");
		}
		// Nur Testausgabe
		System.out.println("Ones: " + fiNuOnesPosition);
		System.out.println("Tens: " + fiNuTensPosition);

		// secondNumber wird hier geprüft
		// Zahlen zwischen 0 und 9
		if (secondNumber >=0 && secondNumber < 10) {
			seNuTensPosition = 0;
			seNuOnesPosition = secondNumber;
		}
		// Zahlen zwischen 10 und 99
		else if (secondNumber >=10 && secondNumber < 100) {
			seNuOnesPosition = secondNumber % 10;
			seNuTensPosition = secondNumber / 10; // viel kürzer !!!
//			Ursprüngliche Lösg: seNuTensPosition = (secondNumber - seNuOnesPosition)/10;
		}
		else if (secondNumber >=100 ){
			System.out.println("Wrong Number!");
		}
		// Nur Testausgabe
		System.out.println("Ones: " + seNuOnesPosition);
		System.out.println("Tens: " + seNuTensPosition);

		// identifiziert, ob 2 Zahlen zusammenpassen
		if (
				(fiNuOnesPosition == seNuOnesPosition) ||
				(fiNuOnesPosition == seNuTensPosition) ||
				(fiNuTensPosition == seNuOnesPosition) ||
				(fiNuTensPosition == seNuTensPosition)
			) {
			System.out.println("the stones suit together");
		}
		else {
			System.out.println("the stones don´t fit together!");
		}


		scan.close();
	}

}
