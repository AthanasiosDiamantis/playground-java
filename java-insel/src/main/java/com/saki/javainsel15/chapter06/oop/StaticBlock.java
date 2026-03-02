package com.saki.javainsel15.chapter06.oop;

public class StaticBlock {

    static {
        System.out.print("Gut, dass ");
    }

    public static void main(String[] args) {
        System.out.print("zum Nachbarn hat.");
    }

    static {
        System.out.print("Neuer Boateng ");
    }
}
