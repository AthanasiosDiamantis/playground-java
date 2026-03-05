package com.saki.javainsel17.chapter17.thread;

public class ThreadusInterruptus {

    public static void main(String[] args) throws InterruptedException {
        Runnable killingMeSoftly = () -> {
            System.out.println("There is a life before death.");
                    while( !Thread.currentThread().isInterrupted() ) {
                        System.out.println("It runs, and runs, and runs, and runs:");

                        try{
                            Thread.sleep(500);
                        }
                        catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            System.out.println("Interruption in sleep().");
                        }
                    } // end while
            System.out.println("This is the end, beautiful friend.");
        };

        Thread t = new Thread(killingMeSoftly);
        t.start();
        Thread.sleep(3000);
        t.interrupt(); // switches only the flag within the t-Thread of isInterrupter() to true, there are no other
        // consequences
    }
}
