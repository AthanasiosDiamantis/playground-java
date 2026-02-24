package com.saki.linkedin.oop.collections.challenge;


import com.saki.linkedin.oop.shapes.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ShapeCollectionChallenge {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(5,10));
        shapes.add(new Square(9));
        shapes.add(new Triangle(3,4,5));

        System.out.println(shapeAreaSum(shapes));

    }

    static double shapeAreaSum(Collection<Shape> shapes) {

        double sum = 0;

        for(Shape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }
}
