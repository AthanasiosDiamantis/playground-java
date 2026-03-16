package com.saki.javase9.chapter17.event.withadapter;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogWindowClosingListener2 extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        int option = JOptionPane.showConfirmDialog(null, "do you want to end application and close window?");

        if (option == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }

}
