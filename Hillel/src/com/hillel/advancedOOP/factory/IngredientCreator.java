package com.hillel.advancedOOP.factory;

/**
 * Created by ANikitiuk on 13.07.2015.
 */
public interface IngredientCreator {
    Dough createDough();
    Seafood createSeafood();
    Cheese createCheese();
}
