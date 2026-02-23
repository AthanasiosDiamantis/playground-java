package com.saki.linkedin.oop.shapes;

public class Polymorphism {

    public static void main(String[] args) {

       Rectangle s = new Square(5);
        System.out.println(s.getArea());

    }
}
