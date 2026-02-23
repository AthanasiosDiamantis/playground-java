package com.saki.java.chapter09.nested;

public class ObjectWithQuote {
    public static void main(String[] args) {
        String s = new Object(){
            String quote(String s) {
                return String.format("Quote on '%s'",s);
            }
        }.quote("Saki");
        System.out.println(s);
    }
}
