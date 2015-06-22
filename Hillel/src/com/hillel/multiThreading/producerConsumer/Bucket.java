package com.hillel.multiThreading.producerConsumer;

/**
 * Created by ANikitiuk on 22.06.2015.
 */
public class Bucket {
    private volatile int count;
    private static int maxCount = 50;

    public void put(){
        synchronized (this) {
            while (count == maxCount) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    return;
                }
            }
            System.out.println("produced: " + count);
            count++;
            notify();
        }
    }

    public synchronized void get(){
        while (count == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                return;
            }
        }
        System.out.println("consumed: "+ count);
        count--;
        notify();
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "count=" + count +
                '}';
    }
}
