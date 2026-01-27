package com.saki.java.chapter03;

import javax.swing.*;
import java.util.logging.Logger;

/**
 * example for Null Check to avoid NPE
 */
public class NullCheck {

    private static final Logger logger = Logger.getLogger(NullCheck.class.getName());

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Eingabe");
        if (s != null && !s.isEmpty()) {
            logger.info("Eingabe lautet: " + s);
        } else {
            logger.info("Eingabe ist null, leer oder wurde abgebrochen");
        }
    }
}
