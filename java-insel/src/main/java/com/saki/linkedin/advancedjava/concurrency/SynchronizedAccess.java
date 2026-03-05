package com.saki.linkedin.advancedjava.concurrency;

public class SynchronizedAccess {

    static class SharedCounter {
        private int counter = 0;

        // Watch out, without synchronized the result is always different, because both threads
        // interfere without order to this method
        public synchronized void increment() {
            counter++;
        }

        // Watch out, without synchronized the result is always different, because both threads
        // interfere without order to this method
        public synchronized void decrement() {
            counter--;
        }

        public int getCount() {
            return counter;
        }
    }

    public static void main(String[] args) {
        SharedCounter sharedCounter = new SharedCounter();

        Thread threadIncrement = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                sharedCounter.increment();
            }
        });

        Thread threadDecrement = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                sharedCounter.decrement();
            }
        });

        threadIncrement.start();
        threadDecrement.start();

        try {
            threadDecrement.join();
            threadIncrement.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread was interrupted");
        }

        System.out.println("Both threads finished");
        System.out.println("counter = " + sharedCounter.getCount());
    }
}
