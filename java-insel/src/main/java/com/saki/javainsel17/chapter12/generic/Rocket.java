package com.saki.javainsel17.chapter12.generic;

public class Rocket<T> {

    private T value;

    public Rocket() {
        // empty constructor
    }
    public Rocket(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

    public boolean isEmpty() {
        return value == null;
    }

    public void empty() {
        value = null;
    }
}
