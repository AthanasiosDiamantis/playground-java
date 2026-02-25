package com.saki.java.chapter18;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class HashSetDoubleAdd {

    public static void main(String[] args) {
        Set<Point> set = new HashSet<Point>();
        Point p1 = new Point();
        Point p2 = new Point();
        System.out.println(set.add(p1));
        System.out.println(set.add(p1));
        System.out.println(set.add(p2));
        System.out.println(set.contains(p1));
        System.out.println(set.contains(p2));
        System.out.println(set.size());
    }
}
