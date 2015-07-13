package com.hillel.advancedOOP.factory;

import com.hillel.advancedOOP.factory.chicago.ChicagoPizzaCreator;
import com.hillel.advancedOOP.factory.ny.NyPizzaCreator;
import com.hillel.advancedOOP.factory.simpleFactory.SimplePizzaStore;

/**
 * Created by ANikitiuk on 13.07.2015.
 */
public class FactoryMain {
    public static void main(String[] args) {
        IngredientCreator nyIngredientCreator =  new NyIngredientCreator();
        PizzaStoreWithAbstractFactory nyPizzaStore = new PizzaStoreWithAbstractFactory(nyIngredientCreator);

        System.out.println(nyPizzaStore.orderPizza(PizzaType.CHEESE));

        IngredientCreator chicagoIngredientCreator =  new ChicagoIngredientCreator();
        PizzaStoreWithAbstractFactory chicagoPizzaStore = new PizzaStoreWithAbstractFactory(chicagoIngredientCreator);

        System.out.println(chicagoPizzaStore.orderPizza(PizzaType.CHEESE));
    }

    private static void factoryMethodExample() {
        PizzaStore nyPizzaStore = new PizzaStore(new NyPizzaCreator());

        PizzaStore chicagoPizzaStore = new PizzaStore(new ChicagoPizzaCreator());

        System.out.println(nyPizzaStore.orderPizza(PizzaType.SEAFOOD));

        System.out.println(chicagoPizzaStore.orderPizza(PizzaType.SEAFOOD));
    }

    private static void simpleFactoryExample() {
        SimplePizzaStore store = new SimplePizzaStore();

        System.out.println(store.orderPizza(PizzaType.CHEESE));
        System.out.println();
        System.out.println(store.orderPizza(PizzaType.SEAFOOD));
    }
}
