package com.hillel.advancedOOP.factory.simpleFactory;

import com.hillel.advancedOOP.factory.Cheese;
import com.hillel.advancedOOP.factory.Dough;
import com.hillel.advancedOOP.factory.Pizza;

/**
 * Created by ANikitiuk on 13.07.2015.
 */
public class CheesePizza extends Pizza {
    public CheesePizza() {
        setCheese(new Cheese("Rockfor"));
        setDough(new Dough("Thick"));
    }
}
