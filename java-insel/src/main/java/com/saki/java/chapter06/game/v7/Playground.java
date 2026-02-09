package com.saki.java.chapter06.game.v7;

public class Playground {

    public static void main(String[] args) {
        Player patric = new Player();
        patric.name = "Patrick Circle";
        patric.item = "Knoten";

        Player tryc = new Player(patric);
        System.out.println(tryc.name + " & " + tryc.item);
    }
}
