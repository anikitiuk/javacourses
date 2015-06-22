package com.hillel.multiThreading.producerConsumer;

/**
 * Created by ANikitiuk on 22.06.2015.
 */
public class Consumer extends Thread{
    private Bucket bucket;

    public Consumer(Bucket bucket) {
        this.bucket = bucket;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            bucket.get();
        }
    }
}
