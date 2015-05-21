package com.hillel.advancedOOP.strategy.duck;

import com.hillel.advancedOOP.strategy.fly.Fly;
import com.hillel.advancedOOP.strategy.quack.Quack;

/**
 * Created by A.Nikitiuk on 24.04.2015.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new Fly(), new Quack());
    }

    @Override
    public String display() {
        return "Mallard duck";
    }
}
