package com.saki.java.chapter06.game.v3;

public class Hogwurz {

    public static void main(String[] args) {
        Player parry = new Player();
        parry.name = "Parry Hotter";
        System.out.printf("Does Parry carry anything: %s%n", (parry.doesCarryAnything()? "yep":"nope" ) );
        parry.carry("Denkarium");
        parry.carry("Stein der Doofen");
        System.out.printf("%s trägt: %s%n",parry.name, parry.item);
        parry.dropAll();
        System.out.printf("Does Parry carry anything: %s%n", (parry.doesCarryAnything()? "yep":"nope" ) );
        parry.carry("Das goldene Ei");
        System.out.printf("%s trägt: %s%n",parry.name, parry.item);
    }
}
