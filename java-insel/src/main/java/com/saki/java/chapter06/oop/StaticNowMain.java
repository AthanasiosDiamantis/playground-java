package com.saki.java.chapter06.oop;

public class StaticNowMain {

    static {
        System.out.println("This is now the main program like the main-method-class, but without a main-method-class");
    System.exit(0);
    }

    public static void main(String[] args) {
        // empty just to achieve the play button
        // the problem is, that this example works only with older java versions, newer java versions
        // expect a main method class
    }
}
