package com.saki.java.chapter06.oop;

import java.sql.SQLOutput;

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
