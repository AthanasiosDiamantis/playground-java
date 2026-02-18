package com.saki.java.chapter07.oop;

interface Sex {
    default boolean hasPrice() {
        return false;
    }
}

interface Drugs {
    default boolean hasPrice() {
        return true;
    }
}

public class RockAndRoll implements Sex, Drugs {


    @Override
    public boolean hasPrice() {
        // the only way to implement this method is to decide from
        // which interface the method should come
        return Sex.super.hasPrice();
    }
}
