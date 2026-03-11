package com.saki.javase9.chapter17;

import javax.swing.*;
import java.awt.*;

public class JLabelDemo {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l = new JLabel("live always first class, otherwise your ancestors will");
        l.setForeground(Color.BLUE);
        frame.add(l);
        frame.pack();
        frame.setVisible(true);
        Thread.sleep(5000);
        l.setText("new Text after 5 Seconds in the box, while box will expand to text size!");
        frame.repaint();

    }
}
