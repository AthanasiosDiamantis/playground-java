package com.saki.javainselse9.chapter17;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class ClockApplication {

    public static void main(String[] args) {
        JFrame f = new JFrame("Uhrzeit");
        f.setLocationByPlatform(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(250,100);
        f.add(new JLabel(String.format("%tT", new Date())));
        f.setVisible(true);
    }
}
