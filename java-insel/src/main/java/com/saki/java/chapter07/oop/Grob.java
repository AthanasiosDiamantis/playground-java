package com.saki.java.chapter07.oop;

public class Grob extends Alien{

    public Grob() {
        super("Locutus"); // all grob aliens live on locutus
    }

    public Grob(String planet) {
        super(planet);
    }
}
