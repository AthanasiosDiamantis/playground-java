package com.saki.java.chapter06.oop;

public class Dungeon {

    Dungeon() {
        System.out.println("2. Constructor");
    }

    void play() {
        System.out.println("4. Play");
    }

    public static void main(String[] args) {
        System.out.println("1. before construction...");
        Dungeon dungeon = new Dungeon();
        System.out.println("3. after construction...");
        dungeon.play();
    }
}
