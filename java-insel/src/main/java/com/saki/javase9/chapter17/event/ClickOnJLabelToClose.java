package com.saki.javase9.chapter17.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClickOnJLabelToClose {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("keep on living like a King, otherwise your ancestors will!");
        label.setForeground(Color.BLUE);
        f.add(label);

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int clickCount = e.getClickCount();
                if (clickCount > 1) {
                    System.exit(0);
                }
            }
        });
        f.pack();
        f.setVisible(true);
    }
}
