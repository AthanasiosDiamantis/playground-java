package com.saki.linkedin.oop.shapes;

public class Triangle implements Shape {

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double sum1 = sideA + sideB + sideC;
        double sum2 = -sideA + sideB + sideC;
        double sum3 = sideA - sideB + sideC;
        double sum4 = sideA + sideB - sideC;
        // Satz des Heron euklidische
        return 1.0 /4.0 * Math.sqrt(sum1 * sum2 * sum3 * sum4);
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
