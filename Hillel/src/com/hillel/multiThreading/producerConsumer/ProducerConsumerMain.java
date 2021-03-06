package com.hillel.multiThreading.producerConsumer;

/**
 * Created by ANikitiuk on 22.06.2015.
 */
public class ProducerConsumerMain {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();

        Producer producer = new Producer(bucket);
        Consumer consumer = new Consumer(bucket);

        producer.start();
        consumer.start();

        try {
            Thread.currentThread().sleep(10);
        } catch (InterruptedException e) {}

        producer.interrupt();
        consumer.interrupt();

        synchronized (bucket){
            bucket.notifyAll();
        }

        try {
            producer.join();
            System.out.println("producer joined");
        } catch (InterruptedException e) {}

        try {
            consumer.join();
            System.out.println("consumer joined");
        } catch (InterruptedException e) {}

        System.out.println(bucket);
    }
}
