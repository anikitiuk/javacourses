package com.hillel.oopBasics;

import java.util.Arrays;

/**
 * Created by A.Nikitiuk on 10.04.2015.
 */
public class Cat {
    static final int pawCount = 4;
    private String name;
    private int age;
    private String vaccines[] = new String[10];
    private int vaccineCount = 0;
    private String ownerName;

    public Cat() {

    }

    public Cat(String name) {
        this(name, 0);
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter'û
    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    //setter'û
    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String toString() {
        String result = "Cat ";
        result += name + ", ";
        if (age == 1) {
            result += age + " year";
        } else {
            result += age + " years";
        }
        result += ", vaccines: " + Arrays.toString(vaccines);
        return result;
    }

    public void acceptVaccine(String vaccine) {
        vaccines[vaccineCount] = vaccine;
        vaccineCount++;
    }

    public static int pawCount() {
        return pawCount;
    }

    public boolean equals(Object other) {
        if (other instanceof Cat) {
            Cat otherCat = (Cat) other;
            if (this.age != otherCat.age) {
                return false;
            }
            if (!this.name.equals(otherCat.name)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
}
