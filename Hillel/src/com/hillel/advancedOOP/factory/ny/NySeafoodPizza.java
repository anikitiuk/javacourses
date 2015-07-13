package com.hillel.advancedOOP.factory.ny;

import com.hillel.advancedOOP.factory.Dough;
import com.hillel.advancedOOP.factory.Pizza;
import com.hillel.advancedOOP.factory.Seafood;

/**
 * Created by ANikitiuk on 13.07.2015.
 */
public class NySeafoodPizza extends Pizza {
    public NySeafoodPizza(){
        setDough(new Dough("Thin"));
        setSeafood(new Seafood("Oysters"));
    }
}
