package com.hillel.advancedOOP.factory.ny;

import com.hillel.advancedOOP.factory.Pizza;
import com.hillel.advancedOOP.factory.PizzaCreator;
import com.hillel.advancedOOP.factory.PizzaType;
import com.hillel.advancedOOP.factory.ny.NyCheesePizza;
import com.hillel.advancedOOP.factory.ny.NySeafoodPizza;

/**
 * Created by ANikitiuk on 13.07.2015.
 */
public class NyPizzaCreator implements PizzaCreator {
    public Pizza createPizza(PizzaType pizzaType){
        Pizza pizza = null;
        switch (pizzaType){
            case SEAFOOD:
                pizza = new NySeafoodPizza();
                break;
            case CHEESE:
                pizza = new NyCheesePizza();
                break;
            default:
                throw new IllegalArgumentException(pizzaType.toString());
        }
        return pizza;
    }
}
