package com.hillel.advancedOOP.factory;

/**
 * Created by ANikitiuk on 13.07.2015.
 */
public class SeafoodPizza extends Pizza {
    public SeafoodPizza(IngredientCreator ingredientCreator) {
        setDough(ingredientCreator.createDough());
        setSeafood(ingredientCreator.createSeafood());
    }
}
