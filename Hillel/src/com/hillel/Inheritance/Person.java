package com.hillel.Inheritance;

/**
 * Created by A.Nikitiuk on 22.04.2015.
 */
public class Person extends Object{

    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
