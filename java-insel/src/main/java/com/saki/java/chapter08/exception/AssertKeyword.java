package com.saki.java.chapter08.exception;

public class AssertKeyword {

    public static double subAndSqrt(double a, double b) {
        double resulst = Math.sqrt(a-b);

        assert ! Double.isNaN(resulst) : "Berechnungsergebnis ist NaN!";

        return resulst;
    }

    public static void main(String[] args) {
        System.out.println("Sqrt(10.2) = " + subAndSqrt(10,2));
        System.out.println("Sqrt(2-10 = " + subAndSqrt(2,10));
    }
}
