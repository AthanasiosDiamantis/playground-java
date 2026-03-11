package com.saki.javase9.chapter05;

import java.awt.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ParallelPointInitSysnc {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        Point p = new Point();

        Runnable r = () -> {
            int x = (int) Math.random()*1000, y = x;


            while(true) {
                lock.lock();

                p.x = x;
                p.y = y;
                int xc = p.x, yc = p.y;

                if(xc != yc){
                    System.out.println("!Ahh, x=" + xc + ", y=" + yc  );
                }
                lock.unlock();
            }

        };

        new Thread(r).start();
        new Thread(r).start();
    }
}
