package com.saki.java.chapter03;

import java.awt.*;
import java.io.File;

/**
 * from book page 235
 * Demonstrates toString Method overide
 */
public class PointToStringDemo {
    public static void main(String[] args) {
        Point player = new Point();
        Point door = new Point();

        door.setLocation(10,100);

        String s = player.toString();

        System.out.println(player.toString());
        System.out.println(door);
        System.out.println("This comes from the variable s: " + s);
        System.out.println("result of s.length() Method from String Object: "+ s.length());


        long textSizeInBytes = new File("text.txt").length();
        System.out.println("textSizeInBytes : "+ textSizeInBytes );
    }
}
