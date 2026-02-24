package com.saki.linkedin.oop.collections;

import com.saki.linkedin.oop.shapes.Circle;

import java.util.HashSet;

public class SetExamples {
    public static void main(String[] args) {
        var animals = new HashSet<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Mouse");
        System.out.println(animals);

        // this is the difference to ArrayList, there is no duplication
        animals.add("Cat");
        System.out.println(animals);

        var circles = new HashSet<Circle>();
        circles.add(new Circle(42));
        circles.add(new Circle(42));
        System.out.println(circles.size());


        circles.add(new Circle(43));
        System.out.println(circles.size());

        // no index like in ArrayList: animals.get(0) is not available
        // but his is possible
        for (var circle : circles) {
            System.out.println(circle);
        }
    }
}
