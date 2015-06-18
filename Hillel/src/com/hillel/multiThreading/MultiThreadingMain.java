package com.hillel.multiThreading;

import java.time.Instant;

/**
 * Created by ANikitiuk on 18.06.2015.
 */
public class MultiThreadingMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        SecondThread secondThread = new SecondThread();

        secondThread.start();

        //secondThread.run();

      /*  System.out.println("i'm falling asleep");
        try {
            Thread.sleep(10);
        } catch (InterruptedException ignored) {}
        System.out.println("i've been awaken" + Instant.now());

        secondThread.interrupt();  */

        try {
            secondThread.join();
        } catch (InterruptedException ignored) {}

        System.out.println("end");
    }
}
