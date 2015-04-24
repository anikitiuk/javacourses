package com.hillel.advancedOOP.duck;

import com.hillel.advancedOOP.fly.Fly;
import com.hillel.advancedOOP.fly.FlyBehavior;
import com.hillel.advancedOOP.quack.Quack;
import com.hillel.advancedOOP.quack.QuackBehavior;

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
