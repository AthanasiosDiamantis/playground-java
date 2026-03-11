package com.saki.javase9.chapter17;

import javax.swing.*;
import java.awt.geom.Ellipse2D;

public class TranslucentNonRectFrame {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setUndecorated(true); // user is not able to read headline or change window size
        f.setOpacity(0.5f);// 50% Opacity if os is supporting funktion
        f.setShape(new Ellipse2D.Float(0.0F, 0.0F, 300.0F, 100.0F));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new JTextArea());
        f.setBounds(500, 500, 300, 100);
        f.setVisible(true);

    }
}
