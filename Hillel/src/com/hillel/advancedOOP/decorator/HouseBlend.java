package com.hillel.advancedOOP.decorator;

/**
 * Created by ANikitiuk on 28.05.2015.
 */
public class HouseBlend extends Beverage {
    @Override
    public int cost() {
        return 95;
    }

    @Override
    public String description() {
        return "HouseBlend";
    }
}
