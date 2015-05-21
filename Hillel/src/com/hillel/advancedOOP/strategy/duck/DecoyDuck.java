package com.hillel.advancedOOP.strategy.duck;

import com.hillel.advancedOOP.strategy.fly.FlyNoWay;
import com.hillel.advancedOOP.strategy.quack.Quack;

/**
 * Created by A.Nikitiuk on 24.04.2015.
 */
public class DecoyDuck extends Duck {

    public DecoyDuck(){
        super(new FlyNoWay(), new Quack());
    }

    @Override
    public String display() {
        return "Decoy";
    }
}
