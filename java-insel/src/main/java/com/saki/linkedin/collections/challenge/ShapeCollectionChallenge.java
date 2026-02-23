package com.saki.linkedin.collections.challenge;

import java.awt.*;
import java.util.Collection;

public class ShapeCollectionChallenge {

    static double shapeAreaSum(Collection<Shape> shapes) {

        double sum = 0;

        for(Shape shape : shapes) {
            sum += shape.getBounds().x * shape.getBounds().y;
//            shape.g TODO: continue here
        }

        return 0.0; // TODO change return value
    }
}
