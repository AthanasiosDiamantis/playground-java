package com.saki.java.chapter06.oop;

public class Rollercoaster {

    private static int numberOfInstances;

    // everytime an object is created this block of code sets the count of numberOfInstances one up
    {
        numberOfInstances++;
    }

    public static int getNumberOfInstances() {
        return numberOfInstances;
    }

    public static void main(String[] args) {
        new Rollercoaster();
        new Rollercoaster();
        System.out.println(Rollercoaster.getNumberOfInstances());
    }
}
