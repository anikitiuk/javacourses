package com.hillel.advancedOOP.factory.chicago;

import com.hillel.advancedOOP.factory.Dough;
import com.hillel.advancedOOP.factory.Pizza;
import com.hillel.advancedOOP.factory.Seafood;

/**
 * Created by ANikitiuk on 13.07.2015.
 */
public class ChicagoSeafoodPizza extends Pizza {
    public ChicagoSeafoodPizza() {
        setSeafood(new Seafood("Fish"));
        setDough(new Dough("Thick"));
    }
}
