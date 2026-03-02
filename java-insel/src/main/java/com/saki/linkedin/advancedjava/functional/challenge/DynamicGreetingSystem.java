package com.saki.linkedin.advancedjava.functional.challenge;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class DynamicGreetingSystem {

    // TODO: continue challenge here

    // Code, der basierend auf der Tageszeit dynamische Begrüßungnachrichten generiert

    // Consumer<String> nimmt einen Namen als Argument und zur Ausgabe der personalisierten
    // Begrüßungsnachricht (stdout) auf Konsole, verwendet intern Supplier


    public static void main(String[] args) {

        System.out.println("Bitte gib Deinen Namen ein und Drücke Enter!!!");
        String inputName = new Scanner(System.in).nextLine();

        // Supplier<String> zur Ermittlung der Tageeszeitteils (Morgen, Mittag, Abend)
        Supplier<String> getPartOfDay = () -> {
            int hour = LocalDateTime.now().getHour();
            if (hour < 10) {
                return "Guten Morgen";
            } else if (hour < 15) {
                return "Guten Mittag";
            } else {
                return "Guten Abend";
            }
        };

        Consumer<String> nameConsumer = name -> System.out.printf("%s %s, wie geht es Dir", getPartOfDay.get(), name);
        nameConsumer.accept(inputName);

    }
}
