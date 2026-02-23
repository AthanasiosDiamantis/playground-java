package com.saki.linkedin.oop.shapes;

public class Circle implements Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Circle)) {
            return false;
        }
        Circle circle = (Circle) o;

        return this.radius == circle.radius;
    }

    public int hashCode() {
        return radius;
    }

    public String toString() {
        return "Circle with radius " + radius;
    }

}
