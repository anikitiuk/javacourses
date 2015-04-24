package com.hillel.composition;

/**
 * Created by A.Nikitiuk on 24.04.2015.
 */
public class Employee implements Namable {
    String department;
    //Person person;
    Person person = new Person();

    @Override
    public String getName(){
        return person.name;
    }
}
