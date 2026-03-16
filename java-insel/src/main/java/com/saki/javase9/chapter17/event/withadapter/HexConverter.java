package com.saki.javase9.chapter17.event.withadapter;

import javax.swing.*;
import java.awt.*;
import java.util.Optional;
import java.util.regex.Pattern;

public class HexConverter {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        final JTextField decTextField = new JTextField();
        decTextField.setColumns(8);
        frame.add(decTextField);
        frame.add(new JLabel("is hexadecimal "));

        final JTextField hexTextField = new JTextField();
        hexTextField.setColumns(10);
        frame.add(hexTextField);

        JButton convertOkButton = new JButton("Convert");
        frame.add(convertOkButton);

        convertOkButton.addActionListener(e -> Optional.of(decTextField.getText())
                .filter(Pattern.compile("\\d+").asPredicate() )
                .map(Integer::parseInt)
                .map(Integer::toHexString)
                .ifPresent(hexTextField::setText));

        frame.pack();
        frame.setVisible(true);
    }
}
