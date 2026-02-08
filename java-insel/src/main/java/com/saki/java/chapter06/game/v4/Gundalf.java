package com.saki.java.chapter06.game.v4;

public class Gundalf {

    public static void main(String[] args) {
        Wizard gundalf = new Wizard().name("Gundalf").age(60);
        System.out.println(gundalf.name());
        System.out.println(gundalf.format());
    }

}
