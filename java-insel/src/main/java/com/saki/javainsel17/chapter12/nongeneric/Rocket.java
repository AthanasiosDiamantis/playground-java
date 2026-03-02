package com.saki.javainsel17.chapter12.nongeneric;

public class Rocket {

    private Object value;

    public Rocket() {
        // empty constructor
    }
    public Rocket(Object value) {
        this.value = value;
    }

    public Object get() {
        return value;
    }

    public void set(Object value) {
        this.value = value;
    }

    public boolean isEmpty() {
        return value == null;
    }

    public void empty() {
        value = null;
    }
}
