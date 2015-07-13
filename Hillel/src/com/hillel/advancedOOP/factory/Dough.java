package com.hillel.advancedOOP.factory;

/**
 * Created by ANikitiuk on 13.07.2015.
 */
public class Dough {
    String type;

    public Dough(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dough{" +
                "type='" + type + '\'' +
                '}';
    }
}
