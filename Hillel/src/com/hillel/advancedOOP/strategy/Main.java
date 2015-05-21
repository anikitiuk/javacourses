package com.hillel.advancedOOP.strategy;


import com.hillel.advancedOOP.strategy.fly.Rocket;
import com.hillel.advancedOOP.strategy.duck.*;

/**
 * Created by A.Nikitiuk on 24.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        //ReadheadDuck readheadDuck = new ReadheadDuck(); ==
        Duck readheadDuck = new ReadheadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoy = new DecoyDuck();
        mallardDuck.setFlyBehavior(new Rocket());

        test(readheadDuck);
        test(mallardDuck);
        test(rubberDuck);
        test(decoy);
    }
    public static void test(Duck duck){
        System.out.println(duck.display());
        System.out.println(duck.fly());
        System.out.println(duck.swim());
        System.out.println(duck.quack());
        System.out.println();
    }
}
