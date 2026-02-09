package com.saki.java.chapter06.oop;

public class Room {

    private final String name;
    private final int size;

    public Room(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public Room withName(String name) {
        return new Room(name, size);
    }

    public Room withSize(int size) {
        return new Room(name, size);
    }
}
