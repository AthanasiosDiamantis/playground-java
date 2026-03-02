package com.saki.javainsel15.chapter09.nested;

public class NSA {

    public static void main(String[] args) {

        final int PRISM = 1;
        int tempora = 2;
        tempora++;

        class Snowden {
            Snowden() {
                System.out.println(PRISM);
//                System.out.println(tempora); // Variable 'tempora' is accessed from within inner class, needs to be final or effectively final
            }
        }
        new Snowden();
    }
}
