package com.hillel.advancedOOP.duck;

import com.hillel.advancedOOP.fly.FlyNoWay;
import com.hillel.advancedOOP.quack.Quack;

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
