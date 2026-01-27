package com.saki.java.chapter03;

import java.awt.*;
import java.util.logging.Logger;

public class ItsTheSame {
    private static final Logger logger = Logger.getLogger(ItsTheSame.class.getName());

    public static void main(String[] args) {
        Point p = new Point();
        Point q = p;
        p.x = 10;
        logger.info("q has the coordinate as p for x: " + q.x);
        q.y = 3;
        logger.info("p has the same coordinate as p for y: " + p.y);
        logger.info("This shows, that on object is pointed from two variables q and p. And both refer only to one object.");
    }
}
