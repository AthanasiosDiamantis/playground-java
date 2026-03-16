package com.saki.javase9.chapter17.event.withadapter;

import javax.swing.*;

public class CloseWithDialogFrame2 {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.add(new JLabel("Cyclones keep on raining a lot"));
        f.addWindowListener(new DialogWindowClosingListener2());
        f.pack();
        f.setVisible(true);
    }
}
