package com.hillel.advancedOOP.factory.simpleFactory;

import com.hillel.advancedOOP.factory.Pizza;
import com.hillel.advancedOOP.factory.PizzaType;

/**
 * Created by ANikitiuk on 13.07.2015.
 */
public class SimplePizzaCreator {
    public Pizza createPizza(PizzaType pizzaType){
        Pizza pizza = null;
        switch (pizzaType){
            case SEAFOOD:
                pizza = new SeafoodPizza();
                break;
            case CHEESE:
                pizza = new CheesePizza();
                break;
            default:
                throw new IllegalArgumentException(pizzaType.toString());
        }
        return pizza;
    }
}
