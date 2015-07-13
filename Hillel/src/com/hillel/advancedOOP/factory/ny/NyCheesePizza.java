package com.hillel.advancedOOP.factory.ny;

import com.hillel.advancedOOP.factory.Cheese;
import com.hillel.advancedOOP.factory.Dough;
import com.hillel.advancedOOP.factory.Pizza;

/**
 * Created by ANikitiuk on 13.07.2015.
 */
public class NyCheesePizza extends Pizza {
    public NyCheesePizza(){
        setDough(new Dough("Thin"));
        setCheese(new Cheese("Parmegano"));
    }
}
