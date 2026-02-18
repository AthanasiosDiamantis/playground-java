package com.saki.java.chapter08.exception;
public class MissNumberFormatException {
    public static int getVatRate() {
        return Integer.parseInt("19%");
    }
    public static void main(String[] args) {
        System.out.println(getVatRate());
    }
}
