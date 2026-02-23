package com.saki.linkedin.oop.shapes;

public class Rectangle implements Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle width = "+ width + " and height = " + height;
    }

}
