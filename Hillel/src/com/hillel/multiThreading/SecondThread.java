package com.hillel.multiThreading;

import java.time.Instant;

/**
 * Created by ANikitiuk on 18.06.2015.
 */
public class SecondThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        String message = new String("message");
        System.out.println(message);

        int counter = 0;
        while (!Thread.currentThread().isInterrupted() && counter < 10000){
            counter++;
            System.out.println(Thread.currentThread().getName() + Instant.now());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
}
