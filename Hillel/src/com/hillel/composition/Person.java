package com.hillel.composition;

/**
 * Created by A.Nikitiuk on 24.04.2015.
 */
public class Person implements Namable {
    String name;

    @Override
    public String getName() {
        return name;
    }
}
