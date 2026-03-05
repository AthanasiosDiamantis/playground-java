package com.saki.linkedin.advancedjava.concurrency;

public class ConcurrencyIntro {

    static class NumberPrinter implements Runnable {
        private String threadName;

        public NumberPrinter(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            for ( int i = 0; i < 50; i++) {
                System.out.println(threadName + ": " + i);
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new NumberPrinter("Thread 1"));
        Thread thread2 = new Thread(new NumberPrinter("Thread 2"));

        thread1.start(); // start the first thread1
        thread2.start(); // start the second thread2

        try {
            thread1.join(); // wait for thread1 to finish
            thread2.join(); // wait for thread2 to finish
        } catch (InterruptedException e) {
            System.err.println(" An interruption error occurred main thread ends with message: " + e.getMessage());
        }

        System.out.println("End of 2 Threads");
    }
}
