package com.hillel.advancedOOP.factory.simpleFactory;

import com.hillel.advancedOOP.factory.Dough;
import com.hillel.advancedOOP.factory.Pizza;
import com.hillel.advancedOOP.factory.Seafood;

/**
 * Created by ANikitiuk on 13.07.2015.
 */
public class SeafoodPizza extends Pizza {
    public SeafoodPizza(){
        setDough(new Dough("Thick"));
        setSeafood(new Seafood("Fish"));
    }
}
