package com.saki.javase9.chapter17.swing;

import javax.swing.*;
import java.awt.*;

public class Tooltip {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        String text = "<html>Ich brauch' Hilfe.<p>Schell!</html>";
        JButton button = new JButton(text);
        String help = "<html>Hier ist sie, die <b>Hilfe:</b>"+
                "<ul><li>Cool belieben<li>Handbuch lesen</ul></html>";
        button.setToolTipText(help);
        frame.add(button);
        frame.setSize(250, 250);
        frame.setVisible(true);
    }
}
