package com.hillel.advancedOOP.factory;

/**
 * Created by ANikitiuk on 13.07.2015.
 */
public class CheesePizza extends Pizza {
    public CheesePizza(IngredientCreator ingredientCreator){
        setDough(ingredientCreator.createDough());
        setCheese(ingredientCreator.createCheese());
    }
}
