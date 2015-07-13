package com.hillel.advancedOOP.factory;

/**
 * Created by ANikitiuk on 13.07.2015.
 */
public class ChicagoIngredientCreator implements IngredientCreator {
    @Override
    public Dough createDough() {
        return new Dough("Thick");
    }

    @Override
    public Seafood createSeafood() {
        return new Seafood("Fish");
    }

    @Override
    public Cheese createCheese() {
        return new Cheese("Mozarella");
    }
}
