package com.hillel.advancedOOP.factory;

import com.hillel.advancedOOP.factory.Cheese;
import com.hillel.advancedOOP.factory.Dough;
import com.hillel.advancedOOP.factory.IngredientCreator;
import com.hillel.advancedOOP.factory.Seafood;

/**
 * Created by ANikitiuk on 13.07.2015.
 */
public class NyIngredientCreator implements IngredientCreator {
    @Override
    public Dough createDough() {
        return new Dough("Thin");
    }

    @Override
    public Seafood createSeafood() {
        return new Seafood("Oyster");
    }

    @Override
    public Cheese createCheese() {
        return new Cheese("Parmegano");
    }
}
