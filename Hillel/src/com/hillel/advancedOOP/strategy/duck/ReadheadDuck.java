package com.hillel.advancedOOP.strategy.duck;

import com.hillel.advancedOOP.strategy.fly.Fly;
import com.hillel.advancedOOP.strategy.quack.Quack;

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
