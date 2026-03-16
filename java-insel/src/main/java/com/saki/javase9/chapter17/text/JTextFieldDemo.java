package com.saki.javase9.chapter17.text;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JTextField input = new JTextField("12 * 3 + 2", 20);
        input.addActionListener( new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    input.setText("" +
                            new ScriptEngineManager().getEngineByName("JavaScript") /*! Since Java 15 the Engine Nashorn is not in the jdk any more, thus it is necessary to import the dependency */
                                    .eval(input.getText()) );
                } catch (ScriptException ex) {
                    ex.printStackTrace();
                }
            }
        });
        frame.add(input);
        frame.pack();
        frame.setVisible(true);
    }
}
