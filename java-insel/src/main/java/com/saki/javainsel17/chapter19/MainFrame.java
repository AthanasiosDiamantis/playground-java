package com.saki.javainsel17.chapter19;

import javax.swing.*;

public class MainFrame  extends JFrame {

    public MainFrame() {
        setTitle("My first SWING-GUI");
        setSize(600, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new JLabel("Hello GUI-World"));

        setVisible(true);
    }
}
