package com.hillel.advancedOOP.strategy.fly;

/**
 * Created by A.Nikitiuk on 24.04.2015.
 */
public class Rocket implements FlyBehavior {
    @Override
    public String fly() {
        return "I am flyiiing on the rocket";
    }
}
