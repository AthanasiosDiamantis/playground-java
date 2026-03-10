package com.saki.javainsel17.chapter19;

import javax.swing.*;

public class DrawFirstPanel {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200,200);
        f.add(new DrawPanel());
        f.setVisible(true);
    }
}
