package com.hillel.advancedOOP.strategy.fly;

/**
 * Created by A.Nikitiuk on 24.04.2015.
 */
public class Fly implements FlyBehavior {
    @Override
    public String fly() {
        return "I'm flying";
    }
}
