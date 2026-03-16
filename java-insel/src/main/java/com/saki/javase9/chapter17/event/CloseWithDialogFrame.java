package com.saki.javase9.chapter17.event;

import javax.swing.*;

public class CloseWithDialogFrame {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.add( new JLabel("Cyclones bring rain!") );
        f.pack();
        f.addWindowListener(new DialogWindowClosingListener());
        f.setVisible(true);

    }
}
