package com.saki.linkedin.oop.shapes;

public class Interfaces {

    public static void main(String[] args) {

        var circle = new Circle(3);
        var rectangle = new Rectangle(4,7);
        var square = new Square(9);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }

    static void description(Shape s) {
        String description = s.toString() + " with area: " + s.getArea() + " and perimeter: " + s.getPerimeter();
        System.out.println(description);
    }
}
