package com.hillel.composition;

import com.hillel.Inheritance.Colored;

/**
 * Created by Mfarsikov on 24.04.2015.
 */
public class Person implements Namable, Comparable<Person>{

    String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}