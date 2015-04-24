package com.hillel.advancedOOP.duck;

import com.hillel.advancedOOP.fly.Fly;
import com.hillel.advancedOOP.fly.FlyBehavior;
import com.hillel.advancedOOP.quack.Quack;
import com.hillel.advancedOOP.quack.QuackBehavior;

/**
 * Created by A.Nikitiuk on 24.04.2015.
 */
public class ReadheadDuck extends Duck {
    public ReadheadDuck() {
        super(new Fly(), new Quack());
    }

    @Override
    public String display() {
        return "Readhead duck";
    }
}
