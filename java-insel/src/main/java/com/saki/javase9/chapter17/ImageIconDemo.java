package com.saki.javase9.chapter17;

import javax.swing.*;
import java.awt.*;
import java.beans.JavaBean;
import java.net.URL;

public class ImageIconDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // button 1
        URL resource1 = ImageIconDemo.class.getResource("/images/IMG_2030_Saki.jpeg");
        URL resource2 = ImageIconDemo.class.getResource("/images/IMG_1292_Kinga_Leo.jpeg");
        assert resource1 != null;
        Icon icon1 = new ImageIcon(resource1);
        assert resource2 != null;
        Icon icon2 = new ImageIcon(resource2);

        JButton button = new JButton();
        button.setIcon(icon1);
        frame.add(button);
        frame.add(new JLabel(icon2));

        frame.pack();
        frame.setVisible(true);

    }
}
