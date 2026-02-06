package com.saki.java.chapter06.game.v2;

public class Playground {

    public static void main(String[] args) {
        Player p = new Player();
        p.name = "Mutiger Manfred";
        p.item = "Schlips";

        System.out.printf("%s nimmt einen %s mit,", p.name, p.item);
    }
}
