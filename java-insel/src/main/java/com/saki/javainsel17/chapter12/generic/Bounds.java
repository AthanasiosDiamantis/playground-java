package com.saki.javainsel17.chapter12.generic;

import java.awt.*;
import java.nio.charset.Charset;

public class Bounds {

    public static <T extends CharSequence> T random(T m, T n) {
        return Math.random() > 0.5 ? m : n;
    }

    public static <T extends Comparable<T>> T max(T m, T n){
        return m.compareTo(n) > 0 ? m : n;
    }

    public static void main(String[] args) {
        String random1 = random("Shinju", "Karada");
        System.out.println(random1);

        CharSequence random2 = random("Uschiro", new StringBuilder("Takatekote"));
        System.out.println(random2);

        System.out.println(max("cinema", "reading"));
        System.out.println(max(12, 100));

//        System.out.println(max(12L, 100F)); // Number is the connection Basic-Type, but Number is no child of Comparable!

//        System.out.println(random("", new Point() ));// not possible, because Point() is not member of CharSequenz)
    }
}
