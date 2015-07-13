package com.hillel.advancedOOP.factory.chicago;

import com.hillel.advancedOOP.factory.Cheese;
import com.hillel.advancedOOP.factory.Dough;
import com.hillel.advancedOOP.factory.Pizza;

/**
 * Created by ANikitiuk on 13.07.2015.
 */
public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        setDough(new Dough("Thick"));
        setCheese(new Cheese("Mozarella"));
    }
}
