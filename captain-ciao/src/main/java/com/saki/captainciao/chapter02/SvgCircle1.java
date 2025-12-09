/**
 * Einen Svg-Kreis auf der Konsole Schreiben
 * @author athanasios diamantis
 * @version 1.02
 * datum 26.09.22
 * aus Captain CiaoCiao Kapitel 2
 */
package com.saki.captainciao.chapter02;

import java.util.Locale;
import java.util.Scanner;

public class SvgCircle1 {

	public static void main(String[] args) {
		// declaration and initiation of variables
		int xKoordinate = 100;
        int yKoordinate = 110;
        double radius = 20.5;
        double rnd = Math.random()*10+10;
        radius = rnd;
        /*
        Alternative mit Ober & Untergrenze
        double rnd3 = ThreadLocalRandom.current().nextDouble(1.77,9.99);
        radius = rnd3;
         */

        // input Stream Reader
        System.out.println("Bitte die x-Koordinate eingeben: ");
        xKoordinate = new Scanner(System.in).nextInt();

        System.out.println("Bitte die y-Koordinate eingeben: ");
        yKoordinate = new Scanner(System.in).nextInt();

        // Achtung, Sprache muss auf English eingestellt werden, damit kein Komma (,),
        // sondern ein Punkt (.) die Fließkommazhl trennt
        System.out.printf(
        		Locale.ENGLISH,
        		"<svg height=\"400\" width=\"1000\">%n" +
                "    <circle cx=\"%d\" cy=\"%d\" r=\"%.2f\" />%n" +
                "</svg>%n",xKoordinate,yKoordinate,radius);
        int between =8;
        boolean isBetween = between > 7 && between < 10;
        System.out.println(isBetween);


        /*
        ong xZahl = 1_000_000;
        System.out.println(xZahl*xZahl);
        double yZahl = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1-1.0;
        System.out.println(yZahl);
        */



	}

}
