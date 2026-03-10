package com.saki.javainsel17.chapter19;


import javax.swing.*;
import java.awt.*;

public class MyGUIFrame extends JFrame {

    private JPanel rootPanel;
    private JSlider minutesSlider;
    private JTextField minutesTextField;
    private JLabel minutesLabel;
    private JLabel remainingLabel;
    private JButton startButton;
    private JLabel timeToMsgLabel;
    private JLabel remainingMinLabel;
    private JButton exitButton;

    private Timer timer;
    private long endTimeMillis;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        // this Method starts the MyGUIFrame in the special threadsafe SWING-Thread
        SwingUtilities.invokeLater(() -> {
            MyGUIFrame frame = new MyGUIFrame();
            frame.setVisible(true);
        });
    }

    /**
     * constructor creates the application
     */
    public MyGUIFrame() {
        initialize();

    }

    /**
     * Initialize the contents of the frame
     */
    private void initialize() {
        setContentPane(rootPanel);
        setTitle("BING");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);

        minutesSlider.setMinimum(1);
        minutesSlider.setMaximum(30);
        minutesSlider.setValue(1);

        minutesTextField.setColumns(10);
        minutesTextField.setText("1");

//        remainingLabel.;

        minutesSlider.addChangeListener(e -> {
            minutesTextField.setText(String.valueOf(minutesSlider.getValue()));
        });

        minutesTextField.addActionListener(e -> {
            try {
                minutesSlider.setValue(Integer.parseInt(minutesTextField.getText()));
            } catch (NumberFormatException ex) {
                // not good, but don't do nothing
            }
        });

        startButton.addActionListener(e -> startTimer());
        exitButton.addActionListener(e ->  System.exit(0));
    }

    private void startTimer() {
        int minutes = minutesSlider.getValue();


        if (timer != null && timer.isRunning()) {
            timer.stop();
        }

        endTimeMillis = System.currentTimeMillis() + minutes * 60 * 1000L;

        startButton.setEnabled(false);
        minutesSlider.setEnabled(false);
        minutesTextField.setEnabled(false);

        timer = new Timer(1000, e -> updateTimer());
        timer.setInitialDelay(0);
        timer.start();
    }

    private void updateTimer() {
        long remainingMillis = endTimeMillis - System.currentTimeMillis();

        if (remainingMillis <= 0) {
            timer.stop();
            remainingMinLabel.setText("0 Sekunden");

            startButton.setEnabled(true);
            minutesSlider.setEnabled(true);
            minutesTextField.setEnabled(true);


            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "BING!");
            return;
        }

        long totalSeconds = remainingMillis / 1000;
        long minutes = totalSeconds / 60;
        long seconds = totalSeconds % 60;

        remainingMinLabel.setText(minutes + " Min " + seconds + " Sek");

    }
}
