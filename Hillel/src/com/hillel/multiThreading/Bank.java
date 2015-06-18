package com.hillel.multiThreading;

/**
 * Created by ANikitiuk on 18.06.2015.
 */
public class Bank {
    private int account1 = 50_000;
    private int account2 = 50_000;

    @Override
    public String toString() {
        return "Bank{" +
                "account1=" + account1 +
                ", account2=" + account2 +
                ", sum = " + (account1+account2) +
                '}';
    }

    public void transaction(boolean operation, int amount){
        if(operation){
            account1 -= amount;
            account2 += amount;
        }else {
            account2 -= amount;
            account1 += amount;
        }

    }
}
