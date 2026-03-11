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

    /**
     * initializes the timer and starts the timer
     */
    private void startTimer() {
        int minutes = minutesSlider.getValue();

        // in case the timer is not null and running
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }

        // converts the entered minutes to milliseconds
        endTimeMillis = System.currentTimeMillis() + minutes * 60 * 1000L;

        // blocks use of functions while time is running
        startButton.setEnabled(false);
        minutesSlider.setEnabled(false);
        minutesTextField.setEnabled(false);

        // creates a Timer with following parameters:
        // 1. the initial and in between delay of the timer
        // 2. an actionListener using updateTimer() every delay of parameter 1
        timer = new Timer(1000, e -> updateTimer());
        timer.setInitialDelay(0);
        timer.start();
    }

    /**
     * responsible for timer countdown
     */
    private void updateTimer() {
        long remainingMillis = endTimeMillis - System.currentTimeMillis();

        // stops timer at 0 or less
        if (remainingMillis <= 0) {
            timer.stop();
            remainingMinLabel.setText("0 Sekunden");

            // unblocks the functionality of these methods
            startButton.setEnabled(true);
            minutesSlider.setEnabled(true);
            minutesTextField.setEnabled(true);

            // creates a simple beep sound of the implemented toolkit
            Toolkit.getDefaultToolkit().beep();
            // opens a dialoge box at the end of countdown
            JOptionPane.showMessageDialog(this, "BING!");
            return;
        }

        long totalSeconds = remainingMillis / 1000;
        long minutes = totalSeconds / 60;
        long seconds = totalSeconds % 60;

        // puts this text into this JLabel
        remainingMinLabel.setText(minutes + " Min " + seconds + " Sek");

    }
}
