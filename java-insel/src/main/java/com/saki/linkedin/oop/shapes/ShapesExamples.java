package com.saki.linkedin.oop.shapes;

public class ShapesExamples {
    public static void main(String[] args) {
//        var rectangle = new Rectangle(5,10);
//        System.out.println("Rectangle area: " + rectangle.getX());
        Triangle triangle = new Triangle(3,5,6);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

    }
}
