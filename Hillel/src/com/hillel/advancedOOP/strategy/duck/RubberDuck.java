package com.hillel.advancedOOP.strategy.duck;

import com.hillel.advancedOOP.strategy.fly.FlyNoWay;
import com.hillel.advancedOOP.strategy.quack.Silence;

/**
 * Created by A.Nikitiuk on 24.04.2015.
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new FlyNoWay(), new Silence());
    }

    @Override
    public String display() {
        return "Rubber duck";
    }
}
