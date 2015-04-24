package com.hillel.advancedOOP.duck;

import com.hillel.advancedOOP.fly.FlyBehavior;
import com.hillel.advancedOOP.fly.FlyNoWay;
import com.hillel.advancedOOP.quack.QuackBehavior;
import com.hillel.advancedOOP.quack.Silence;

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
