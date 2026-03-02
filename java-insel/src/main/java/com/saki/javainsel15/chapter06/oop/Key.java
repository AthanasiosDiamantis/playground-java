package com.saki.javainsel15.chapter06.oop;

public class Key {

    private int id;

    public Key(int id) {
        this.id = id;
    }

    public boolean compare( Key that ) {
        return this.id == that.id;
    }
}
