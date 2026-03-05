package com.saki.linkedin.advancedjava.concurrency;

import java.io.IOException;

public class ThreadExample {

    static class BackgroundTimer extends Thread {

        private int seconds;

        public BackgroundTimer(int seconds) {
            this.seconds = seconds;
        }

        @Override
        public void run() {
            for ( int i = seconds; i > 0; i--){
                System.out.println("Seconds left: " + i + " seconds: ");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println("Timer was interrupted");
                    return;
                }
            }// loop end

            System.out.println("Time is up!");
        }

    }

    public static void main(String[] args) throws IOException {
        BackgroundTimer timer = new BackgroundTimer(10);
        timer.start();

        System.out.println("Timer started: Press Enter to stop early.");
        System.in.read();

        if(timer.isAlive()){
            timer.interrupt();
            System.out.println("Timer stopped early");
        }
    }
}
