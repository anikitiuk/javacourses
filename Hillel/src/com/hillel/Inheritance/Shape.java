package com.hillel.Inheritance;

/**
 * Created by A.Nikitiuk on 22.04.2015.
 */
public abstract class Shape extends Object implements Colored {
    public abstract int getArea();

    @Override
    public String toString(){
        return "area is " + getArea();
    }
}
