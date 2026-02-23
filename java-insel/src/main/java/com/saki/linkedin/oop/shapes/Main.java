package com.saki.linkedin.oop.shapes;

public class Main {

    public static void main(String[] args) {
        var myCircle = new Circle(5);
        var anotherCircle = new Circle(42);

        System.out.println(myCircle.getArea());
        System.out.println(anotherCircle.getArea());

    }
}
