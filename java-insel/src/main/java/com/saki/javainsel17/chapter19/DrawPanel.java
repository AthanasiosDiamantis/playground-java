package com.saki.javainsel17.chapter19;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(10,10,100,50);
        g.drawLine(100,10,100,50);
    }
}
