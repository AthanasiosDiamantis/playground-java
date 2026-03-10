package com.saki.javainsel17.chapter19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Bee extends JFrame {

    public Bee() {
        setSize(500, 100);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g){
        g.drawString(" \"Maja, wo bist Du?\" (Mittermeier)", 120,60);
    }


    public static void main(String[] args) {
        new Bee().setVisible(true);
    }
}
