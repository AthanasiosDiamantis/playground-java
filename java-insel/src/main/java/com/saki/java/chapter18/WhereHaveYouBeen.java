package com.saki.java.chapter18;

import java.text.BreakIterator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class WhereHaveYouBeen {

    public static void main(String[] args) {

        // Menge mit Städten aufbauen
        Set<String> allCities = new HashSet<>();
        allCities.add("Sonsbeck");
        allCities.add("Düsseldrof");
        allCities.add("Manila");
        allCities.add("Seoul");
        allCities.add("siquijor");

        // Menge für besuchte Städte aufbauen

        Set<String> visitedCities = new TreeSet<>();

        // Satz paresen und in Wörter zerlegen. Alle gefundenen Städte
        // in neue Datenstruktur aufnehmen
        String sentence = "From Sonsbeck I drive to Düsseldorf and fly to Manila.";
        BreakIterator iter = BreakIterator.getWordInstance();
        iter.setText(sentence);

        for (int first = iter.first(), last = iter.next();
             last != BreakIterator.DONE;
             first = last, last = iter.next()) {
            String word = sentence.substring(first, last);
            if (allCities.contains(word)) {
                visitedCities.add(word);
            }

            // kleine Statistik

            System.out.println("Number of visited cities: " + visitedCities.size());
            System.out.println("Number of unvisited cities: " + (allCities.size() - visitedCities.size()));
            System.out.println("visited cities: " + String.join(", ", visitedCities));
            Set<String> unvisitedCities = new TreeSet<>(allCities);
            unvisitedCities.removeAll(visitedCities);
            System.out.println("unvisited cities: " + String.join(", ", unvisitedCities));
        }

    }
}
