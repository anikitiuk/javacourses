package com.hillel.advancedOOP.quack;

/**
 * Created by A.Nikitiuk on 24.04.2015.
 */
public class Silence implements QuackBehavior {
    @Override
    public String quack() {
        return "<silence>";
    }
}
