package com.hillel.advancedOOP.factory.chicago;

import com.hillel.advancedOOP.factory.Pizza;
import com.hillel.advancedOOP.factory.PizzaCreator;
import com.hillel.advancedOOP.factory.PizzaType;
import com.hillel.advancedOOP.factory.chicago.ChicagoCheesePizza;
import com.hillel.advancedOOP.factory.chicago.ChicagoSeafoodPizza;

/**
 * Created by ANikitiuk on 13.07.2015.
 */
public class ChicagoPizzaCreator implements PizzaCreator {
    public Pizza createPizza(PizzaType pizzaType){
        Pizza pizza = null;
        switch (pizzaType){
            case SEAFOOD:
                pizza = new ChicagoSeafoodPizza();
                break;
            case CHEESE:
                pizza = new ChicagoCheesePizza();
                break;
            default:
                throw new IllegalArgumentException(pizzaType.toString());
        }
        return pizza;
    }
}
