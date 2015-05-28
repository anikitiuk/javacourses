package com.hillel.advancedOOP.decorator;

/**
 * Created by ANikitiuk on 28.05.2015.
 */
public class Robusta extends Beverage {
    @Override
    public int cost() {
        return 90;
    }

    @Override
    public String description() {
        return "Robusta";
    }
}
