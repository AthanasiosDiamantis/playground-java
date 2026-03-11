package com.saki.javase9.chapter17;

import java.awt.*;

public class HelloAwtFrame {

    public static void main(String[] args) {
        Frame f = new Frame("The Window to the world");
        f.setSize(300, 200);
        f.setLocation(450,250);
        f.setVisible(true);
    }
}
