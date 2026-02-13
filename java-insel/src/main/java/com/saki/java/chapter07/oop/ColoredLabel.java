package com.saki.java.chapter07.oop;

import javax.swing.*;
import java.awt.*;

public class ColoredLabel extends JLabel {

    public ColoredLabel() {
        initialize(Color.BLACK);
    }

    public ColoredLabel(String label) {
        super(label);
        initialize(Color.BLACK);
    }

    public ColoredLabel(String label, Color color) {
        super(label);
        initialize(color);
    }

    private void initialize(Color color) {
        setForeground(color);
    }


}
