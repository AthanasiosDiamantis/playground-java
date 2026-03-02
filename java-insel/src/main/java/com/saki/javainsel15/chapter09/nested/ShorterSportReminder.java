package com.saki.javainsel15.chapter09.nested;

import java.util.Timer;
import java.util.TimerTask;

public class ShorterSportReminder {

    static int countSportTasks = 1;

    public static void main(String[] args) {
//        class SportTask extends TimerTask {
//            @Override
//            public void run() {
//                System.out.printf("%d Los Du faule Wurst, mach was!%n", countSportTasks++);
//            }
//        }
        new Timer().scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run() {
                System.out.printf("%d ok, das geht noch kürzer!%n", countSportTasks++);
            }
        }, 0, 1000);
    }
}
