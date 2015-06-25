package com.hillel.Inheritance;

/**
 * Created by ANikitiuk on 25.06.2015.
 */
public class Manager extends Employee {
    public Manager(String name, String department) {
        super(name, department);
    }

    public void makeCoffee(){
        System.out.println("I'm making coffee");
    }
}
