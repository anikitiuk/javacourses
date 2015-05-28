package com.hillel.advancedOOP.decorator;

/**
 * Created by ANikitiuk on 28.05.2015.
 */
public abstract class BeverageDecorator extends Beverage {
    Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
