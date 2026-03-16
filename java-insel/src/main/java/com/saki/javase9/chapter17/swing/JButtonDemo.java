package com.saki.javase9.chapter17.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        // Button 1
        final Icon icon1 = new ImageIcon(
                JButtonDemo.class.getResource("/images/IMG_1292_Kinga_Leo.jpeg"));
        final Icon icon2 = new ImageIcon(
                JButtonDemo.class.getResource("/images/IMG_2030_Saki.jpeg"));


        final JButton button1 = new JButton(icon1);
        frame.add(button1);

        ActionListener al = e -> button1.setIcon(icon2);
        button1.addActionListener(al);

        // Button 2
        JButton button2 = new JButton("End");
        frame.add(button2);

        button2.addActionListener(e -> System.exit(0));

        frame.pack();
        frame.setVisible(true);

    }
}
