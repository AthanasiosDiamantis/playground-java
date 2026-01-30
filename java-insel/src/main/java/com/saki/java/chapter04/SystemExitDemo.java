package com.saki.java.chapter04;

/**
 * first I compiled the class with "mvn compile"
 * after I wrote the SHELL-skript showreturn.sh and put it into the root-folder
 * of target.
 * then I startet the skript with ./showreturn.sh in the terminal
 */
public class SystemExitDemo {
    public static void main(String[] args) {
        System.out.println("Some milliseconds before death...");
        System.exit(42);
    }
}
