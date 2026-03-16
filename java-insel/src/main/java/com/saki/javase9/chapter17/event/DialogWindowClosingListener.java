package com.saki.javase9.chapter17.event;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class DialogWindowClosingListener implements WindowListener {


    @Override
    public void windowClosing(WindowEvent event) {
        int option = JOptionPane.showConfirmDialog(null, "do you want close/end the APP?");
        if(option == JOptionPane.OK_OPTION){
            System.exit(0);
        }

    }

    @Override
    public void windowOpened(WindowEvent e) {
        /*Empty*/
    }

    @Override
    public void windowClosed(WindowEvent e) {
        /*Empty*/
    }

    @Override
    public void windowIconified(WindowEvent e) {
        /*Empty*/
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        /*Empty*/
    }

    @Override
    public void windowActivated(WindowEvent e) {
        /*Empty*/
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        /*Empty*/
    }
}
