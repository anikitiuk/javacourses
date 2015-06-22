package com.hillel.multiThreading;

import java.util.concurrent.*;

/**
 * Created by ANikitiuk on 22.06.2015.
 */
public class ExecutorMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(2000);
                return 10;
            }
        });

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdownNow();
    }

    private static void executor() {
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("i'm running");
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("i'm interrupted");
                }
            }
        });

        executorService.shutdownNow();
    }
}
