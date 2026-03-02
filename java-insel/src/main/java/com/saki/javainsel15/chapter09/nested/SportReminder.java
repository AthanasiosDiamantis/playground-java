package com.saki.javainsel15.chapter09.nested;

import java.util.Timer;
import java.util.TimerTask;

public class SportReminder {
    static int countSportTasks = 1;
    public static void main(String[] args) {

        class SportReminderTask extends TimerTask {
            @Override
            public void run() {
                countSportTasks++;
                System.out.printf("%d Los, beweg Dich, Du faule Wurst! Ich bin : %s%n", countSportTasks, this.toString());
            }
        }
        new Timer().scheduleAtFixedRate(new SportReminderTask(), 0, 1000);
    }
}
