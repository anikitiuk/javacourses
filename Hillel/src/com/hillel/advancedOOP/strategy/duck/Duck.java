package com.hillel.advancedOOP.strategy.duck;

import com.hillel.advancedOOP.strategy.fly.FlyBehavior;
import com.hillel.advancedOOP.strategy.quack.QuackBehavior;

/**
 * Created by A.Nikitiuk on 24.04.2015.
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public String fly() {
        return flyBehavior.fly();
    }

    public String quack() {
        return quackBehavior.quack();
    }

    public String swim() {
        return "I'm swimming";
    }

    public abstract String display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
