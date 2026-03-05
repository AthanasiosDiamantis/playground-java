package com.saki.javainsel17.chapter17.thread;

import java.time.LocalDate;

public class JoinTheThread {

    public static void main(String[] args) throws InterruptedException {

        class JoinerRunnable implements Runnable {
            public int result;

            @Override
            public void run() {
                result = LocalDate.now().getDayOfYear();
            }
        }

        JoinerRunnable runnable = new JoinerRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();
        System.out.println("the result of the JoinerRunnble-run()-Result = " + runnable.result);

    }
}
