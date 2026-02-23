package com.saki.java.chapter09.nested;

public class House {
    private String owner = "Ich";

    class Room {
        void ok() {
            System.out.println(owner);
        }
//        static void error() {}
    }

    public static void main(String[] args) {
        House h = new House();
        Room r = h.new Room();

    }

}
