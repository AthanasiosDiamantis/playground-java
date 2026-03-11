package com.saki.javainselse9.chapter17;

import javax.swing.*;
import java.awt.*;

public class YouWontGetMeSmal {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLocation(0, 0);
        f.setResizable(false);// with this method it is not possible to reduce window size
        f.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);


    }
}
